package threadd;

public class ThreadSumWithWait {
	public static void main(String[] args) throws InterruptedException {
		SumThreadDemo s1 = new SumThreadDemo(1, 10);
		s1.setName("s1");
		SumThreadDemo s2 = new SumThreadDemo(11, 20);
		s2.setName("s2");
		SumThreadDemo s3 = new SumThreadDemo(21, 30);
		s3.setName("s3");
//		s1.calculateSum();
//		s2.calculateSum();
//		s3.calculateSum();

		s1.start();
		s2.start();
		s3.start();

		synchronized (s1) {
			s1.wait();
			System.out.println("s1 locked");
		}
		synchronized (s2) {
			s2.wait();
			System.out.println("s2 locked");
		}
		synchronized (s3) {
			s3.wait();
			System.out.println("s3 locked");
		}

//		Thread.sleep(1000);

		System.out.println(s1.sum + s2.sum + s3.sum);
	}
}

class SumThreadDemo extends Thread {

	int start, end, sum = 0;

	public SumThreadDemo(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {
		calculateSum();
	}

	void calculateSum() {
		System.out.println(currentThread().getName() + " Started...");
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}

		System.out.println(currentThread().getName() + " done...");

	}
}