package topicsAssessed;

/**
 * SUBSTRINGS
 * 
 * - Use the String classes indexOf() method to locate the first occurrence of a provided String.
 * - Use the String classes substring() method to extract a String at a provided start and end index.
 * 
 * @author tylerbrw
 *
 */

public class Substrings {
	
	public static void main(String[] args) {
		String url = "https://www.amazon.com";
		System.out.println(url.indexOf('.'));    // 3
		System.out.println(url.indexOf('.',12));    // index of the next '.', 10
		int begin = url.indexOf('.')+1;
		int end = url.indexOf('.',12);
		String hostname = url.substring(begin,end);
		System.out.println(hostname);

		int first = url.indexOf('/')+2;
		int last = url.indexOf('.');
		String appProtocol2 = url.substring(first,last);
		System.out.println(appProtocol2);
		
		int startIndex = 0;
		int endIndex = url.indexOf(':');
		String appProtocol = url.substring(startIndex,endIndex);
		System.out.println(appProtocol);
	}

}
