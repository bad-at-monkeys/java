package topicsAssessed;

/**
 * BINARY NUMBERS
 * 
 * Converting a decimal base10 number to a binary base2
 */
import java.util.Scanner;

public class BinaryNumbers {
	
	// convert a base10 num to a base2 using an array
	public static void decToBinary(int n) {
		// ArrayList to store binary num, i like the way it is displayed better...
		int[] binaryArr = new int[1000];
		
		// counter for binaryArr
		int i=0;
		
		while(n>0) {
			// storing the remainder in binaryArr
		    binaryArr[i] = n%2;
		    n = n / 2;
		    i++;
		}
		
		// printing binaryArr in reverse order
		for(int j=i-1; j>=0; j--) {
			System.out.print(binaryArr[j]);
		}
		
	}
	
	
	// convert using bitwise operators (most efficient)
	// Time complexity: O(1)
	// Space complexity: 0(1)
	public static void decToBinary2(int n) {
		
		// size of an int assumed to be 32bits
		for(int i=31; i>=0; i--) {
			int k = n >> i;
			if((k & 1) > 0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a base10 integer to convert to base2: ");
		int n = sc.nextInt();
		
		System.out.print("Binary >> ");
		decToBinary(n);
		
		
		System.out.println();
		
		
		int num = sc.nextInt();
		
		System.out.println("Decimal = "+num);
		System.out.print("Binary = ");
		decToBinary2(num);
		
		
		
		sc.close();
	}

}
