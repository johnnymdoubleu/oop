public class PointDistance {
  public static double distance (double x0, double y0, double x1, double y1) {
		  double d1 = (x0 - x1);
		  double d2 = (y0 - y1);
		  return Math.sqrt (d1*d1 + d2*d2);
		}

  public static void main(String[] args) {
    int N = args.length;
    if (N % 2 != 0) N--; //ignore final arg if odd number
    double[] points = new double[N];

    for (int i =0; i < args.length; i++)
      points[i] = Double.parseDouble(args[i]);

    double centreX = points[0];
    double centreY = points[1];

    for (int i = 2; i < N; i += 2) {
      double dist = distance(centreX, centreY, points[i], points[i+1]);

      //System.out.println("Distance from" + " (" + centreX + " , " + centreY + ")" + " to" + " (" + points[i] + " , " + points[i+1] + ")" + " is " + dist);
      System.out.printf( "Distance from (%s, %s) to (%5.2f, %5.2f) is %5.2f\n", centreX, centreY, points[i], points[i+1], dist);
    }
  }
}

