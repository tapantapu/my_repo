package inheritanceTest;

public class ParentClass {
	int p = 10;

	public void parentFun() {
		System.out.println("Parent Function");
	}

	public void add(int p) {
		System.out.println(p);
	}

	public ParentClass() {
		System.out.println("Parent Class Constructor");
	}
	
	public static void staticFunc() {
		System.out.println("staticFunc in Parent");
	}

	public static void main(String[] args) {
		
		ParentClass parent=new ParentClass();
		
		/*ParentClass parent=new ChieldClass();
		parent.parentFun();*/
		
		

	}

}
