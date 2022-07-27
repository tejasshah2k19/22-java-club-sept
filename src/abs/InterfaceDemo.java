package abs;

public class InterfaceDemo {
	public static void main(String[] args) {
		Casio c = new Casio();
//		Calc cx = new Calc();
//		BasicCalc bx = new BasicCalc();
	}
}

//pure abstract class-- all methods are abstract
//interface 
//all methods are public and abstract 
//we can't create instance of interface 
//variables are final, public and static 
abstract interface Calc {
	void add();

	abstract void sub();

	int x = 90;// constant -- final
	// final public static
}
//class extends class 
//class implements interface 
//interface extends interface 

abstract interface BasicCalc {
	abstract void add();
}

class SciCalc {
	void sin() {

	}

}

//1 class can only extend 1 class
//1 class can implements n number of interface 
class Casio extends SciCalc implements BasicCalc {
	public void add() {

	}

	public void sub() {

	}

}