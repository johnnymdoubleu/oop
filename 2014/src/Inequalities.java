import java.util.Arrays;
import java.util.stream.IntStream;

public class Inequalities {
	public static int dotProduct(int[] a, int[] b) {
		int n = a.length;
		if (b.length == n) {
			int[] c = new int[a.length];
			for (int i = 0; i < n; i++) {
				c[i] = a[i] * b[i];
			}
			int sum = IntStream.of(c).sum(); // sums all the element in an array
			return sum;
		}
		return 0;
	}
	public static int[] concatenate (int[] a, int[] b) {
		int x = a.length + b.length;
		int [] c = new int [x];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = a.length; i < x; i++) {
			c[i] = b [i - a.length];
		}
		return c;
	}
	public static boolean cs(int[] a, int[] b) {
		boolean x = false;
		if (a.length == b.length) {
			int lhs = dotProduct(a, b) * dotProduct(a, b);
			int rhs = dotProduct(a, a) * dotProduct(b, b);
			if (lhs <= rhs) {
				x = true;
			}
		}
		return x;
	}
	public static boolean amgm(int[] a) {
		boolean x = false;
		//OptionalDouble mean = IntStream.of(a).average();
		int sum = IntStream.of(a).sum();
		double AM = sum / ((double) a.length);
		//double GM = Math.pow(((dotProduct(a, a), 1/((double) a.length));
		int result = 1;
		for (int times : a) {
			result *= times;
		}
		double GM = Math.pow(result, 1/ ((double) a.length));
		
		if(AM >= GM) {
			x = true;
		}
		return x;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 1; i < args.length; i++) {
			if (i <= n) {
				a[i - 1] = Integer.parseInt(args[i]);// First n items
			} else {
				b[i - n - 1] = Integer.parseInt(args[i]);// Second n items
			}
		}
		//System.out.println(Arrays.toString(concatenate(a, b)));
		System.out.println("CS held: " + cs(a, b));
		System.out.println("AMGM held: " + amgm(a));
	}
}
