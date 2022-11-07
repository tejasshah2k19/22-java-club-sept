package threadd;

public class ThreadSum {

	public static void main(String[] args) throws Exception { // thread
//		SumNum s = new SumNum();
//		s.calculateSum();
//		s.printSum();
//		SumNum s2 = new SumNum();
//		s2.calculateSum();
//		s2.printSum();
//		System.out.println(s.sum + s2.sum);

		// JRE JVM

//		ThreadSumNum ts = new ThreadSumNum();
//		ts.start();//1-50
//        try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//2 second 
//		System.out.println(ts.sum);//250
//		
//
//		ThreadSumNum ts1 = new ThreadSumNum();
//		ts1.setName("ts1");
//		ThreadSumNum ts2 = new ThreadSumNum();
//		ts2.setName("ts2");
//		ThreadSumNum ts3 = new ThreadSumNum();
//		ts3.setName("ts3");
//
//		ts1.start();// 1-50
//		try {
//			ts1.join(); // start end
//			ts2.start();
//			ts2.join(); // start end
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 2
//
//		ts3.start();
//		System.out.println("ts1 => " + ts1.sum);// 250
//		System.out.println("ts2 => " + ts2.sum);// 250
//		System.out.println("ts3 => " + ts3.sum);// 250

		ThreadSumNum ts1 = new ThreadSumNum();
		ts1.setName("ts1");
		ThreadSumNum ts2 = new ThreadSumNum();
		ts2.setName("ts2");
		ThreadSumNum ts3 = new ThreadSumNum();
		ts3.setName("ts3");

		ts1.start();

		ts1.join();
		ts2.start();
		ts3.start();

		// Thread.sleep
		// join

		System.out.println(ts1.sum + ts2.sum + ts3.sum);
	}

}

//1) extends Thread [implments Runnable ] 
//2) run()
//3) call start() 
class ThreadSumNum extends Thread {
	int sum = 0;
	// 1 to 50 sum => 1275 => +2550

	void calculateSum() {
		System.out.println(currentThread().getName() + " started......");
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(currentThread().getName() + " end......");

	}

	public void run() {
		calculateSum();
		// printSum();
	}

	void printSum() {
		System.out.println("Sum => " + sum);
	}

}

class SumNum {
	int sum = 0;
	// 1 to 50 sum => 1275 => +2550

	void calculateSum() {
		for (int i = 1; i <= 50; i++) {
			sum = sum + i;
		}
	}

	void printSum() {
		System.out.println("Sum => " + sum);
	}
}