import java.util.Arrays;

public class Rabbit {
	private Integer[][] r;
	private int n;

	public Rabbit(int n) {
		this.n = n;
		this.r = new Integer[n][];
	}

	public void init() {
		r[0] = new Integer[] { 1 };
		r[1] = new Integer[] { 1, 0 };
		for (int i = 2; i < n; i++) {
			r[i] = new Integer[r[i - 1].length + r[i - 2].length];
			for (int j = 0; j < r[i].length; j++) {
				if (j < r[i - 1].length) {
					r[i][j] = r[i - 1][j];
				} else {
					r[i][j] = r[i - 2][j - r[i - 1].length];
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String a = "";
		for (int i = 0; i < r.length; i++) {

			a += "[" + r[i][0];
			for (int j = 1; j < r[i].length; j++) {
				a += ", " + r[i][j];
			}

			if (i == r.length - 1) {
				a += "]";
			} else {
				a += "]\n";
			}

		}
		return a;
	}

	public int subsequenceIndex(Integer[] a) {
		for (int i = 0; i <= r[n - 1].length - a.length; i++) {
			boolean b = true;
			for (int j = 0; j < a.length; j++) {
				if (r[n - 1][i + j] == a[j]) {
					b = b && true;
				} else {
					b = b && false;
				}
			}
			if (b == true) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Rabbit x = new Rabbit(n);
		x.init();
		System.out.println(x.toString());
		System.out.format("%d\n%d", x.subsequenceIndex(new Integer[] { 1, 1, 0 }),
				x.subsequenceIndex(new Integer[] { 1, 1, 1 }));
	}
}
