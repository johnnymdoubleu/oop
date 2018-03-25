public class Scottish {
  public static void main(String[] args) {
    String choice;
    int temp = Integer.parseInt(args [0]);
    if (temp < -5) choice = "wear  a sweater";
    else if (temp < 1) choice = "nippy";
    else if (temp < 11) choice = "normal";
    else choice = "roastin";
    System.out.println( "Choice: " + choice);
    }
}
