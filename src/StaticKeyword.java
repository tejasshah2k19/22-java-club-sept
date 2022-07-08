
//static -> 
//class? no 
//method? yes 
//variable? yes 

public class StaticKeyword {

	public static void main(String[] args) {
		Aol aol = new Aol();
		aol.num = 123;
		aol.zing = 900;//
		System.out.println(aol.num);// 123
		System.out.println(aol.zing);// 900

		Aol aol2 = new Aol();
		System.out.println(aol2.num);// 0
		System.out.println(aol2.zing);// 900

		aol2.zing = 5000;//
		System.out.println(aol2.zing);// 5000
		System.out.println(aol.zing);// 5000

		Aol aol3 = new Aol();
		System.out.println(aol3.num);// 0

		System.out.println(Aol.zing);// static variable class name
		Aol.zing = 2525;
		System.out.println(aol.zing);
		System.out.println(aol2.zing);
		System.out.println(Aol.zing);
		Aol.print();
		aol2.print();
	}

}

class Aol {
	int num;// same as instance/object
	static int zing;// 1 and only 1 copy

	// non static -- instance method
	void add() {
		System.out.println(zing);
		System.out.println(num);
	}

	// static method
	static void print() {
		int yahoo = 90;//local 
		System.out.println(zing);
		System.out.println(yahoo);
//		System.out.println(num);
	}

}