package topicsAssessed;

import java.util.Scanner;

/**
 * UNCHECKED EXCEPTIONS
 * 
 * - Throw an unchecked exception to alert the user when input is invalid.
 * - Understand that calling a method on a null reference causes a NullPointerException to be thrown.
 * 
 * NOTE: If a client cannot do anything to recover from the exception,
 *       we make it an unchecked exception.
 * 
 * Java does not verify unchecked exceptions at compile time,
 * and we don't need to them in a method with the throws keyword.
 * 
 * @author tylerbrw
 *
 */
public class UncheckedExceptions {

	public static void main(String[] args) {
		// the operation below doesn't throw any errors at compile time, but does at runtime.
//		int numerator = 2;
//		int denominator = 0;
//		System.out.println(numerator/denominator);    // exception thrown, can't divide by 0
		
		/**
		 * NULLPOINTEREXCEPTION
		 * 
		 * NullPointerExceptions occur when we try to use a reference that
		 * points to no location in memory (null) as if it were representing
		 * an obj.
		 * 
		 */
		
		Object obj = null;
		System.out.println(obj.equals(1));    // NullPointerException, obj has no location in mem.
	}                                         // It doesn't exist, so it cannot be used.

}
