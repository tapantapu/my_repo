package stringtest;

public class RemoveAllSpecialCharacter {

	public static void main(String[] args) {

		String str = "abcd#&@efg&^1238*2827";
		String Newstr = "";
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch))
				Newstr += ch;
			else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
				Newstr += ch;
		}
		System.out.println(Newstr);

	}

}
