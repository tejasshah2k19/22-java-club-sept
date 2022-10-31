package threadd;

//1 extends Thread 

public class FirstThread extends Thread {
  //override 
	public void run() {
		System.out.println("run....");

	}

	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		ft.start();//stack 
	}
}
