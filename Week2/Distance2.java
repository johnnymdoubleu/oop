public class Distance2 {
	public static void main(String[] args) {
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		
		int distance = Math.abs(no1 - no2);
		System.out.println(distance);
	}
}
