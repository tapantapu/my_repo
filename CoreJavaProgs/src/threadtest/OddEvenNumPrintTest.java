package threadtest;

public class OddEvenNumPrintTest {

	public static void main(String[] args) {

		Thread t1=new Thread(new OddEvenNumPrint(1), "Odd");
		Thread t2=new Thread(new OddEvenNumPrint(0),"Even");
		
		t1.start();
		t2.start();
		
		
	}

}
