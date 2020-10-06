package tapan.com.test;

import java.nio.charset.Charset;

public class StringTest {

	public static void main(String[] args) {
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s_byte =new String(b_arr); 
		
		System.out.println(s_byte);//Geeks
		
		byte[] b_arr1 = {71, 101, 101, 107, 115};
		Charset cs=Charset.defaultCharset();
		String s = new String(b_arr1, 1, 3, cs); // eek
		System.out.println(s);
		
		
	}
}
