package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedUnCheckedException {

	public static void main(String[] args) throws IOException {

		// input -> Scanner
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name");
		String name2 = scr.nextLine();
		// 1 1.1
		// 2 1.2
		// 3 1.3
		// 4 1.4

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter name");
		String name = br.readLine(); // scan a line

		//
//		try {
//			System.out.println("enter name");
//			String name = br.readLine(); // scan a line
//		} catch (IOException e) {
//			System.out.println("IO Error");
//		}
	}

}
