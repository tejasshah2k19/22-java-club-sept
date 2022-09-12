package hw.royalapp;

import java.util.ArrayList;
import java.util.Scanner;

public class RoyalApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int choice;
		ArrayList<User> users = new ArrayList<User>();//

		while (true) {
			System.out.println("0 For Exit\n1 For Signup\n2 For Login\nEnter your choice!!!");
			choice = scr.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("Enter Email");
				String email = scr.next();

				boolean found = false;//
				for (int i = 0; i < users.size(); i++) {
					if (users.get(i).findUserByEmail(email) == true) {
						found = true;
						break;
					}
				}

				if (found == true) {
					System.out.println("Email already exists...please try again..");
				} else {
					User user = new User();
					user.signup();// a a a, b b b , c c c
					users.add(user);
				}

				break;
			case 2:
				System.out.println("Enter Email and password!!");
				email = scr.next();
				String password = scr.next();
				found = false;// invalid credentials
				for (int i = 0; i < users.size(); i++) {
					if (users.get(i).authenticate(email, password) == true) {
						found = true;
						break;
					}
				}

				if (found == true) {
					System.out.println("Login!!!");
				} else {
					System.out.println("Invalid Credentials....");
				}

				break;
			case 3:
				for (int i = 0; i < users.size(); i++) {
					users.get(i).print();
				}
				break;
			default:
				System.out.println("Invalid Choice PTA!!!");

			}

		}
	}
}

class User {

	int userId;
	String firstName;
	String email;
	String password;
	String role;// student , admin , faculty

	User() {
		this.role = "student";
		this.userId = (int) (Math.random() * 1000000000);
	}

	void signup() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter FirstName Email and Password");
		this.firstName = scr.next();
		this.email = scr.next();
		this.password = scr.next();
	}

	void print() {
		System.out.println(userId + "\t" + firstName + "\t" + email + "\t" + password + "\t" + role);
	}

	boolean findUserByEmail(String email) {
		if (this.email.equalsIgnoreCase(email)) {
			return true;
		} else {
			return false;
		}
	}

	boolean authenticate(String email, String password) {
		if (this.email.equalsIgnoreCase(email) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
