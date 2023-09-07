package idioms;

import java.util.Scanner;

/**
 * The most basic state machine.
 * Just a variable that switches a system state.
 * 
 * But we are going to try and use STDIN to set
 * the state through an enum.
 * 
 * ...so enter an enum index into the console
 * to set the state.
 * 
 * @author tbw
 *
 */
public class EnumWithSwitch {
	// we define our enums up here
	enum State {
		OFF,
		INIT,
		BLOCKING,
		LISTENING,
		FORWARDING
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		State systemState = State.values()[sc.nextInt()];
		System.out.println(systemState);
		
		sc.close();
	}

}
