package tapan.com.test;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Value of a = ");
		int a = sc.nextInt();
		System.out.println("Please enter the Value of b = ");
		int b = sc.nextInt();
		int c = a + b;

		System.out.println("Total Sum " + c);

	}
}
