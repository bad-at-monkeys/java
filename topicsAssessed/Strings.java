package topicsAssessed;

/**
 * STRINGS
 * 
 * - Create a new String that inserts strings values inside of another String
 *   using String.format, StringBuilder, and the plus operator.
 * - Store char data using the String type.
 * 
 * @author tylerbrw
 *
 */

public class Strings {

	public static void main(String[] args) {
		// this takes care of the first objective
		StringBuilder str1 = new StringBuilder("foo");
		String str2 = "bar";
		String str3 = String.format("%s %s ", str1, str2);
		String str4 = "baz";
		
		System.out.println(str3+str4);

		
		// store char data using the String type
		char ch = 'J';    // declare a char
		String str = String.valueOf(ch);    // store to String using valueOf()
		System.out.println(str);
		
		String st = Character.toString(ch);    // store to String using toString()
		System.out.println(st);
		
		
		StringBuilder a = new StringBuilder("tyler");
		String b = "brandon";
		String c = String.format("%s %s", a, b);
		String d = " wright";
		System.out.println(c+d);
		
		char gender = 'f';
		String g = String.valueOf(gender);
		System.out.println(g);
	}

}
