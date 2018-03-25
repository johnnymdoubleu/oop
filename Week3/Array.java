public class Array {
  public static void main(String[] args) {
    double[] x = { 0.3, 0.6, 0.1};
    double[] y = { 0.5, 0.1, 0.4};
    double sum = 0.0;
    for (int i = 0; i < x.length; i++) {
        sum += x[i] * y [i];
    }
    System.out.println(sum); 
  }
}
