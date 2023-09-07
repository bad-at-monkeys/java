package idioms;

/**
 * Getting the 
 * @author tylerbrw
 *
 */
public class ASCIIValOfChar {

	public static void main(String[] args) {
		char myChar = 'c';
		System.out.println("The ASCII value of "+myChar+" is: "+(int)myChar);
		
		
		// breaking a String into chars
		String myString = "A B C D E";
		char[] charArray = myString.toCharArray();
		
		for(int i=0; i<myString.length(); i++) {
			System.out.print(charArray[i]+" ");
		}

		System.out.println();
	}

}
