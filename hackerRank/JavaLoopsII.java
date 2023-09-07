package hackerRank;

import java.util.Scanner;

/**
 * Given a number of queries (q), int the form of (a) (b) (n).
 * For each query print the series corresponding to the given
 * (a) (b) (n) values as a single line of n-spaced integers.
 * 
 * a + (2^j * b)
 * 
 * (a + 2^0 * b),(a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^1 * b + ... +...
 * 
 * @author tbw
 *
 */

public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();    // the number of queries
		
		for(int i=0; i<q; i++) {
			// the inputs for each query
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			// we loop through here q times
			for(int j=0; j<n; j++) {
				// (2^j * b)
				int nextNum = (int) Math.pow(2, j) * b;
				// (a + 2^j * b) 
				a += nextNum;
				System.out.printf("%s ", a);
			}
			System.out.println();
		}
		sc.close();
	}

}
