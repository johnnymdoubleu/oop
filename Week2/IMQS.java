public class IMQS {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double Discrim = (b * b - 4 * a * c);
		
		if (a == 0.0) {
			double S = -c / b;
			System.out.println(S);
		}
		else {
			if (Discrim >= 0) {
				System.out.println((-b + Math.sqrt(Discrim)) / ( 2 * a));
				System.out.println((-b - Math.sqrt(Discrim)) / ( 2 * a));
			}
			else {
				System.out.println(-b/ (2 * a) + " + " + Math.sqrt(Math.abs(Discrim)) / (2 * a) + "i");
				System.out.println(-b/ (2 * a) + " -" + Math.sqrt(Math.abs(Discrim)) / (2 * a) + "i");
			}
		}
	}
}

/*
public class IMQS {
	  public static void main(String[] args) {
	    double a = Double.parseDouble(args[0]);
	    double b = Double.parseDouble(args[1]);
	    double c = Double.parseDouble(args[2]);

	    if (a == 0.0) {
	      double S = -c / b;
	      System.out.println(S);
	    }
	    else {
	      double D = b * b - 4 * a * c;
	      if (D < 0) {
	        double SR = (-1.0 * b) / (2 * a);
	        double SI = Math.sqrt (Math.abs(D)) / (2 * a);
	        System.out.println(SR + "+" + SI + "i");
	        System.out.println(SR + "-" + SI + "i");
	      }
	      else {
	        double S1 = (-1.0 * b + Math.sqrt(D)) / (2 * a);
	        double S2 = (-1.0 * b - Math.sqrt(D)) / (2 * a);
	        System.out.println(S1);
	        System.out.println(S2);
	      }
	    }
	  }
	}
*/