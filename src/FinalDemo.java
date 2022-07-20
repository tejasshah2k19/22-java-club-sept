
//final --> 

//class  -- no1 can inherit 
//method -- can not override 
//variable -- can not modify 
public class FinalDemo {

	public static void main(String[] args) {

	}
}

class Ab {
	final int x = 10;// constant variable -- we can't modify
	final int z;

	Ab() {
		z = 10;
	}

	final void add() {
		System.out.println("add()");
		System.out.println("------");
	}

	void sub() {
		System.out.println("-");
	}
}

class AbChild extends Ab {
	// child can not orverride final method
	// void add() {
//		System.out.println("+++++++++++++");
//	}

	void sub() {
		System.out.println("0000");
	}
}

final class HM {

}

//class MM extends HM {
//
//}
