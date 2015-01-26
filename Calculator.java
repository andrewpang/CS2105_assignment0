class Calculator{
	public static void main(String[] args){
		int firstNum;
		int secondNum;
		String symbol;
		int answer;
		if(args.length == 3){
			symbol = args[1];
			try{
				firstNum = Integer.parseInt(args[0]);
				secondNum = Integer.parseInt(args[2]);
				if(symbol.equals("+")){
					answer = firstNum + secondNum;
					System.out.println(firstNum + " + " + secondNum + " = " + answer);
				}
				else if(symbol.equals("-")){
					answer = firstNum - secondNum;
					System.out.println(firstNum + " - " + secondNum + " = " + answer);
				}
				else if(symbol.equals("/")){
					if(secondNum == 0){
						System.out.println("Error in expression");
					}
					else{
						answer = firstNum / secondNum;
						System.out.println(firstNum + " / " + secondNum + " = " + answer);
					}
				}
				else if(symbol.equals("*")){
					answer = firstNum * secondNum;
					System.out.println(firstNum + " * " + secondNum + " = " + answer);
				}
				else{
					System.out.println("Error in expression");
				}
			} catch(NumberFormatException e){
				System.out.println("Error in expression");
			}
		}
		else{
			System.out.println("Error in expression");
		}
	}
}