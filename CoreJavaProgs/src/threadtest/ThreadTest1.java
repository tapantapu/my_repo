package threadtest;

public class ThreadTest1 extends Thread {

	public void run() {
		/*for (int i = 0; i < 5; i++) {
			System.out.println("Chield Thread: " + i);
		}*/
		System.out.println("Chield Thread");
	}

	public static void main(String[] args) {
		ThreadTest1 t = new ThreadTest1();
		t.run();
		t.run();
		t.start();
		// t.start(); // Chield Thread //java.lang.IllegalThreadStateException

		/*for (int j = 0; j < 5; j++) {

			System.out.println("Main Thread : " + j);
		}*/
	}
}
