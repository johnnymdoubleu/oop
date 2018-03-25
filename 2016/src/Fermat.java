import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Fermat {

	public static Set<ArrayList<String>> threadings(int n, Set<String> colors) {
		Set<ArrayList<String>> set = new HashSet<ArrayList<String>>();
		// No permutation gives an empty set
		if(n < 1) {
			set.add(new ArrayList<String>());
			return set;
		}
		// One permutation gives set of lists of one color each
		else if(n == 1) {
			for(String col : colors) {
				ArrayList<String> singleList = new ArrayList<String>();
				singleList.add(col);
				set.add(singleList);
			}
			return set;
		}
		// More than one permutation
		else {
			for(String col : colors) {			
				for(ArrayList<String> l : threadings(n-1, colors)) {
					ArrayList<String> list = new ArrayList<String>();
					list.add(col);
					list.addAll(l);
					set.add(list);
				}
			}
			return set;
		}
	}
	
	public static boolean isEquiv(ArrayList<String> one, ArrayList<String> two) {
		// Go through all the possible beginnings of two
		for(int n = 0; n < two.size(); n++) {
			// Rotate
			ArrayList<String> two_rotated = new ArrayList<String>(two);
			Collections.rotate(two_rotated, n);
			// Revers
			ArrayList<String> two_rotated_reversed = new ArrayList<String>(two_rotated);
			Collections.reverse(two_rotated_reversed);
			
			// Check for equality for both (accounting for one == two (when n = 0)
			if(one.equals(two_rotated) || one.equals(two_rotated_reversed)) {
				return true;
			}
		}
		// If none returns true, return false
		return false;
	}
	
	public static void analyse(Set<ArrayList<String>> s) {
		for(ArrayList<String> one : s) {
			int eqTo = 0;
			for(ArrayList<String> other : s) {
				if(isEquiv(one, other)) {
					eqTo++;
				}
			}
			if(eqTo == 1) System.out.format("%s is a singleton%n", one.toString());
		}
	}
	
	public static void main(String[] args) {
		// Build n and hashset
		int n = 0;
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < args.length; i++) {
			if(i == 0) {
				n = Integer.parseInt(args[i]);
			} else {
				set.add(args[i]);
			}
		}
		// Run
		analyse(threadings(n, set));
	}
	
}