package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BasicInputOutputBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		br.close();
	}
}
