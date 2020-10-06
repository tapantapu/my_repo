package interfacetest;

public class A implements I, J, K {

	@Override
	public void add() {
		System.out.println("Class A add() method");
	}

	// with out override the the function we can define the class as abstract
	@Override
	public void sub() {

	}

	@Override
	public void fun1() {
		System.out.println("Overide func1() bcz same defult method availabel in interface i,J");
	}

	public static void main(String[] args) {

		A a = new A();
		a.add();
		a.fun1();
		I.fun2();
		J.fun2();
	}

}
