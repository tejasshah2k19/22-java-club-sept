import java.util.Scanner;

public class BasicOop {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);// local
		Student std = new Student();
		Student std1 = new Student();

		std.getData();// calling
		std.printData();
		Student.print();
	}
}

//problem --> class {variable,method} -> object
class Student {
	// instance - 500
	String firstName;
	String email;
	String password;
	static int branchCode = 1; // 18
	int age;
	float fees;

	void getData() {
		Scanner scr = new Scanner(System.in);// local
		System.out.println("Enter firstName email password and age");
		firstName = scr.next();
		email = scr.next();
		password = scr.next();
		age = scr.nextInt();

	}

	void printData() {
		System.out.println(firstName + "\t" + email + "\t" + password + "\t" + age);
	}

	static void print() {
		System.out.println("print()");
	}
}
