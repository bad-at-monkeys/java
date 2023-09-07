package thirtyDays;

import java.util.Scanner;

public class Day1DataTypes {

	public static void main(String[] args) {
		// given these vars
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		// instantiate a Scanner
		Scanner sc = new Scanner(System.in);
		// declare three vars to take STDIN
		int num = sc.nextInt();
		double realNum = sc.nextDouble();
		sc.nextLine();    // eat the empty line
		String str = sc.nextLine();
		String sResult = s+str;
		
		// add the ints and doubles; cat the strings
		System.out.println(i+num);
		System.out.println(d+realNum);
		System.out.println(sResult);

		// close the Scanner obj
		sc.close();
	}

}
