import java.util.Arrays;

public class Sieve {
	public static void main(String[] args) {
		int n = 20;
		int[] sievenumbers = new int[n-1];
		for (int i = 0; i < n -1 ; i++) {
			sievenumbers[i] = i + 2;
			//System.out.print(Arrays.toString(sievenumbers));
		}
		int p = 2;
		String delim ="";
		while (p < n) {
			System.out.print(delim + p);
			for (int i = 0; i < n - 1; i++) {
				if (sievenumbers[i] % p == 0) sievenumbers[i] = 0;
			}
			int temp = p;
			for (int j = 0; j < n -1; j++) {
				if (sievenumbers[j] > p) {
					p = sievenumbers[j];
					break;
				}
			}
			if (temp == p)p = n + 1;
			delim = " ";
		}
		
	}
}
/*public class Sieve {
	public static void main(String[] args){
		int n = 20;
		int[] sieved_numbers = new int[n-1];
		
		for (int i = 0; i < n-1; i++) {
			sieved_numbers[i] = i + 2;
		}
		
		int p = 2;
		boolean firstOutputNumber = true;
		
		while (p < n) {
			// Adding a space only after the first number has been output
			if (firstOutputNumber == false) {
				System.out.print(" ");
			}
			System.out.print(p);
			firstOutputNumber = false;
			
			// Sieve the remaining numbers
			for (int i = 0; i < sieved_numbers.length; i++) {
				if (sieved_numbers[i] % p == 0) {
					sieved_numbers[i] = 0;
				}
			}
			
			// Find next value of p
			boolean found = false;
			for (int i = 0; i < sieved_numbers .length && !found; i++) {
				if (sieved_numbers[i] > p) {
					p = sieved_numbers[i];
					found = true;
				}
			}
			if (!found) {
				p = n + 1;
			}
		}
		System.out.print("\n");
	}

}
*/