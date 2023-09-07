package topicsAssessed;

/** 
 * NOTE: See hackerRank.SubstringComparisons for original submission.
 * 
 * This is a different implementation that doesn't use ArraysList.
 * 
 * The substrings are initially set at 0,k.
 * Then we use a loop to iterate over the length of s.
 * Inside of the loop we declare a variable to store the current substring being iterated.
 * 
 * @author tylerbrw
 *
 */
public class SubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0,k);
		String largest = s.substring(0,k);
		
		for(int i=0; i<=s.length()-k-1; i++) {    // - k-1 or else it is out of bounds
			// create a var for the current substring
			String currSub = s.substring(i, i+k);

			if(smallest.compareTo(currSub)>0)    // a larger num compared to a smaller returns a positive
				smallest = currSub;
			if(largest.compareTo(currSub)<0)    // a smaller compare to larger yields negative
				largest = currSub;
		}
		
		System.out.println(largest.compareTo(smallest));
		return smallest + "\n" + largest;
	}
	
	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("hackerrank", 3));
		
		String a = "hac";
		String b = "ker";
		
		System.out.println(a.compareTo(b));    // h is 3 less than k lexicographically; -3
		System.out.println(b.compareTo(a));    // k is 3 more than h lexicographically; 3
		
	}

}
