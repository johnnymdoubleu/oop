public class SaferQS {
  public static void main(String[] args){
    double A = Double.parseDouble(args[0]);
    double B = Double.parseDouble(args[1]);
    double C = Double.parseDouble(args[2]);

    if (A == 0.0) {
      System.out.print("A is 0.0 therefore no solution");
    }
    else {
      double D = B * B - 4 * A * C;
      if (D < 0) {
        System.out.print("D is negative therefore no solution");
      }
      else {
        double s1 = (-1.0 * B + Math.sqrt(D)) / (2 * A);
        double s2 = (-1.0 * B - Math.sqrt(D)) / (2 * A);
        System.out.println(s1);
        System.out.println(s2);
      }
    }
  }
}
