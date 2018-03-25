import java.util.Arrays;

public class ArrayOps {
	public static double findMax(double[] data) {
		double max = data[0];
		for ( int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
	public static double[] normalise(double[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double[] newData = new double[data.length];
		for (int i = 0; i < data.length; i++ ) {
			newData[i] = data[i] / sum;
		}
		return newData;
	}
	public static void normaliseInPlace(double data[]) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		for (int i = 0; i < data.length; i++) {
			data[i] /= sum;
		}
	}
	public static void swap(double[] data1, double[] data2) {
		for (int i = 0; i < data2.length; i++) {
			double a = data1[i];
			data1[i] = data2[i];
			data2[i] = a;
		}
	}
	public static double[] reverse(double[] data) {
		double[] order = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			order[i] = data[data.length - 1 - i];
		}
		return order;
	}
	public static void reverseInPlace(double [] data){
		for (int i = 0; i < data.length / 2; i++) {
			double tempo = data[i];
			data[i] = data[data.length - 1 - i];
			data[data.length - 1 - i] = tempo;
		}
	}
	public static void main(String[] args){
		double [] a = {1,2,3,1};
		double [] b = {1,2,3,4};
		
		
		System.out.println(findMax (a));
		System.out.println(Arrays.toString(reverse (a)));
		System.out.println(Arrays.toString(normalise (b)));
	}

}
