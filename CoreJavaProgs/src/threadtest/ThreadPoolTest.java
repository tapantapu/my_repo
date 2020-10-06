package threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {

		// Normal Thread concept
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(new Task());
			t.start();
		}
		System.out.println("Thread Name2 : " + Thread.currentThread().getName());

		// Thread pool
		
		//get count of available cores
		int n=Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(n); //10
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Task());
		}
		System.out.println("Thread Name3 : " + Thread.currentThread().getName());

	}

}
