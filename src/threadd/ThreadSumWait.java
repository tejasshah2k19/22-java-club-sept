package threadd;

public class ThreadSumWait {
	public static void main(String[] args) throws InterruptedException {

		Sum s = new Sum();
		s.start();
		// join
		// sleep
		// wait - notify

		synchronized (s) {
			s.wait();// wait -> sync
		}
		System.out.println(s.sum);
	}
}

class Sum extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
//		notify();
	}

}