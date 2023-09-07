package topicsAssessed;

import java.util.Scanner;

/**
 * CAPTURING INFORMATION WHILE RUNNING CODE
 * 
 * - Implement a repetitive execution of code using a while statement.
 * - Implement code to receive input from the user through the console.
 * 
 * @author tylerbrw
 *
 */
public class CapturingInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*6)+1;
		
		System.out.print("Guess a number 1-6: ");
		int guess = sc.nextInt();
		
		while(guess!=num) {
			if(guess==num) {
				break;
			} else {
				System.out.print("Guess again: ");
				guess = sc.nextInt();
			}
		}
		System.out.println("Correct");
		
		sc.close();
	}

}
