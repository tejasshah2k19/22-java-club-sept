import java.util.Scanner;

public class JaggedRaggedArray {

	public static void main(String[] args) {

		int a[][] = new int[3][];// 8
		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {// 3
			System.out.println("How many Records you want to store on " + (i + 1) + " row");// 1
			int x = scr.nextInt(); // 6
			a[i] = new int[x];//
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value");
				a[i][j] = scr.nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		// a = null;
//		a.close();
	}
}
