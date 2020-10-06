package specifiers;

public class FinalOverloding {
	
	//final overloding
	final void a() {
		System.out.println();
	}
	
	final void a(int a) {
		System.out.println();
	}
	
	//static overloding
	static void b() {
		System.out.println("static Parent b");
	}
	
	static void b(int b) {
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		FinalOverloding.b();
	}
	
public static void main(Integer[] args) {
		
	}

}
