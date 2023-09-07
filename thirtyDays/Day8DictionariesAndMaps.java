package thirtyDays;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Given n names and phone numbers, assemble a phone book that maps friends names
 * to their phone numbers. We will then be given an unknown number of names to
 * query the phone book for. For each name queried, print the associated entry from
 * our phone book on a new line, if the entry for name isn't found, print "Not Found".
 * 
 * NOTE: The phone book should be a Dictionary/Map/Hashmap structure.
 * 
 * @author tylerbrw
 *
 */
public class Day8DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
		// how many entries to make in the phone book
		int n = sc.nextInt();
		
		// adding key-val paris to the dictionary
		for(int i=0; i<n; i++) {
			String name = sc.next();
			Integer phone = sc.nextInt();
			phoneBook.put(name,phone);
			
		}
		while(sc.hasNext()) {
			String s = sc.next();
			if(phoneBook.containsKey(s))
				System.out.println(s+"="+phoneBook.get(s));
			else
				System.out.println("Not Found");
			
		}
		sc.close();

	}

}
