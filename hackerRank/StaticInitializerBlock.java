package hackerRank;

import java.util.Scanner;

/**
 * Static init blocks execute code within a class prior to any
 * objects being initialized.
 * 
 * The static block below runs before anything in the main() method will.
 * This is why we are prompted for input when running the code and nothing
 * appears to have been initialized.
 * 
 * We can actually place all of the code within the block,
 * the code in the main() method was provided by the exercise
 * for testing purposes.
 * 
 * @author tbw
 *
 */

public class StaticInitializerBlock {
	static boolean flag;
	static int B,H;
	
	// static block
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		if((B<0 || H<0) || (B>=100 || H>=100)) {
			System.err.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		} else {
			flag = true;
		}
		sc.close();
	}
	
	// calc area based on the flags state
	public static void main(String[] args) {
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}
	}

}
