package inheritanceTest;

public class ChieldClass extends ParentClass {

	int c = 100;

	int j = super.p+100;

	public void chieldFun() {
		super.parentFun();
		System.out.println("Chield Class Function");

	}

	public void childArgFun(int c) {
		System.out.println(c);
	}

	public ChieldClass() {
		//super.parentFun();
		System.out.println("Chield Class Constructor");
	}

	//static function overriding
	public static void staticFunc() {
		System.out.println("staticFunc in chield");
	}
	
	//static function overloding
	public static void staticFunc(int a) {
		System.out.println("staticFunc in chield"+a);
	}
	
	public static void main(String[] args) {

		ChieldClass chield = new ChieldClass();
		chield.parentFun();
		chield.chieldFun();
		chield.staticFunc();
		/*System.out.println(chield.j);
		
		 ParentClass p = new ChieldClass(); p.parentFun();*/
		 

		// ParentClass pp=new ParentClass();

	}

}
