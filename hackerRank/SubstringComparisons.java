package hackerRank;

import java.util.List;
import java.util.ArrayList;

/**
 * SUBSTRING COMPARISONS
 * 
 * Given a String(s) and an int(k), complete the function so that
 * it finds the lexicographically smallest and largest substrings
 * of length k.
 * 
 * NOTE: The size() method outputs the total number of list elements,
 *         NOT THE INDEX.
 *         
 *       We also can't use the List class in the HackerRank challenge..
 *       
 *       See topicsAssessed.SubstringComparisons for correct implementation.
 * 
 * Input:
 * welcometojava
 * 3
 * 
 * Output:
 * ava
 * wel
 * 
 * @author tylerbrw
 *
 */

public class SubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		// we must add an ArrayList to store substring iterations
		List<String> subList = new ArrayList<String>();
		
		// iterate through substrings of s and add them to the subList ArrayList
		for(int i=0; i<s.length()-(k-1); i++) {
			subList.add(s.substring(i,i+k));
		}
		
		// sort the ArrayList, ignore case for safety
		subList.sort(String::compareToIgnoreCase);
		// reassign vals to the originally empty declared variables
		smallest = subList.get(0);
		largest = subList.get(subList.size()-1);
		
		// printing the list for testing
		System.out.println(subList);
		System.out.println(subList.size());
		
		return smallest + "\n" + largest;
	}
	
	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava", 3));

	}

}
