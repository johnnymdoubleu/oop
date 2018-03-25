public class QuadraticSolver {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double Discrim = Math.sqrt(b * b - 4 * a * c);
		
		double solution1 = (-1 * b + Discrim) / 2 * a;
		double solution2 = (-1 * b - Discrim) / 2 * a;
		
		System.out.println(solution1);
		System.out.println(solution2);
	}
}

