public class IsTriangular {
	public static boolean isTri(double a, double b, double c){
		if (a >= b + c || b >= a + c || c >= b + a) { 
			return false;
		}
		return true;
			}
	public static void main(String[] args){
		System.out.println("Please input variables...");
		double a = StdIn.readDouble();
		double b = StdIn.readDouble();
		double c = StdIn.readDouble();
		
		if (isTri(a, b, c)) {
			System.out.printf("%.3f, %s and %s could be the lengths of a triangle\n\n", a ,b ,c);
		}
		else {
			System.out.println("Not a Triangle.");
		}
	}
}
