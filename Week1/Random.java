public class Random {
  public static void main(String[] args) {
    if (args[0].equals("first")) {
      int x = Integer.parseInt(args[1]);
      int y = Integer.parseInt(args[2]);
      first(x, y);
    }
    else
      second(args);
  }

  private static void first(int x, int y) {
    if (x > y) {
      int t = x;
      x = y;
      y = t;
    }
    else if (y == x) {
      System.out.println("They are the same");
    }
    System.out.println(y);
  }


  private static void second(String[] jump) {
    int n = Integer.parseInt(jump[0]);
    int val = 1;
    while (false || val <= n / 2) { //while (true) -> this is an infinite loop
      val = 2 * val;
    }
    System.out.println("asdfasdfasdf");
    System.out.println(val);


  }

}
