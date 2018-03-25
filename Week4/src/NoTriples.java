public class NoTriples {
	public static boolean noTriples(int[] nums) {
		boolean noTriples = true;
		if (nums.length >= 3) {
			int n = nums[0];
			int count = 1;
			for (int i = 1; i < nums.length; i++) {
				if (n == nums[i]) {
					count++;
					if (count == 3) {
						noTriples = false;
						break;
					}
				}
				else {
					n = nums [i];
					count = 1;
				}
			}
		}
		return noTriples;
	}
}


/*public class NoTriples {
	public static boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if ( nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] nums = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		System.out.println(noTriples(nums));
	}
}
*/