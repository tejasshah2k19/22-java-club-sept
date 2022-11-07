package threadd;

class ThreadSumD extends Thread {

	int sum = 0;

	public void run() {
		for (int i = 1; i <= 50; i++) {
			sum = sum + i;
		}
		//

	}
}

public class ThreadBank {
	public static void main(String[] args) throws InterruptedException {
//		Bank b = new Bank();
//
//		Thread t1 = new Thread(b);
//		Thread t2 = new Thread(b);
//		Thread t3 = new Thread(b);
//		Thread t4 = new Thread(b);
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();

		ThreadSumD t1 = new ThreadSumD();
		ThreadSumD t2 = new ThreadSumD();
		t1.start();
		t2.start();
		Thread.sleep(500);
		System.out.println(t1.sum+t2.sum);
	}
}
//thread -> 1 to 100 sum -> main method => sum 

//ThreadSum ->  1 to 50 
//          -> 1 to 50
// t1 sum + t2 sum -> print

class Bank extends Thread {
	int bal;

	Bank() {
		this.bal = 20000;
	}

	void wid(int amt) {
		System.out.println("Wid start.....");
		System.out.println("------------------------");
		if (this.bal - amt >= 0) {
			System.out.println("-------------------");
			this.bal = this.bal - amt;
			System.out.println("Wid done....");
		} else {
			System.out.println("InsufficientBalance");
		}
		System.out.println("wid end.......");
	}

	public void run() {
		System.out.println("************");
		System.out.println("S:");
		wid(6000);
		System.out.println("final bal -> " + bal);
	}
}
