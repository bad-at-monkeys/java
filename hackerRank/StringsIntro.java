package hackerRank;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * STRINGS INTRO
 * 
 * Given two Strings, perform the operations:
 *   1) Sum the lengths of A and B
 *   2) Determine if A is lexicographically larger than B (Yes/No)
 *   3) Capitalize the first letter in A and B and print them on a line
 *        separated by a space
 *        
 * Input:
 * hello
 * java
 * 
 * Output:
 * 9
 * No
 * Hello Java
 * 
 * @author tylerbrw
 *
 */

public class StringsIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        List<String> list = new ArrayList<String>(
            Arrays.asList(A, B)
            );
            
        // add the lengths
        System.out.println(A.length()+B.length());
        list.sort(String::compareToIgnoreCase);
        
//        if(list.indexOf(A)>list.indexOf(B))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
        
        // use ternary instead
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        // capitalize
        A = A.substring(0,1).toUpperCase() + A.substring(1); 
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A+" "+B);
	}

}
