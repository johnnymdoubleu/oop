import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;

public class ComplexNumbers {

	public static double[] complexAdd(double[] z1, double[] z2) {
		double[] z3 = new double[2];
		z3[0] = z1[0] + z2[0];
		z3[1] = z1[1] + z2[1];
		return z3;
	}

	public static double[] complexConjugate(double[] z) {
		double[] z3 = new double[2];
		z3[0] = z[0];
		z3[1] = -z[1];
		return z3;
	}

	public static double[] complexMultiply(double[] z1, double[] z2) {
		double[] z3 = new double[2];
		z3[0] = (z1[0] * z2[0]) - (z1[1] * z2[1]);
		z3[1] = (z1[1] * z2[0]) + (z1[0] * z2[1]);
		return z3;
	}

	public static double[] complexReciprocal(double[] z) {
		double[] overz = new double[2];
		overz[0] = z[0] / ((z[0] * z[0]) + (z[1] * z[1]));
		overz[1] = -(z[1] / ((z[0] * z[0]) + (z[1] * z[1])));
		return overz;
	}

	public static String toString(double[] z) {
		if(z[0] == 0 && z[1] == 0) {
			//return String.valueOf(0);
			return String.format("%.1f", z[0]);
		}
		if (z[0] == 0 && z[1] != 0) {
			return String.format("%.1fi", z[1]);
		}
		if (z[0] != 0 && z[1] == 0) {
			return String.format("%.1f", z[0]);
		}
		return String.format("%.1f%+.1fi", z[0], z[1]);
	}

	public static double[][] sortByMagnitude(double[][] complexList) {
		double mag[] = new double[complexList.length];
		for (int i = 0; i < complexList.length; i++) {
			mag[i] = Math.sqrt((complexList[i][0] * complexList[i][0]) + (complexList[i][1] * complexList[i][1]));
		}
		for (int n = 0; n < complexList.length; n++) {
			for (int j = 0; j < complexList.length - 1; j++) {
				if (mag[j] > mag[j + 1]) {
					double[] temp = complexList[j + 1];
					double magtep = mag[j + 1];
					mag[j + 1] = mag[j];
					mag[j] = magtep;
					complexList[j + 1] = complexList[j];
					complexList[j] = temp;
				}
			}
		}
		return complexList;
	}

	/*public static double mag(double a, double b) {
		double magnitude = a * a + b * b;
		return Math.sqrt(magnitude);
	}

	public static double[][] sortByMagnitude(double[][] complexList) {
		double[] temp;

		for (int i = 0; i < (complexList.length - 1); i++) {
			for (int j = (complexList.length - 1); j > i; j--) {
				if (mag(complexList[j - 1][0], complexList[j - 1][1]) > mag(complexList[j][0], complexList[j][1])) {
					temp = complexList[j - 1];
					complexList[j - 1] = complexList[j];
					complexList[j] = temp;
				}
			}
		}
		return complexList;
	}*/

	public static void main(String[] args) {
		//System.out.println(Arrays.deepToString(sortByMagnitude(new double[][] { { 5.0, -2.0 }, { 1, 2 }, { 0, 0 } })));
		double[] z1 = new double[2];
		double[] z2 = new double[2];
		z1[0] = Double.parseDouble(args[0]);
		z1[1] = Double.parseDouble(args[1]);
		z2[0] = Double.parseDouble(args[2]);
		z2[1] = Double.parseDouble(args[3]);
		System.out.println("(" + ComplexNumbers.toString(complexAdd(z1, z2)) + ")");
		System.out.println("(" + ComplexNumbers.toString(complexConjugate(z1)) + ")");
		System.out.println("(" + ComplexNumbers.toString(complexMultiply(z1, z2)) + ")");
		System.out.println("(" + ComplexNumbers.toString(complexReciprocal(z1)) + ")");
		System.out.println("(" + ComplexNumbers.toString(complexConjugate(complexAdd(z1, z2))) + ")");
		//double [] z = {0, -5.2};
		//System.out.println(ComplexNumbers.toString(complexAdd(z, z)));
	}

}
