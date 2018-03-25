public class CoordinateConverter {
	public static double convertXYtoR(double x, double y) {
		return Math.sqrt(x*x + y*y);
	}
	public static double convertXYtoT(double x, double y) {
		return Math.atan2(y, x);
	}
	public static double convertRTtoX(double r, double theta) {
		return r * Math.cos(theta);
	}
	public static double convertRTtoY(double r, double theta) {
		return r* Math.sin(theta);
	}
	public static double convertDegToRad(double deg) {
		return Math.toRadians(deg);
	}
	public static double convertRadToDeg(double deg) {
		return Math.toDegrees(deg);
	}
	public static void main(String[] args) {
		System.out.println("Input numbers");
	}
}
