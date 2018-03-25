/*public class ArithematicSeries {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		int total = 0;
		while (i < n) {
			i++;
			total += i;
		}
		System.out.println(total);
	}
}

	public class ArithematicSeries {
		public static void main(String[] args) {
			int n = Integer.parseInt(args[0]);
			int i = 0;
			int total = 0;
			while (i < n) {
				i = i + 1;
				total += i;			
			}
			System.out.println(total);
		}
	}
*/
public class ArithematicSeries {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int result = 0;
		
		while (i > 0) {
			result += i;
			i--;
		}
		System.out.println(result);
	}
}

