package assignment1Factorial;

import java.util.Scanner;

public class FactorialAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		
		int num = sc.nextInt();
		int result = 1;
		for (;num>=1;num--) {
			result *= num;
		}
		System.out.println(result);
		//System.out.println(4 | 5);
	}

}
