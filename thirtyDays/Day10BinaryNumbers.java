package thirtyDays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

/**
 * DAY 10 BINARY NUMBERS
 * 
 * Given a base10 int, n, convert it to binary.
 * Then find and print the base10 int denoting the
 * maximum number of consecutive 1's in n's binary
 * representation.
 * 
 * Input - a single int.
 * Output - a single base10 int that denotes the maximum
 *          number of consecutive 1's in the binary representation
 *          of n.
 *          
 * @author tylerbrw
 *
 */
public class Day10BinaryNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		
		String[] countArr = Integer.toBinaryString(n).toString().split("0");
		Arrays.sort(countArr);
		
		System.out.println((countArr[countArr.length - 1]).length());
		
		br.close();
		
	}

}
