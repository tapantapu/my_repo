package interfacetest;

public interface I {
	
	public void add();
	
	default void fun1() {
		System.out.println("Default method of interface I");
	}

	static void fun2() {
		System.out.println("Static method of interface I");
	}
}
