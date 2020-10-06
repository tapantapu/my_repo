package stringtest;

public class VowelCounter_6 {

	public static void main(String[] args) {

		String s = "absg hdni hsedA pdo hUnudo";
		int count = 0;
		// Type-1
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U')
				count++;
		}
		System.out.println("VowelCounter : " + count);
		System.out.println("----------------------------------------------");
		// Type-2
		String s1 = "absg hdni hsedA pdo hUnudo";
		int count1 = 0;

		for (char c : s1.toCharArray()) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count1++;
				break;

			default:
			}

		}
		System.out.println("VowelCounter1 : " + count1);
	}

}
