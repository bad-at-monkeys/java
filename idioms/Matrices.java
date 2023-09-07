package idioms;

import java.util.Arrays;
import java.util.ArrayList;

public class Matrices {
	
	
	// using standard array
	public static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// using Arrays.stream().forEach(row)
	public static void matrixPrinter(int[][] matrix) {
		Arrays.stream(matrix).forEach((row) -> {
			System.out.print("[");
			Arrays.stream(row).forEach((el) -> System.out.print(" "+el+" "));
			System.out.println("]");
		});
	}
	
	// TODO using ArrayList
	

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 1, 0},
				{2, 0, 3},
				{8, 6, 4}
		};
		printMatrix(matrix);
		
		
		int[][] multiArray = new int[7][10];
		matrixPrinter(multiArray);
		

	}

}
