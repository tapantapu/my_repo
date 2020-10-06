package stringtest;

public class PermutationsOfString {

	public static void permutation(String input) {
		permutation("", input);
	}

	public static void permutation(String perm, String input) {
		if (input.isEmpty()) {
			System.out.println(perm + input);
		}
		else {
			for (int i = 0; i < input.length(); i++) {
				permutation(perm + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}

	}

	public static void main(String[] args) {

		/*
		 * String s="abcd"; s=s.substring(1,2); System.out.println(s);
		 */
		permutation("123");

	}

}
