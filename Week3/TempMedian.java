import java.util.Arrays;

public class TempMedian {
	public static void main(String[] args){
		int n = args.length;
		int[] dataset = new int[n];
		String[] s = {".", "+", "-"};
		
		dataset[0] = Integer.parseInt(args[0]);
		for (int i = 1; i < n; i++) {
			String c = args[i];
			if (c.equals(s[0])) {
				dataset[i] = dataset[i-1];
			}
			if (c.equals(s[1])) {
				dataset[i] = dataset[i-1] + 1;
			}
			if (c.equals(s[2])) {
				dataset[i] = dataset[i-1] - 1;
			}
		}
		System.out.print(dataset[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + dataset[i]);
		}
		System.out.print("\n");
		
		Arrays.sort(dataset);
		System.out.print(dataset[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + dataset[i]);
		}
		System.out.print("\n");
		
		double median;
		
		if (dataset.length % 2 == 1) {
			median = dataset[(n + 1) / 2 - 1];
		}
		else {
			median = (dataset[n /2 ] + dataset[ n / 2 -1]) / 2.0;
		}
		
		System.out.println(median);
	}
}
