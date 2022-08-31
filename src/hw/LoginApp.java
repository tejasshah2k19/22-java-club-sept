package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int choice;
		User u = new User();

		while (true) {
			System.out.println("\n0 for Exit\n1 for Signup\n2 For Login\nEnter your choice");
			choice = scr.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:

				u.signup();
				break;

			case 2:
				System.out.println("Enter email and password");
				String email = scr.next();
				String password = scr.next();

				if (u.login(email, password) == true) {
					System.out.println("Login....done...");
				} else {
					System.out.println("Invalid Credentials....");
				}
				break;
			default:
				System.out.println("Invalid Choice PTA!!!!");
			}

		}

	}
}

class User {

	String name, email, password;
	int age;

	Scanner scr = new Scanner(System.in);

	void signup() {
		System.out.println("Enter firstName email and password");
		try {
			name = scr.next();
			email = scr.next();
			if (isValidEmail(email) == false) {
				throw new InvalidEmailException("Invalid Email Format");
			}
			password = scr.next();

			System.out.println("Enter age");
			age = scr.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Signup Fail :  Please Enter Valid age");
		} catch (InvalidEmailException e) {
			System.out.println("Signup Fail : Please Enter Valid Email");
		}
	}

	boolean login(String email, String password) {

		if (isValidEmail(email) == false) {
			throw new InvalidEmailException("Please Enter Valid Email");
		}
		if (this.email.equalsIgnoreCase(email) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}

	}

	boolean isValidEmail(String email) {
		if (email.endsWith("@gmail.com") && email.length() >= 12) {
			return true;
		}
		return false;
	}
}

class InvalidEmailException extends RuntimeException {
	public InvalidEmailException(String msg) {
		super(msg);
	}
}
