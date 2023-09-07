package hackerRank;

import java.util.Scanner;

/**
 * STRING REVERSE
 * 
 * Given a String(a), determine whether it is a palindrome.
 * We will use StringBuilder.reverse().
 * 
 * Check the topicsAssessed version for other implementations.
 * 
 */

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		StringBuilder str = new StringBuilder();
		str.append(a);
		String rev = str.reverse().toString();
		
		if(rev.equals(a))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println(str);
		

	}

}
