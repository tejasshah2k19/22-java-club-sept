import java.util.Scanner;

public class OneDArrayDemo {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
//		int a[] = new int[5];
		System.out.println("Enter size?? ");
		int x = scr.nextInt();
		int a[] = new int[x];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a number");
			a[i] = scr.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// linear search
		// 11 22 33 44 55 ->
		// search ? 44
		// present
		// search ? 101
		// not present

		// binary search**
	}
}
