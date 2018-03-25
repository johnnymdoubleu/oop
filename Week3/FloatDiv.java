public class FloatDiv {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    int exposure = Integer.parseInt(args[1]);
    // By changing 250 to 250.0 the calculation uses doubles instead of ints
    double dose = ((exposure * 250.0) / age);

    System.out.format("Patient Age: %d%n", age);
    System.out.format("Days since bitten: %d%n", exposure);
    System.out.format("Dosage of antidote: %.3fmg%n", dose);
  }
}
