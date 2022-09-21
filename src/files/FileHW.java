package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHW {

	public static void main(String[] args) throws IOException {
		hw2();
	}

	public static void hw2() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter file name");
		String f1 = scr.next();
		File x = new File(f1);

		if (x.exists()) {
			System.out.println("Size => " + (x.length() / 1024 / 1024)); // byte/1024 ->kb/1024->mb
		} else {
			System.out.println("file not found please try again!!!!");
		}

	}

	public static void hw1() throws IOException {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two file name");
		String f1 = scr.next();
		String f2 = scr.next();

		File x = new File(f1);
		File y = new File(f2);

		if (x.exists()) {
			if (y.exists()) {
				System.out.println("All Files Present....");
			} else {
				y.createNewFile();
				System.out.println(f2 + " created...");
			}
		} else {
			x.createNewFile();
			System.out.println(f1 + " created....");
		}

	}
}
