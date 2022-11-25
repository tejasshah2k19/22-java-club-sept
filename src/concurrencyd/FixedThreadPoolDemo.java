package concurrencyd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPoolDemo {
	// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

	// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

	// CISC > _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 10 * 10

	// RISC > _ _ _ _ _ _ _ _ _ _ _ _ _ _ _10 add 10 _

	public static void main(String[] args) {

		ThreadSum t1 = new ThreadSum();
		ThreadSum t2 = new ThreadSum();
		ThreadSum t3 = new ThreadSum();

		// t1.start();// 1 min
		// t2.start();// 1 min
		// t3.start();// 1 min

		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().availableProcessors());
		ExecutorService ex = Executors.newFixedThreadPool(3);// 3 thread
		ExecutorService ex1 = Executors.newCachedThreadPool();// 60 second 2

		ex.submit(t1);// 25min
		ex.submit(t2);
		ex.submit(t3);
		// amazon -> 150 -> 500 -> [ 100 auto scale ] cached thread pool
		// gu -> 10 20 10 20 -> 500 [ 10 ] cached thread pool

		ex.shutdown();

		// wait
		// 7 => 25 users
		// 7.30 //12 pm
		// 12 pm - 4 pm

		// Mr x. ->

		// server -> fail -> gateway -> fault -> proxy server -> [ response ]
		// server -> stop -> data login -->
	}
}

class ThreadSum extends Thread {
	int sum;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("done");
	}
}