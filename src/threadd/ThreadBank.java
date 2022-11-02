package threadd;

public class ThreadBank {
	public static void main(String[] args) {
		Bank b = new Bank();

		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		Thread t4 = new Thread(b);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
//thread -> 1 to 100 sum -> main method => sum 

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
		System.out.println("final bal -> "+bal);
	}
}
