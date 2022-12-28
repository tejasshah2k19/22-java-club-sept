package j8;

public class FiSiDemo {

	public static void main(String[] args) {
		ThreadSum ts = new ThreadSum();
		Thread t = new Thread(ts);
		t.start();
		// 50
		// --------------------------

		Runnable r = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		};
		Thread tr = new Thread(r);
		tr.start();

		Runnable r2 = () -> {
			int sum = 0;
			for (int i = 1; i <= 15; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		};
		Thread tr2 = new Thread(r2);
		tr2.start();

	}
}

//thread 1 to 10 sum 

class ThreadSum implements Runnable {
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}