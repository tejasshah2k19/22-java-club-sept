package threadd;

public class ThreadSynDemo {

	public static void main(String[] args) {// thread

		Paytm mrA = new Paytm("Mr A", 25000);
		Thread mrAc = new Thread(mrA, "mrAc");
		Thread mrAw = new Thread(mrA);
		mrAw.setName("mrAw");

		// Paytm mrB = new Paytm("Mr B", 25000);
//		mrB.start();

		mrAc.start();
		mrAw.start();

		// join
		// sleep

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		mrA.printBal();
		// mrB.printBal();

	}
}

class Paytm extends Thread {
	int balance;
	String name;

	static int routerCode = 9;

	public Paytm(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	void printBal() {
		System.out.println(" Bal of " + currentThread().getName() + " => " + this.balance);
	}

//	// instance level lock
//	synchronized void wid(int amt) { //10 min 
//		//
//		System.out.println(currentThread().getName() + " Wid start........");
//		//
//		if (this.balance - amt >= 0) {
//			System.out.println(currentThread().getName() + " success ");
//			this.balance = this.balance - amt;
//		} else {
//			System.out.println(currentThread().getName() + " can Max : " + this.balance);
//		}
//		
//		//
//		System.out.println(currentThread().getName() + " Wid done........");
//		//
//	}

	// instance level lock
	void wid(int amt) { // 10 min
		//
		System.out.println(currentThread().getName() + " Wid start........");
		//
		synchronized (this) {
			if (this.balance - amt >= 0) {
				System.out.println(currentThread().getName() + " success ");
				this.balance = this.balance - amt;
			} else {
				System.out.println(currentThread().getName() + " can Max : " + this.balance);
			}
		}
		//
		System.out.println(currentThread().getName() + " Wid done........");
		//
	}

	//class level
	synchronized static void abc() {
		//
		routerCode = 90;
	}

	public void run() {
		System.out.println(currentThread().getName() + " run()");
		wid(20000);
	}
}
