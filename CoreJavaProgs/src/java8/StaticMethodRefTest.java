package java8;

public class StaticMethodRefTest {
	
	public static void m() {
		System.out.println("This is Static Method");
	}
	
	public static void main(String[] args) {
		
		StaticReferenceIntf intf=StaticMethodRefTest::m;
		intf.say();
	}

}
