package thirtyDays;

import java.util.Scanner;

/**
 * DAY 6 LET'S REVIEW
 * 
 * Given a String, s, of length, n, that is indexed from 0 to N-1.
 * 
 * Print its even indexed and odd indexed char as 2 space separated
 * Strings on a single line.
 * 
 * @author tylerbrw
 *
 */
public class Day6LetsReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			String s = sc.next();
			String even = "";
			String odd = "";
			
			for(int j=0; j<s.length(); j++) {
				if(j%2==0)
					even = even + s.charAt(j);
				else
					odd = odd + s.charAt(j);
			}
			System.out.println(even + " " + odd);    // printing all even chars, then all the odd ones
		}
		sc.close();
	}

}
