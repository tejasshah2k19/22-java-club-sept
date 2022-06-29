import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][];
		a = new int[3][2];

		int b[][] = new int[2][3]; // 00 0
		Scanner scr = new Scanner(System.in);

		//00 01 02 
		//10 11 12 
		
		//00 01 02
		//10 11 12  
		
		//0 1 2
		//0 1 
		for (int i = 0; i < b[0].length; i++) { //0 1 2  
			for (int j = 0; j < b.length; j++) {//0 1   
				System.out.println("Enter number for -> "+ j +" "+i);
				b[j][i] = scr.nextInt();//00 10 01 11  02 12 
			}
		}
		
		

		for (int i = 0; i < b.length; i++) { //total row 
			for (int j = 0; j < b[i].length; j++) {//b[i] -> 1st row -> 
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}

	}
}
