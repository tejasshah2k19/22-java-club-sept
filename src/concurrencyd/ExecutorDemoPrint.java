package concurrencyd;

import java.awt.BufferCapabilities.FlipContents;
import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemoPrint {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		PrintIndia p = new PrintIndia();
//		p.start();

		// ExecutorService ex = Executors.newFixedThreadPool(3);
		// ex.submit(p);
		// ex.shutdown();

		long startTime = Calendar.getInstance().getTimeInMillis();
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ThreadSumT t = new ThreadSumT();
		ThreadSumT s = new ThreadSumT();

		Future<Integer> f1 = ex.submit(t); // return
		Future<Integer> f2 = ex.submit(s); // return

		System.out.println(f1.get() + f2.get());

		ex.shutdown();
		System.out.println("done........");
		long endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println((endTime - startTime));
		System.out.println((endTime - startTime) / 1000);
	}
}

class PrintIndia extends Thread {
	public void run() {
		System.out.println("india");
	}
}

class ThreadSumT implements Callable<Integer> {
	int sum = 0;

	public Integer call() throws Exception {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

class ThreadDivT implements Callable<Float> {
	public Float call() throws Exception {
		return null;
	}
}