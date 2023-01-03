package j8.datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateDemo {

	// immutable
	// iso : yyyy-mm-dd
	static void findAge() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter year of DoB ? ");
		int year = scr.nextInt();
		System.out.println("Enter month of DoB ? ");
		int month = scr.nextInt();
		System.out.println("Enter date of DoB ? ");
		int date = scr.nextInt();

		LocalDate dob = LocalDate.of(year, month, date);
		System.out.println(dob.getYear());
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate.getYear());

		System.out.println(todayDate.getYear() - dob.getYear());
		// 34 year 20days
	}

	static void findAge2() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter DoB ?YYYY-mm-dd ");
		String d = scr.next(); // 1980-12-25
		String x[] = d.split("-");
		int year = Integer.parseInt(x[0]);
		int month = Integer.parseInt(x[1]);
		int date = Integer.parseInt(x[2]);

		LocalDate dob = LocalDate.of(year, month, date);
		System.out.println(dob.getYear());
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate.getYear());

		System.out.println(todayDate.getYear() - dob.getYear());

	}

	static void findAge3() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter DoB ?YYYY-mm-dd ");
		String d = scr.next(); // 1980-12-25

		LocalDate dob = LocalDate.parse(d);
		System.out.println(dob.getYear());
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate.getYear());

		System.out.println(todayDate.getYear() - dob.getYear());

	}

	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		System.out.println(l.toString());
		System.out.println(l);
		// 3 days
		// 28 days
		// 3+28 => 31-1-2023
		System.out.println(l.plusDays(28));
		System.out.println(l.plusDays(30));
		System.out.println(l);

		System.out.println(l.isLeapYear());
		System.out.println(LocalDate.of(2022, 1, 1));

		System.out.println("minus 30");
		System.out.println(l.plusDays(-30));
		System.out.println(l.minusDays(30));

//		findAge();
//		findAge2();
		findAge3();
	}
}
