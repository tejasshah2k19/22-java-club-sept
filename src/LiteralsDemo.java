
public class LiteralsDemo {

	public static void main(String[] args) {

		int a = 10;// 10 integer
		float f = 22.22f;// F
		double d = 32.20;
		char x = 'a';
		char y = '\u0000';// unicode null
		// java ASCII - UNICODE
		// java 2 byte
		// A - 65
		// A - unicode -> ascii
//		char j = 'raaa';
		String ab = "royal";

		// number system
		// binary octal decimal hexadecimal

		int h0 = 0b10;// binary
		int h1 = 100;// decimal
		int h2 = 0100;// octal
		int h3 = 0X123ABC;// hexadecimal

		System.out.println(h0);// decimal
		System.out.println(h1);// decimal
		System.out.println(h2);// decimal

		int salary = 1000000;
		int salary1 = 10_00_000;
		System.out.println(salary);

		System.out.println(salary1);
	}

}
