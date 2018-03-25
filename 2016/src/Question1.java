import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {
	public static ArrayList<Integer> cayley() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int b = (10 * i) + j;
				if ((i * j) + (i + j) == b) {
					a.add(b);
				}
			}
		}
		return a;
	}

	public static int[] countVowels(String[] vowels) {
		String vowel = "AEIOUaeiou";
		int[] a = new int[vowels.length];
		for (int i = 0; i < vowels.length; i++) {
			int n = 0;
			for (int j = 0; j < vowels[i].length(); j++) {
				if (vowel.contains(vowels[i].charAt(j) + "")) { //contains is a char sequence which is equivalent to string to "" makes it like a String for charAt()
					n++; 
				}
			}
			a[i] = n;
		}
		return a;
	}

	public static String mostVowels(String[] vowels) {
		if (vowels.length == 0) {
			return "";
		}
		int i = 0;
		int[] a = countVowels(vowels);
		for (int j = 0; j < vowels.length; j++) {
			if (a[i] < a[j]) {
				i = j;
			}
		}
		return vowels[i];
	}

	public static void main(String[] args) {
		System.out.println(Question1.cayley());
		System.out.println(Arrays.toString(Question1.countVowels(args)));
		System.out.println(Question1.mostVowels(args));
	}
}
