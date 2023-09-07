package thirtyDays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Day3IntroToConditionals {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        
        if(N%2==1 || (N>=6 && N<=20))
        	System.out.println("Weird");
        else
        	System.out.println("Not Weird");
        	
        br.close();

	}

}
