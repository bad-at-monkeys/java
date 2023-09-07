package topicsAssessed;

import java.util.HashMap;
import java.util.Map;

/**
 * DICTIONARIES AND MAPS
 * 
 * English to Spanish Dictionary
 * 
 * @author tylerbrw
 *
 */
public class DictionariesAndMaps {

	public static void main(String[] args) {
		Map<String,String> engSpanishDict = new HashMap<String,String>();
		// put data in the map
		engSpanishDict.put("Monday","Lunes");
		engSpanishDict.put("Tuesday","Martes");
		engSpanishDict.put("Wednesday","Miercoles");
		engSpanishDict.put("Thursday","Jueves");
		engSpanishDict.put("Friday","Viernes");
		engSpanishDict.put("Saturday","Sabado");
		engSpanishDict.put("Sunday","Domingo");
		// get a value from a key
		System.out.println(engSpanishDict.get("Monday"));
		System.out.println(engSpanishDict.get("Sunday"));
		// get all the keys (returns them unordered like a hash)
		System.out.println(engSpanishDict.keySet());
		// print all vals (they are the same order as the keys)
		System.out.println(engSpanishDict.values());
		// print the size
		System.out.println("The size of our dictionary: "+engSpanishDict.size());
		
		System.out.println("\n");
		
		// Shopping list
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		// put data in the dictionary
		shoppingList.put("ham",Boolean.TRUE);
		shoppingList.put("milk",Boolean.TRUE);    // use the object properties, not the primitive value
		shoppingList.put("donut",Boolean.FALSE);
		shoppingList.put("tortillas",Boolean.FALSE);
		shoppingList.put("wine",Boolean.TRUE);
		// get the items
		System.out.println(shoppingList.get("milk"));
		System.out.println(shoppingList.get("tortillas"));
		// print the key-val pair
		System.out.println(shoppingList.toString());
		// is it empty?
		System.out.println(shoppingList.isEmpty());
		// remove an entry
		shoppingList.remove("ham");
		System.out.println(shoppingList.toString());
		// replace a value
		shoppingList.replace("donut",Boolean.TRUE);
		System.out.println(shoppingList.get("donut"));
		// get the set
		System.out.println(shoppingList.entrySet());
		System.out.println(shoppingList.containsValue(Boolean.TRUE));
	}

}
