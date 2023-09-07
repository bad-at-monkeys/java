package topicsAssessed;

/**
 * ENUMS
 * 
 * - Represent a set of predefined constants as an enum type.
 * 
 */

import java.util.Arrays;

public class SystemE {
	
	public enum State {
		OFF,
		INIT,
		STANDBY,
		BLOCKING,
		LISTENING,
		FORWARDING
	}
	
	public static void main(String[] args) {
		// assigning and accessing enum values
		State e1 = State.LISTENING;	
		System.out.println("E1 state: "+e1);
		e1 = State.STANDBY;
		System.out.println("E1 state changed to: "+e1);
		
		State e2 = State.BLOCKING;
		System.out.println(e2);
		
		
		System.out.println();
		
		
		// iterating over enum values with a foreach
		for(State e:State.values()) {
			System.out.println(e);
		}

		System.out.println();
		
		// converting enum values to an Array, then using a foreach to loop over the elements.
		Arrays.asList(State.values())
		  .forEach(e -> System.out.print(e+" "));
	}
}
