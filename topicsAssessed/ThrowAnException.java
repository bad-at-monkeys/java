package topicsAssessed;

import java.util.Scanner;

public class ThrowAnException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte x = sc.nextByte();
		
		try {
			if(x>=-128 && x<=127)System.out.println("#BYTE#");
		} catch(Exception e) {
			System.out.println("Incorrect data type.");
		}
		
		System.out.println();
		
		byte n = sc.nextByte();
		
		try {
			if(n>=-128 && n<=127)
				System.out.println("#BYTE#");
		} catch(Exception e) {
			System.out.println("Invalid input. Must enter a byte.");
		}
		
		sc.close();
	}

}
