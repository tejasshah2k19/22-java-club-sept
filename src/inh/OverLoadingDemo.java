package inh;

public class OverLoadingDemo {

	public static void main(String[] args) {
		K k = new K();
		k.add();
		k.add(2);
		k.add(2, 2);
	}
}

class T {
	void add() {
		// input
		System.out.println("add()");
	}

	void add(int x) {
		System.out.println("add(int)");
	}
}

class K extends T {
	void add(int k, int l) {
		System.out.println("add(int,int)");
		// k+l
	}

}