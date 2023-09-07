package idioms;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arrTemp = sc.nextLine().replaceAll("\\s+$", "").split(" ");
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}
		
		for(int i=arr.size(); i<n; i--) {
			System.out.print(arr.get(i-1)+" ");
		}
		
		sc.close();
	}

}
