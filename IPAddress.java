import java.util.Scanner;

class IPAddress{

	int numAddress;

	IPAddress(String address){
		numAddress = Integer.parseInt(address);
	}

	public int getDecimal(){
		int binary = numAddress;
		int decimal = 0;
		int power = 0;
		while (binary != 0){
			int tmp = binary%10;
			decimal += tmp*Math.pow(2, power);
			binary = binary/10;
			power++;
		}
		return decimal;
	}

	public static void main(String[] args){
		String dotted;
		String address;
		Scanner in = new Scanner(System.in);
		address = in.nextLine();
		in.close();
		if(address.length() != 32){
			System.out.println("Error, length of IP address must be 32 bits");
		}
		else{

		IPAddress first = new IPAddress(address.substring(0,8));
		IPAddress second = new IPAddress(address.substring(8,16));
		IPAddress third = new IPAddress(address.substring(16,24));
		IPAddress fourth = new IPAddress(address.substring(24,32));
		dotted = String.valueOf(first.getDecimal());
		dotted += ".";
		dotted += String.valueOf(second.getDecimal());
		dotted += ".";
		dotted += String.valueOf(third.getDecimal());
		dotted += ".";
		dotted += String.valueOf(fourth.getDecimal());

		System.out.println(dotted);

		}
	}
}