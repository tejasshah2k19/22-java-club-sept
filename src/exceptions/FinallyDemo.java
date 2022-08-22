package exceptions;

public class FinallyDemo {
	public static void main(String[] args) {

		int a[] = new int[3];

		try {
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 10;// 0 1 2
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index exception...");
		} finally {
			System.out.println("FINALLY");
		}
		System.out.println("End");
	}
}
