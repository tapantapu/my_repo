package threadtest;

public class PrintSequence3ThreadsTest {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new PrintSequence3Threads(1),"T1");
		Thread t2=new Thread(new PrintSequence3Threads(2),"T2");
		Thread t3=new Thread(new PrintSequence3Threads(3),"T3");
		Thread t4=new Thread(new PrintSequence3Threads(0),"T4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
