public class ArrayFront9 {
	public static boolean arrayFront9(int[] nums) {
		boolean has9 = false;
		for (int i = 0; (i < 4 && nums.length >= 4) || (i < nums.length && nums.length < 4); i++) {
			if (nums[i] == 9) {
				has9 = true;
				break;
			}
		}
		return has9;
	}
	public static void main(String[] args) {
		int N = args.length;
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		System.out.println(arrayFront9(nums));
	}
}

/*public class ArrayFront9 {
	public static boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length && i < 4; i++){
			if (9 == nums[i]){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int n = args.length;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		System.out.println(arrayFront9(nums));
	}

}
*/
