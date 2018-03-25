public class Distance1 {
	  public static void main(String args []) {
	    int no1 = Integer.parseInt(args[0]);
	    int no2 = Integer.parseInt(args[1]);

	    int distance = Math.max(no1, no2) ;//= Math.min(no1, no2);
	    System.out.println(distance);
	  }
	}
