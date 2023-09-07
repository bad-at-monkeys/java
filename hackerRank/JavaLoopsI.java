package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Given an int, N, print its first 10 multiples.
 * Each multiple N x i should be printed on a new
 * line in the form:
 * N x i = result
 * 
 * @author tbw
 *
 */

public class JavaLoopsI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		
		
		
		for(int i=1; i<=10; i++) {
			int prod = N * i;
			if(N<2 || N>20) {
				System.err.println("Invalid input: Input a number above 2 and under 20.");
				break;
			} else {
				System.out.println(N+" x "+i+" = "+prod);
			}
		}
		br.close();
	}

}
