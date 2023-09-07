package hackerRank;

import java.util.Scanner;

/**
 * SUBSTRINGS
 * 
 * Given a String(s) and two indices (start & end) print a substring
 * consisting of all characters in the inclusive range from start to
 * end-1.
 * 
 * Use the substring() method.
 * 
 * Note: To find the index, we can use indexOf.
 * 
 * Input:
 * Helloworld
 * 3 7
 * 
 * Output:
 * lowo
 * 
 * @author tylerbrw
 *
 */
public class Substrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		System.out.println(s.substring(start,end));

		
	}

}
