public class MeanVariance {
	public static void main(String[] args) {
		double mean = 0;
		for (int i = 0; i < args.length; i++){
			mean += Double.parseDouble(args[i]);
		}
		mean = mean / args.length; // mean /= args.length//
		System.out.println(mean);
		
		double variance = 0;
		for (int i = 0; i < args.length; i++) {
			variance += Math.pow((Double.parseDouble(args[i]) - mean), 2);
		}
		variance /= args.length;
		System.out.println("Varience is: " + variance);
	}
}
/*public class MeanVariance {
	  public static void main(String[] args){
	    int n = args.length;
	    double[] dataset = new double[n];

	    for (int i = 0; i < n; i++) {
	        dataset[i] = Double.parseDouble(args[i]);
	    }

	    double mean = 0.0;
	    for (int i = 0; i < n; i++) {
	        mean += dataset[i];
	    }
	    mean /= n;
	    double variance = 0;
	    for (int i = 0; i <n; i++) {
	        double x = dataset[i] - mean;
	        variance += (x * x);
	    }
	    variance /= n;

	    System.out.println(mean);
	    System.out.println(variance);
	  }
	}
*/