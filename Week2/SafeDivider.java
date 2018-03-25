public class SafeDivider {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		double divide = a / b;
		
		if ( b == 0.0) {
			System.out.println("It is undefined");
		}
		else {System.out.println(divide);}
	}
}


