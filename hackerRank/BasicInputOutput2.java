package hackerRank;

import java.util.Scanner;

public class BasicInputOutput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();    // eat the line
		String s = sc.nextLine();
		
		
		System.out.println("String: "+s);
		System.out.println("Double: "+d);
		System.out.println("Int: "+i);

		// close the Scanner object
		sc.close();
	}

}
