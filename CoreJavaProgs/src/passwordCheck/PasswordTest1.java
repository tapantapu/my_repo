package passwordCheck;

import java.util.Scanner;

public class PasswordTest1 {

	public static void main(String[] args) {
		
		int a='9';
		int b='a';
		System.out.println(a);
		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password with minimum 2 character and 2 numeric number and mimimun length 10");
		String pwd = sc.next();

		if (isValidate(pwd))
			System.out.println("Valid Password : " + pwd);
		else
			System.out.println("Invalid Password : " + pwd);

	}

	public static boolean isValidate(String pwd) {
		int pwd_length = 10;
		int noCount = 0;
		int charCount = 0;

		if (pwd.length() < pwd_length)
			return false;

		for (int i = 0; i < pwd.length(); i++) {

			char ch = pwd.charAt(i);

			if (is_Number(ch))
				noCount++;

			else if (is_Character(ch))
				charCount++;
			else
				return false;
		}

		return noCount >= 2 && charCount >= 2;
	}

	public static boolean is_Character(char ch) {
		ch = Character.toUpperCase(ch);
		return ch >= 'A' && ch <= 'Z';
	}

	public static boolean is_Number(char ch) {
		return ch >= '0' && ch <= '9';
	}

}
