package threadtest;

public class Task implements Runnable{
public void run() {
	System.out.println("Thread name1 : "+Thread.currentThread().getName());
}
}
