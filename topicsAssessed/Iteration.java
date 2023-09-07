package topicsAssessed;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ITERATION
 * 
 * - Execute a block of code many times using a for statement.
 * - Execute a block of code many times using a for-each statement.
 * - Execute a block of code many times using a while statement.
 * - Execute blocks of code many times using nested looping statements.
 * - Interrupt the execution of a looping statement using a break statement.
 * - Skip an iteration of a looping statement using a continue statement.
 * 
 * @author tbw
 *
 */

public class Iteration {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		ArrayList<String> countries = new ArrayList<>(
				Arrays.asList("Japan", "USA", "Sngapore", "Malaysia")
				);
		
		
		// use a for statement
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		
		System.out.println();
		
		
		// use a for-each
		for(String e : countries) {
			System.out.print(e+" ");
		}
		
		
		System.out.println();
		
		
		// the while; use break and continue statements to only print odd numbers from the array 
		int j = 0;
		while(j<=nums.length) {
			j++;
			if(j>=nums.length)
				break;
			if(nums[j]%2==1) {
				System.out.print(nums[j]+" ");
				
			}
				
		}
		
		
		System.out.println();
		
		
		// nested looping statements
		int weeks = 3;
		int days = 7;
		
		for(int i=1; i<=weeks; i++) {
			System.out.println("Week: "+i);
			
			for(int k=1; k<=days; k++) {
				System.out.println("  Day: "+k);
			}
		}

	}

}
