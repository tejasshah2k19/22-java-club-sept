package exceptions;

import java.util.Scanner;

public class TataMotors {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter email and password");
		String email = scr.next();
		String password = scr.next();

		GoogleApi google = new GoogleApi();

		boolean ans = google.authenticate(email, password);
		if (ans == true) {
			System.out.println("User LoggedIn");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}

//TataMotor -- Google 
