package stringtest;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramarCheck_2 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 1st Word");
		String s1 = sc1.next();
		System.out.println("Enter 2nd word");
		String s2 = sc2.next();
		System.out.println("Two words contains same characters : " + anagramarCheck(s1, s2));
		System.out.println("Two words contains same characters : " + anagramarCheck1(s1, s2));
	}
	// Step-1
	public static boolean anagramarCheck(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);	}
	// Step-2
	public static boolean anagramarCheck1(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s2);

		for (char c : s1.toCharArray()) {
			int index = sb.indexOf(""+c);
			if (index != -1)
				sb.deleteCharAt(index);
			else
				return false;
		}
		return sb.length() == 0 ? true : false;
	}
}