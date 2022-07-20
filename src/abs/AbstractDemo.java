package abs;

public class AbstractDemo {

	public static void main(String[] args) {
		ICICI dhirajSir = new ICICI();

		dhirajSir.wid();
		dhirajSir.giveInt();

//		PNB nirav = new PNB();
		LIC lic = new LIC();
		lic.dep();
	}
}
//abstract keyword -> method,class 

//class - abstract --- abstract + non abstract 
//class - nonAbstract --> we have only non abstract method 
//if your class is an abstract class then we cant't create instance/object 
abstract class RBI {
	void giveInt() {
		System.out.println("INTR");
	}

	// abstract method
	// declaration
	abstract void wid();

	abstract void dep();
}

abstract class PNB extends RBI {
	//constructor
	
	void wid() {

	}
}

class LIC extends PNB {

	void dep() {

	}
}

class ICICI extends RBI {
	void wid() {
	}

	void dep() {
	}
}

class Lom extends ICICI {
}

class SBI extends RBI {
	protected void wid() {
	}

	void dep() {
	}
}