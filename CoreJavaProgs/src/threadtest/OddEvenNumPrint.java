package threadtest;

public class OddEvenNumPrint implements Runnable {
	int MAX_LENGTH = 10;
	static int number = 1;
	int reminder;
	static Object lock = new Object();

	public OddEvenNumPrint(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while (number < MAX_LENGTH) {
			synchronized (lock) {
				while (number % 2 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}
