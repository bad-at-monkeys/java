package idioms;

import java.util.Arrays;

public class CountFreqOfArrayElements {
	
	public static void countFreq(int[] arr, int n) {
		// create an empty array of n length to store the freq count
		boolean[] visited = new boolean[n];
		
		// assign a boolean val to each element in the array of booleans
		Arrays.fill(visited, false);
		
		// traverse through array and count the freqs
		for(int i=0; i<n; i++) {
			// skip if already visited
			if(visited[i]==true)
				continue;
			
			// count freq
			int count = 1;
			for(int j=1+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" appears "+count+" times in the array.");
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 20, 10, 10, 20, 10, 5};
		int n = arr.length;
		countFreq(arr, n);

	}

}
