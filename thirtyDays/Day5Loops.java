package thirtyDays;

import java.util.Scanner;

/**
 * Given an integer, n, print its first ten multiples on a new line like:
 *   n x i = result
 *   
 * @author tbw
 *
 */

public class Day5Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int p = n*i;
			System.out.println(n+" x "+i+" = "+p);
		}
		
		sc.close();

	}

}
