package inheritanceTest;

public class B extends A{
	
	 public static void staicM() {
		 System.out.println("staticM() in Class B");
	 }
	 
	 private void privateM() {
		 System.out.println("privateM() in Class B");
	 }
	
	public void addA() {
		 System.out.println("Class B addA()");
	 }
	
	public void addB() {
		System.out.println(" addB()");
	}

	public void funA(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.addA();//A
		a.staicM();
		//a.privateM();
		
		A a1=new B();
		a1.addA();//B
		a1.funA(10, 20);
		a1.staicM();
		// a1.privateM();  //method privateM() from the type A is not visible
		
		//B bb=new A();
		/*B bb=(B)new A();
		bb.add(); -->run time error*/
		
		B b=new B();
		b.staicM();
		b.addB();
		b.funA(10, 20, 30);
		b.privateM();
		
		
		

	}

}
