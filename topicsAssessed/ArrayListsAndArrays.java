package topicsAssessed;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ARRAYLISTS & ARRAYS
 * 
 * - Access a sequence of data stored in an array in order.
 * - Store an ordered sequence of data using an array.
 * - Update what is stored at a specific index in an array.
 * - Explain the differences between an array and and ArrayList
 * - Iterate over an array
 * - Iterate over an ArrayList
 *  
 * @author tbw
 *
 */
public class ArrayListsAndArrays {

	/**
	 * EXPLAIN the differences between arrays and ArrayLists:
	 * 
	 * Arrays are static and cannot change in size.
	 * ArrayLists are dynamic and can be changed in size after initialization.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// store an ordered sequence of data in some arrays and ArrayLists
		double[] ppg = {22.6, 12.7, 7.9, 16.4, 9.2};
		String[] teams = new String[3];
		String[] fruits = {"banana", "apple", "blueberry"};
		ArrayList<String> countries = new ArrayList<>(
				Arrays.asList("germany", "japan", "usa", "britain")
				);
		ArrayList<Integer> scores = new ArrayList<>(
				Arrays.asList(334, 254, 756, 534)
				);
		
		// access the sequence of data in order from the ppg array
		System.out.println("Points per game (by player):");
		System.out.println("Sandusky: "+ppg[0]);
		System.out.println("Fargas: "+ppg[1]);
		System.out.println("Takenaka: "+ppg[2]);
		System.out.println("Muhammed: "+ppg[3]);
		System.out.println("Blipkin: "+ppg[4]);
		
		System.out.println();
		
		// update what is stored at a specific index in the teams array
		System.out.println("Hometown teams:");
		teams[0] = "Rockets";
		teams[1] = "Texans";
		teams[2] = "Astros";
		System.out.println(teams[0]);
		System.out.println(teams[1]);
		System.out.println(teams[2]);
		
		System.out.println();
		
		// iterate over the fruits array; print them on the same line for fun
		for(int i=0; i<fruits.length; i++) {
			System.out.print(fruits[i]+" ");
		}
		
		System.out.println();
		
		// iterate over the countries ArrayList; use printf for shigs
		for(String e:countries) {
			System.out.printf("%s ", e);
		}
		
		System.out.println();
		
		// iterate over the scores ArrayList for extras
		for(int n:scores) {
			System.out.println(n);
		}
		
		// declare an array with 4 empty elements
		String[] sArray = new String[4];
		
		// assign values to the array
		for(int i=0; i<sArray.length; i++) {
			sArray[i] = "Stored at index: "+i;
			System.out.println(sArray[i]);
		}
	}

}
