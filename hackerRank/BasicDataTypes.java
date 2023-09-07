package hackerRank;

import java.util.Scanner;

/**
 * We input t, test cases. Each t is a single line containing
 * an integer x.
 * 
 * For each x will be compared with a respective primitive dataType
 * to determine whether x can fit into datatType.
 * 
 * @author tbw
 *
 */

public class BasicDataTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();    // number of test cases

        for(int i=0;i<t;i++)
        {
            try
            {
            	// long as input, it's the largest possible dataType for the exercise
                long x=sc.nextLong();
                
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();

	}
}
