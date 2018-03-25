public class NbyN {
 public static int [][] nbyn(int n){
	 int [][] matrix = new int[n][n];
	 for (int i = 0; i < n; i++) {
		 for ( int j = 0; j < n; j ++){
			 if (j == i) {
				 matrix[i][j] = i;
			 }
			 else {
				 matrix[i][j] = 0;
			 }
		 }
	 }
	 return matrix;
 }
 public static void main(String[] args){
	 int m = StdIn.readInt();
	 for (int i = 0; i < m ; i++) {
		 for (int j = 0; j < m; j++) 
			 System.out.print(nbyn(m)[i][j] + " ");
		 System.out.println();
	 }
 }
}

/* public static void main(String[] args) {
 */
