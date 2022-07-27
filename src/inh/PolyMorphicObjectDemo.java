package inh;

public class PolyMorphicObjectDemo {

	public static void main(String[] args) {

		Santa s = new Santa();
		s.add(); // Santa::add()
		s.sub();
//		s.mul();

		Banta b = new Banta();
		b.add();// Banta::add()
		b.sub();// inheritance
		b.mul();

		// Parent ref = child memory();

		System.out.println("================================");
		Santa sb = new Banta();// sb -> polymorphic object
		sb.add();//
		sb.sub();
//		sb.mul();

		// compile time ==> Parent
		// run time ==> Child
		sb.div();
	}
}

//polymorphism --> 

class Santa {

	void add() {
		System.out.println("Santa::add()");
	}

	void sub() {
		System.out.println("Santa::sub()");
	}

	void div() {
		System.out.println("Santa::div()");
	}
}

class Banta extends Santa {
	void add() {
		System.out.println("Banta::add()");
	}

	void mul() {
		System.out.println("Banta::mul()");
	}
}