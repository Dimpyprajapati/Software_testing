package core;

public class Matrices_addition {

	public static void main(String args[]) {
		int rows = 3; 
		int col = 3;
		int[][] first  = {{1,3,4},{2,4,3},{3,4,5}};
		int[][] second = {{1,3,4},{2,4,3},{1,2,4}};
		
		int[][] sum = new int[rows][col];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
	    }
		System.out.println("sum of two matrices is : ");
		for(int[] row : sum) {
			for(int column : row) {
			System.out.print(column + " ");
		    }
			System.out.println();
		}   
	}
}
