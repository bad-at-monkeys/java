package hackerRank;

//import java.text.DecimalFormat;
import java.util.*;


/**
 * We are given an integer n, we must convert it into a String.
 * 
 * Our code will print "Good job" if correct,
 * otherwise "Wrong answer."
 * 
 * So we can use (from best to least):
 *   - the toString() method OF THE Integer class.
 *   - valueOf() from the String class.
 *   
 *   The below solutions won't work on HackerRank due to import issues.
 *   - DecimalFormat
 *   - StringBuffer
 *   - StringBuilder
 * 
 * @author tbw
 *
 */

public class IntToString {

	public static void main(String[] args) {
		
		   Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		   
		   // using toString()
		   String s = Integer.toString(n);
		   
		   // using valueOf()
//		   String s = String.valueOf(n);
		  
		   // using DecimalFormat
//		   DecimalFormat df = new DecimalFormat("#");
//		   String s = df.format(n);
		   
		   // using StringBuffer
//		   StringBuffer sb = new StringBuffer();
//		   sb.append(n);
//		   String s = sb.toString();
		   
		   // using StringBuilder
//		   StringBuilder sb = new StringBuilder();
//		   sb.append(n);
//		   String s = sb.toString();
		   
		   if (n == Integer.parseInt(s))
		    System.out.println("Good job");
		   else 
		    System.out.println("Wrong answer.");
		   
	}
}
