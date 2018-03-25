public class BooleanExpression {
  public static void main(String args[]) {
    boolean a = Boolean.parseBoolean(args[0]);
    boolean b = Boolean.parseBoolean(args[1]);

    boolean result = (!(a && b) && (a || b)) || ((a && b) || !(a || b));

    System.out.print("a: ");
    System.out.print(a);
    System.out.print("\nb: ");
    System.out.print(b);
    System.out.print("\nphi: ");
    System.out.print(result);
    System.out.print("\n");
  }
}

/*
java BooleanExpr true true -> phi = true
java BooleanExpr false true -> phi = true
java BooleanExpr true false -> phi = true
java BooleanExpr false false -> phi = true
*/
