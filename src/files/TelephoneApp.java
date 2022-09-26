package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneApp {

	public static void main(String[] args) throws IOException {
		int choice = -1;
		Scanner scr = new Scanner(System.in);
		ArrayList<Contact> contacts = new ArrayList<Contact>();

		// old data => read ==> contacts.txt
		File f = new File("d://temp//contacts.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); // 1 => single line -> entire 1 line

		while (true) {

			String data = br.readLine();// first line
			if (data == null)
				break;

			String dataA[] = data.split(",");
			String cName = dataA[0];
			String cContact = dataA[1];

			Contact c = new Contact();
			c.setName(cName);
			c.setContactNum(cContact);
			contacts.add(c);
		}
		br.close();
		while (true) {
			System.out.println(
					"\n1 for add contact\n2 for list all contacts\n3 for search contact by name\nenter your choice ..");
			choice = scr.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Saving..... ");

				f = new File("d://temp//contacts.txt");
				FileWriter fw = new FileWriter(f);

				for (int i = 0; i < contacts.size(); i++) {
					String cname = contacts.get(i).getName();
					String cnum = contacts.get(i).getContactNum();

					fw.write(cname + "," + cnum + "\n");
				}

				fw.close();

				System.out.println("SHUTDOWN");
				System.exit(0);
			case 1:
				System.out.println("ADD CONTACT");
				Contact c = new Contact();
				c.inputContact();
				contacts.add(c);
				break;
			case 2:
				System.out.println("ALL CONTACTS");
				for (int i = 0; i < contacts.size(); i++) {
					contacts.get(i).display();
				}
				break;
			case 3:
				System.out.println("SEARCH CONTACT");
				break;
			}
		}
	}
}

//encapsulation 
class Contact {
	private String name;
	private String contactNum;

	// getters
	public String getName() {
		return name;
	}

	public String getContactNum() {
		return contactNum;
	}

	// setters
	public void setName(String x) {
		name = x;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	void inputContact() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name and contact Num");
		this.name = scr.next();
		this.contactNum = scr.next();
	}

	void display() {
		System.out.printf("\n%-15s%-10s", name, contactNum);
	}
}
