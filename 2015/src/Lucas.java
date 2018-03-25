import java.util.Arrays;

public class Lucas {
	private static long[] lucas;
	private static double phiPlus = (Math.sqrt(5) + 1) / 2;
	private static double phiMinus = (Math.sqrt(5) - 1) / 2;

	public static void upto(int n) {
		if (n >= 2) {
			lucas = new long[n];
			lucas[0] = 2L;
			lucas[1] = 1L;
			for (int i = 2; i < n; i++) {
				lucas[i] = lucas[i - 1] + lucas[i - 2];
			}
		}
	}

	public static void primes() {
		System.out.println("L(0)=2");
		for (int i = 2; i < lucas.length; i++) {
			boolean a = true;
			for (int j = 2; j < lucas[i] - 1; j++) {
				if (lucas[i] % j != 0) {
					a = a && true;
				} else {
					a = a && false;
				}
			}
			if (a == true) {
				System.out.println("L(" + i + ")=" + lucas[i]);
			}
		}
	}

	public static double maxDiffClosedForm() {
		double[] phi = new double[lucas.length];
		for (int i = 0; i < phi.length; i++) {
			phi[i] = Math.pow(phiPlus, i) + Math.pow(-1 * phiMinus, i);
		}
		double[] difference = new double[lucas.length];
		for (int i = 0; i < difference.length; i++) {
			difference[i] = Math.abs(lucas[i] - phi[i]);
		}
		Arrays.sort(difference);
		return difference[difference.length - 1];
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n >= 2 && n <= 42) {
			upto(n);
			primes();
			System.out.printf("%.15f", maxDiffClosedForm());
		}
	}
}

/*
 * public class Lucas { public static long[] lucas; public static double phiPlus
 * = (Math.sqrt(5) + 1)/2; public static double phiMinus = (Math.sqrt(5) - 1)/2;
 * 
 * public static void upto(int n) { lucas = new long[n + 1]; lucas[0] = 2;
 * lucas[1] = 1; for (int i = 2; i < n + 1; i++) { lucas[i] = lucas[i - 1] +
 * lucas[i - 2]; } }
 * 
 * public static boolean isPrime(long mb) { if(mb == 2) { return true; } if (mb
 * == 0 || mb == 1 || mb%2 == 0) { return false; } for (int x = (int) (mb-1); x
 * > 2; x--) { if(mb%x == 0) { return false; } } return true; }
 * 
 * public static void primes() { for (int i = 0; i < lucas.length; i++) {
 * if(isPrime(lucas[i])) { System.out.println("L(" + i + ")=" + lucas[i]); } } }
 * 
 * public static double maxDiffClosedForm() { double max = 0; double a; long b;
 * for (int i = 0; i < lucas.length; i++) { b= lucas[i]; a = Math.pow(phiPlus,
 * i) +((Math.pow(-1 * phiMinus, i))); double diff = Math.abs(a - b); if (diff >
 * max) { max = diff; } } return max; }
 * 
 * 
 * 
 * public static void main(String[] args) { if ((Integer.parseInt(args[0]) >= 2)
 * && (Integer.parseInt(args[0]) <= 42)) { upto(Integer.parseInt(args[0]));
 * primes(); System.out.printf("%.15f", (maxDiffClosedForm())); } } }
 */