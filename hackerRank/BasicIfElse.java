package hackerRank;

import java.util.Scanner;

/**
 * this is kind a functional way
 * @author tbw
 *
 */

public class BasicIfElse {
	// declare a Scanner constant
	public static final Scanner sc = new Scanner(System.in);
	public static int N = sc.nextInt();

	// create the method
	public static void isWeird(int n) {
		if(N>=6 && N<=20 || N%2==1)
			System.out.println("Weird");
		else
			System.out.println("Not Weird");
	}
	
	public static void main(String[] args) {
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		
		BasicIfElse.isWeird(N);
		sc.close();
	}

}
