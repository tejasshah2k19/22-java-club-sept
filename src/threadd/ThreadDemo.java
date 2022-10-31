package threadd;

public class ThreadDemo {
	public static void main(String[] args) {
		Copy c = new Copy();
		Print p = new Print();
		c.start();
		p.start();
		System.out.println("End of main1");
		System.out.println("End of main2");
		System.out.println("End of main3");
		
	}
}

class Copy extends Thread {

	public void run() {
		// logic
		for (int i = 1; i <= 10; i++) {
			System.out.println("Copy " + i);
		}
	}
}

class Print extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print " + i);
		}
	}
}

//  extends Thread
//  override run() 

//
