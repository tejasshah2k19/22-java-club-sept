package concurrencyd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {

		ThreadSum t1 = new ThreadSum();

//		ExecutorService ex = Executors.newFixedThreadPool(3);// 3 thread
		// 50 thread // 10 processor // 3 thread

//		ExecutorService ex = Executors.newSingleThreadExecutor();//1 thread

		ExecutorService ex = Executors.newCachedThreadPool();// 2
		ex.submit(t1);
		//

	}
}

class ThreadSum extends Thread {
	int sum;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
	}
}