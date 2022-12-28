package j8;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		// why interface
		// abstract

		// to achieve multiple inheritance
		// contract
	}
}

class A extends Exception implements Runnable {
	public void run() {

	}
}

@FunctionalInterface
interface Calc {
	abstract void add();

//	abstract void sub();

}

interface MyInterface {
	abstract void sub(); // no body

	// 1) default method
	default void subtraction() {
		// 50RS
	}

	// 2) static method
	static void mul() {
		// 5000
	}
}

class MyClass implements MyInterface {
	public void sub() {
		subtraction();
	}
}

class MyClassB implements MyInterface {

	public void sub() {
		// 100rs
	}

}
