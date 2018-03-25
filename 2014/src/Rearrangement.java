import java.util.Arrays;
import java.util.stream.*;
import java.util.Collections;

public class Rearrangement {
	public static int dotWith(int[] a, int[] b) {
		int n = a.length;
		if (b.length == n) {
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				c[i] = a[i] * b[i];
			}
			int sum = IntStream.of(c).sum(); // sums all the element in an array
			return sum;
		}
		return 0;
	}

	/*public static void rotate(int[] b) {
		/*
		 * for (int i = 0; i < b.length; i++) { rotation[(i + 1) % b.length] =
		 * b[i]; b = rotation; }
		 
		if (b.length != 0) {
			int a = b[0];
			for (int i = b.length-1; i >= 0; i--) {
				if (i == b.length - 1) {
					b[i] = a;
				} else {
					b[i] = b[i + 1];
				}
			}
		}
	}*/
	public static void rotate(int[] b) {
		int temp = b[b.length-1];
		for (int i = b.length-1; i > 0; i--) {
			int t = b[i];
			b[i] = b[i-1];
			b[i-1] = t;
		}
		b[0] = temp;
	}

	public static int useRotations(int[] a, int[] b) {
		int max = 0;
		int current = dotWith(a, b);
		int n = 0;
		if (a.length == b.length) {
			while (n < b.length) {
				n++;
				if (max < current) {
					max = current;
				}
				rotate(b);
				current = dotWith(a, b);
			}
			return max;
		}
		return 0;
	}

	public static int useSorted(int[] a, int[] b) {
		if (a.length == b.length) {
			Arrays.sort(a); // sorts in ascending order
			Arrays.sort(b);
			return dotWith(a, b);
		}
		return 0;
	}

	/*
	 * public static void main(String[] args) { int a =
	 * Integer.parseInt(args[0]); int b = Integer.parseInt(args[1]); int c =
	 * Integer.parseInt(args[2]); int d = Integer.parseInt(args[3]); int e =
	 * Integer.parseInt(args[4]); int [] z = new int[a];
	 * 
	 * }
	 */
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
		//int [] rotate = new int[b.length];
		System.out.println("dotWith gave: " + dotWith(a, b));
		//Rearrangement.useRotations(a, b);
		System.out.println("useRotations gave: " + useRotations(a, b));
		System.out.println("useSorted gave: " + useSorted(a, b));
	}

}
