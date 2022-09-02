package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorApp {

	public static void main(String[] args) {
		int choice = 0;
		// array of object

		ArrayList<Doctor> docList = new ArrayList<Doctor>();

		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("0 For Exit");
			System.out.println("1 for Add Doctor");
			System.out.println("2 For List Doctros");
			System.out.println("3 For Search By Name");
			System.out.println("4 For Search By Specialization");
			System.out.println("Enter your choice!!!");
			choice = scr.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				Doctor d = new Doctor();
				System.out.println("Enter name and specialization");
				d.name = scr.next();
				d.specialization = scr.next();
				docList.add(d);

				break;
			case 2:
				for (int i = 0; i < docList.size(); i++) {
					System.out.println(docList.get(i).doctorId + " : " + docList.get(i).name + " : "
							+ docList.get(i).specialization);
				}

				break;
			}
		}
	}
}

class Doctor {
	int doctorId;
	String name;
	String specialization;

	public Doctor() {
		this.doctorId = (int) (Math.random() * 100000);// 0.12152533
	}

}
