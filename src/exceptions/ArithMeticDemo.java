package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithMeticDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers");

		try {
			int a = scr.nextInt();// throw new InputmismatchEXception()
			int b = scr.nextInt();
			int c = a / b;// JVM -> throw new ArithmeticException();
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter 0 in second value");
		} catch (InputMismatchException e) {
			System.out.println("Please Enter only integers....");
		} catch (Exception e) {
			System.out.println("Something went wrong PTA ");
			// sendMailToDev(e.printStackTrace())
			e.printStackTrace();
		}
	
		System.out.println("END");
	}
}

//