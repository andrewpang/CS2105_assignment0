import java.util.*;

class NumberPrinter extends TimerTask {
        double n;
        public NumberPrinter(double toPrint) {
            n = toPrint;
        }
        public void run() {
            System.out.println(n);
        }

        public static void main(String[] args){
         	if(args.length == 3){
	         	float numberToPrint = Float.parseFloat(args[0]);
	         	int startTime = Integer.parseInt(args[1]);
	         	int interval = Integer.parseInt(args[2]);
	         	Timer timer = new Timer();
	         	timer.schedule(new NumberPrinter(numberToPrint), startTime*1000, interval*1000);
	         	Scanner sc = new Scanner(System.in);
	         	while(true){
	         		if(sc.next().equals("q")){
	         			timer.cancel();
	         			break;
	         		}
	         	}
	        }
	        else{
	        	System.out.println("Error, needs 3 arguments");
	        }
         }


}