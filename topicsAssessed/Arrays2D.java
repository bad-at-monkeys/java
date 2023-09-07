package topicsAssessed;

/**
 * MULTIDIMENSIONAL ARRAYS (2D ARRAYS)
 * 
 * We can create matrices with this.
 * 
 * @author tylerbrw
 *
 */
public class Arrays2D {

	public static void main(String[] args) {
		// declare vars for rows and column
		int rows = 2;
		int columns = 4;
		// declare the array
		int[][] multiArray = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(multiArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
