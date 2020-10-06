package stringtest;

public class StringTest {

	public static void main(String[] args) {
		// 1st test
		String s = new String("Tapan");
		s.concat("Kumar");
		System.out.println(s); // Tapan

		// 2nd test
		String s1 = s.concat("Kumar");
		System.out.println(s1); // TapanKumar

		// 3rd test
		StringBuffer sb = new StringBuffer("Tapan");
		sb.append("Kumar");
		System.out.println(sb);// TapanKumar

		// 4th test
		String ss = "tapan";
		ss = ss + "Kumar";
		System.out.println(ss);//tapanKumar
		
		
		String s2="abcdef";
		
		s2=s2.substring(0, 0);
		System.out.println(s2);
		
		String a=new String("abc");
		String b=new String("abc");		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	
		
		String c="abc";
		String d="abc";	
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		

	}

}
