package topicsAssessed;

import java.util.Arrays;
import java.util.ArrayList;

public class IterationPractice {

	public static void main(String[] args) {
		
		ArrayList<String> countries = new ArrayList<>(
				Arrays.asList("Japan", "Russia", "USA", "Germany")
				);
		
		for(String e:countries) {
			System.out.println(e);
		}
		
		
		System.out.println();
		
		
		String[] countryArray = new String[4];
		int i=0, j=0;		
		while(i<4) {
			countryArray[i]=countries.get(i);
			i++;
		}
		while(j<4) {
			System.out.print(countryArray[j]+" ");
			j++;
		}
		
		
		int weeks = 3;
		String[] exc = {"Deadlift", "Squat", "Powerclean", "Deadlift", "Squat", "Powerclean", "Deadlift"};
		
		for(int k=0; k<=weeks; k++) {
			System.out.println("Week: "+k);
			
			for(int m=0; m<exc.length; m++) {
				int day = m+1;
				System.out.println("  Day "+day+": "+exc[m]);
			}
		}
		
		
		System.out.println();
		
		
		int[] arrNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int g=0; g<arrNum.length; g++) {
			if(arrNum[g]%2==1)
				System.out.print(arrNum[g]+" ");
			if(arrNum[g]%2==0)
				continue;
		}
		
		System.out.println();
		
		int h = -1;
		while(h<(arrNum.length - 1)) {
			h++;
			if(arrNum[h]%2==1)
				System.out.print(arrNum[h]+" ");
			if(arrNum[h]%2==0)
				continue;
			if(arrNum[h]==7)
				break;
		}
			
		
	}

}
