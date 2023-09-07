package topicsAssessed;

/**
 * RECURSION (See also time-complexity)
 * 
 * Splitting a problem into two parts, a base case and a recursive case.
 * 
 * The problem is then divided into smaller subproblems that are solved
 * recursively until the base case is met.
 * 
 * Once the base case is met, the solutions for each subproblem
 * are combined and the result is the solution to the problem as a whole.
 * 
 * The base case must be reachable after a certain number of iterations,
 * otherwise an infinite loop will occur.
 * 
 * f(f(f(a))) --- a = 20
 * f(a) = 5 + a
 * f(20) = 5 + 20 = 25
 * 
 * Base case: f > 1 --- Recursive case: f(a) = 5 + a  
 * 
 * f(f(f(20))) --- f(f(25))
 * 
 * f(f(25)) = 5 + 25 = 30
 * 
 * f(30) = 5 + 30 = 35
 * 
 * f(f(f(20))) --- f(f(25)) --- f(30) --- 35
 * 
 * NOTE: The multiplicative identity is anything multiplied by that number is itself (which is one).
 *         recursive problems that use multiplication use 1 in the test.
 *         
 *       The additive identity is when the number is added to another (0), it equals itself.
 *       
 * @author tylerbrw
 *
 */

public class Recursion {
	
	/* Multiplication by Division */
	private static int nTimesK(int n, int k) {
		System.out.println("n: "+n);
		
		// recursive case
		if(n>1)
			return k + nTimesK(n-1, k);    // k adds the result of each subproblem (.
		// base case n = 1
		else
			return k;
	}
	
	
	/* Summation */
	public static int summation(int n) {
		// base case: THE END
		if(n<=0)
			return 0;    // addition additive property
		// recursive case: KEEP GOING
		else
			return n + summation(n-1);
	}
	
	
	/**
	 * Factorial (n!)
	 * 
	 * Time complexity: O(n)
	 * Space complexity: O(n)
	 * @param n
	 * @return
	 */
	// 4! --> 4*3*2*1
	public static int factorial(int n) {
		// Base case: 
		if(n<=1) 
			return 1;
		// Recursive case: 
		else
			return n * factorial(n-1);
	}
	
	
	/* Linear Factorial */
	/**
	 * Uses a for loop:
	 *   - We declare a value, res, to initialize at 1.
	 *   - Then run a for loop from 1 to n.
	 *       Every time the loop executes, res is multiplied with the counter.
	 *   - Finally after the loop is exhausted, the result is stored in res
	 *       and that value is returned. 
	 * 
	 * Time complexity: O(n)
	 * Space complexity: O(1) (constant space; more efficient than factorial())
	 * 
	 * @param n
	 * @return
	 */
	public static int linearFactorial(int n) {
		int res = 1;
		for (int i=1; i<=n; i++) {
			res*=i;
		}
		return res;
	}
	
	
	public static int exponentiation(int n, int p) {
		if(p<=0)    // mult identity; p is the reduction (not n).
			// Base case: 
			return 1;
		else
			// recursive case
			return n * exponentiation(n, p-1);
	}
	
	public static void main(String[] args) {
	    int result = nTimesK(4,10);
	    System.out.println("Result: "+result);
	    
	    int value = summation(5);
	    System.out.println("Summation: "+value);

	    int fact = factorial(10);
	    System.out.println("Factorial: "+fact);
	    
	    int linFact = linearFactorial(10);
	    System.out.println("Linear factorial: "+linFact);
	    
	    int exp = exponentiation(5,3);
	    System.out.println("Exponentiation: "+exp);
	    
	}

}
