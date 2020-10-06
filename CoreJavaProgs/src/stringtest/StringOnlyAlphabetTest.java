package stringtest;

public class StringOnlyAlphabetTest {

	public static void main(String[] args) {

		String s = "abdis33fs";

		System.out.println("InPut : " + s);
		System.out.println("OutPut : " + isStringOnlyAlphabet(s));

	}

	public static boolean isStringOnlyAlphabet(String s) {

		if (s == null && s.equals(""))
			return false;
		char[] sChar = s.toCharArray();

		for (int i = 0; i < sChar.length; i++) {
			if (!(sChar[i] >= 'A' && sChar[i] <= 'Z') && !(sChar[i] >= 'a' && sChar[i] <= 'z'))
				return false;
		}

		return true;
	}

}
