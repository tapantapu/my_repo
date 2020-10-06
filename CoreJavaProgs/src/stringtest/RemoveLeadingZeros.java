package stringtest;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		// Type-1
		String str = "00001234";
		String newString = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				newString += str.charAt(i);
			} else
				count++;
		}
		System.out.println("Count of zeros : " + count + "------" + "New String : " + newString);

		// Type--2
		System.out.println("-------------------------");

		String s1 = "00004737";
		int i = 0;
		StringBuffer sb = null;
		while (i < s1.length() && s1.charAt(i) == '0') {
			i++;
			sb = new StringBuffer(s1);
			sb.replace(0, i, "");
		}

		System.out.println(i + "-------------- " + sb.toString());

		
	}

}
