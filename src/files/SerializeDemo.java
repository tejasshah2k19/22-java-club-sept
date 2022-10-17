package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// User u1 = new User();
		// u1.getData();

		File f = new File("d:\\temp\\user.ser");

		// object ->file->write-> ObjectOutputStream
		// object->file->read-> ObjectInputStream

		// FileOutputStream fos = new FileOutputStream(f);
		// ObjectOutputStream oos = new ObjectOutputStream(fos);
		// oos.writeObject(u1);
		// oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		User u2 = (User) ois.readObject();
		u2.printData();
		System.out.println("done.....");
		ois.close();
	}
}

//Serializable -> signal -> User class -> instance -> file ->store 
// marker interface --> an interface which does not have any method 
//empty interface 
class User implements Serializable {
	String firstName;
	String email;
	transient String password;
	int balance;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter firstname email password and balance");
		firstName = scr.next();
		email = scr.next();
		password = scr.next();
		balance = scr.nextInt();
	}

	void printData() {
		System.out.println(firstName + " " + email + " " + password + " " + balance);
	}
}