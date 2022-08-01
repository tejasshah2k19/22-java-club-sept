package strings;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter string");
//		String str = scr.next(); //royal edu -> royal 
		String str = scr.nextLine(); // jony jony yes papa
		System.out.println("Enter search word?");
		String word = scr.next();// jony

		// logic
		// jony jony yes jony papa
		// i
		// jony
		// j

		// method
		// split("")
		int count = 0;
		String data[] = str.split(" ");// jony jony yes jony papa
		// jony
		// jony
		// yes
		// jony
		// papa

		//String -> length()
		//String[] -> length 
		
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(word)) {
				count++;
			}
		}
		System.out.println(word+" found "+count+" time(s)");
	}
}
