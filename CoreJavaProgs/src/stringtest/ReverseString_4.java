package stringtest;

public class ReverseString_4 {

	public static void main(String[] args) {
		// Type-1
		String line = "TapanKumarParida";
		// line=line.replace(" ", "");//Tapan Kumar Parida
		String reverseString = "";
		char[] ch = line.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			reverseString += ch[i];
		}

		System.out.println("ReverseString1 : " + reverseString);

		// Type-2
		String newString = "TapanKumarParida";
		char sChar[] = newString.toCharArray();
		int n = sChar.length;

		char temp;
		for (int i = 0; i < n / 2; i++) {
			temp = sChar[i];
			sChar[i] = sChar[n - i - 1];
			sChar[n - i - 1] = temp;
		}

		String reverseString2 = "";
		for (char c : sChar)
			reverseString2 += c;

		System.out.println("ReverseString2 : " + reverseString2);

		// Type-3
		StringBuilder sb = new StringBuilder(line);
		sb.reverse();
		System.out.println("ReverseString3 : " + sb);

	}

}
