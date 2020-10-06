package threadtest;

public class PrintSequence3Threads implements Runnable {
	int MAX_LENGTH = 10;
	static int number = 1;
	static Object lock = new Object();
	int reminder;

	public PrintSequence3Threads(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while (number < MAX_LENGTH) {
			synchronized (lock) {
				while (number % 4 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" "+number);
				number++;
				lock.notifyAll();
			}
		}

	}

}
