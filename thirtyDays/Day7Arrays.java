package thirtyDays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Given an array, arr, of integers, n, print a's elements in reverse
 * as a single line of space seperated numbers.
 * 
 * @author tylerbrw
 *
 */

public class Day7Arrays {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());    // query
		String[] arrTemp = br.readLine().replaceAll("\\s+$", "").split(" ");
		List<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}
		
		for(int i=arr.size(); i>0; i--) {
			System.out.print(arr.get(i-1)+" ");    // the i-1 gets us in bounds
		}
		
		br.close();
	}

}
