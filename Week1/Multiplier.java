public class Multiplier {
  public static void main(String args[]) {
    int no1 = Integer.parseInt(args[0]);
    int no2 = Integer.parseInt(args[1]);
    int no3 = Integer.parseInt(args[2]);

    int product = no1 * no2 * no3;

    System.out.print(no1);
    System.out.print(" * ");
    System.out.print(no2);
    System.out.print(" * ");
    System.out.print(no3);
    System.out.print(" = ");
    System.out.print(product);
  }
}
