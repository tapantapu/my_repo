package abstractClassTest;

public class C extends B {

	public void cm1() {
		System.out.println("cm1 -->C");
	}

	/*
	 * public void ma1() { System.out.println("ma1-->C"); }
	 */

	public void mb1() {
		System.out.println("mb1-->C");
	}

	public void mb2() {
		System.out.println("mb2-->C");
	}

	public static void main(String[] args) {

		/*
		 * A a=new A(); B b=new B();
		 */ // incorrect

		// A a=null; correct
		B b = null;
		// b.mb1(); //NullPointerException -->run time

		b = new C();
		b.ma1();
		b.mb1();
		b.mb2();

		A a = new C();
		a.ma1();
	}

}
