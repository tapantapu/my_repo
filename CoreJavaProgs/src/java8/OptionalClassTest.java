package java8;

import java.util.Optional;

public class OptionalClassTest {
	
	public static void main(String[] args) {
		String[]  s=new String[10];
		s[0]="Tapan";
		s[1]="Kumar";
		s[2]="PARIDA";
		s[3]="abc";
		
		Optional<String> op=Optional.ofNullable(s[2]);
		
		if(op.isPresent())
			System.out.println(s[2].toLowerCase());
		else
			System.out.println("String Value is not present");
	}

}
