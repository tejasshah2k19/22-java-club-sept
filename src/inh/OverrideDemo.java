package inh;

public class OverrideDemo {

	public static void main(String[] args) {
		N n = new N();
		// n.add();
	}
}

class M {
	M() {
		System.out.println("M()");
	}

	M(int m) {
		System.out.println("M(int)");
	}

	void add() {
		System.out.println("M:add()");
	}
}

class N extends M {

	N() {
		super.add();
		System.out.println("N()");
	}

	void add() {
		System.out.println("N:add()");
		super.add();
	}
}