package stringtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixDigitNumberInStringCheck_5 {

	public static void main(String[] args) {
		
		String s="1a2356";

		Pattern p =Pattern.compile("\\d{6}");
		boolean m= p.matcher(s).matches();
		
		System.out.println("SixDigitNumberInStringCheck : "+m);
		
	}

}
