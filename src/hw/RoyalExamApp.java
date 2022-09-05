package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class RoyalExamApp {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();

		while (true) {
			System.out.println("0 for exit");
			System.out.println("1 for add Student with result");
			System.out.println("2 for List Student");
			System.out.println("Enter choice");
			int choice = scr.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				Student s = new Student();
				s.getData();
				studentList.add(s);
				break;
			case 2:
				for (int i = 0; i < studentList.size(); i++) {
					studentList.get(i).printData();
				}
				break;
			}
		}
	}
}

class Student {

	String name;
	String batchName;
	String examName;
	int score;
	String facultyName;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name batchname facultyname examname and score");
		name = scr.next();
		batchName = scr.next();
		facultyName = scr.next();
		examName = scr.next();
		score = scr.nextInt();
	}

	void printData() {
		System.out.println(name + " : " + batchName + " : " + facultyName + " : " + examName + " : " + score);
	}

}

/*
 * 
 * Royal take exams of students and store information in app.
 * 
 * you need to desing that app in which faculty can add student's info with
 * their result. 1 student have only 1 result. but faculty can add more that 1
 * student.
 * 
 * menu looks like , 0. Exit 1. Add Student and Result 2. List Student
 * 
 * 
 * 
 * Student And Result Name, batchName, examName score, facultyName
 * 
 * 
 * notepad --> class -> variable -> method is a->inheritance has a-> property
 */