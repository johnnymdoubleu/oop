public class NMax {
	public static int max(int a, int b, int c){
		return Math.max(a, Math.max(b, c));
	}
	public static double max(double a, double b, double c){
		return Math.max(a, Math.max(b, c));
	}
	public static void main(String[] args){
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		
		int Maximum = max(a, b, c);
		System.out.printf("Maximum value is: " + Maximum);
		
	}

}
//System.out.printf("Maximum value is:" + Maximum);
//System.out.printf("Maximum value is: %s\n", Maximum);