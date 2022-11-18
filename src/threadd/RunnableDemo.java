package threadd;

public class RunnableDemo {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		Thread t = new Thread(m);
		t.start();
		t.setName("t");
		
	}
}

class Mouse implements Runnable {
	public void run() {
		System.out.println("run()");
	}
}