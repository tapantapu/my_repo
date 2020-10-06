package stringtest;

public class SumNumbersPresentString {

	public static void main(String[] args) {

		String s = "10hdb1dosn20jfhnd40";

		System.out.println("Sum : " + sumNo(s));
	}

	public static int sumNo(String s) {
		int sum = 0;
		String number = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				number += ch;
			} else {
				sum += Integer.parseInt(number);
				number = "0";
			}
		}

		return sum + Integer.parseInt(number);
	}
}
