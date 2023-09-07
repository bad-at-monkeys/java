package topicsAssessed;

import java.util.Scanner;

/**
 * CONDITONAL EXPRESSIONS
 * 
 * - Evaluate a conditional expression containing relational operators.
 * - Evaluate compound conditional expressions containing AND and OR logical operators.
 * - Use short-circuiting in compound conditional expressions.
 * 
 * @author tbw
 *
 */

public class ConditionalExpressions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// we can short-circuit or not depending on user input
		int n = sc.nextInt();
		int score = sc.nextInt();
		boolean flag = true;    // adding this for fun
		
		// this takes care of the first
		if(n%2==1 || n>=6 && n<=20)
			System.out.println("Weird");
		else
			System.out.println("Not Weird");
		
		// this handles the last two
		if(score<=100 && score>=90) {
			System.out.println("A");
			flag = true;
		} else if(score<=89 && score>=80) {
			System.out.println("B");
			flag = true;
		} else if(score<=79 && score>=70) {
			System.out.println("C");
			flag = false;
		} else if(score<=69) {
			System.out.println("F");
			flag = false;
		}
		if(flag==true)
			System.out.println("you qualify for a scholarship");
		else
			System.out.println("You do not qualify for a scholarship");

		sc.close();
	}

}
