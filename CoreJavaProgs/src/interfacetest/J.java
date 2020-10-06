package interfacetest;

public interface J {
	public void add();
	
	default void fun1() {
		System.out.println("Default method of interface J");
	}

	static void fun2() {
		System.out.println("Static method of interface J");
	}

}
