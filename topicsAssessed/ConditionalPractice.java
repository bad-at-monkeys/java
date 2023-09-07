package topicsAssessed;

import java.util.Scanner;

public class ConditionalPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==1 || num>=6 && num<=20)
			System.out.println("Werid");
		else
			System.out.println("Not weird");
		
		sc.close();

	}

}
