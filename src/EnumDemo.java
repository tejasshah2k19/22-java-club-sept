import java.util.Calendar;
import java.util.Scanner;

public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(Days.MONDAY);// MONDAY
		System.out.println(Days.MONDAY.value);// 1

		Calendar c = Calendar.getInstance();

		System.out.println(c.get(0));// 1
		System.out.println(c.get(1));// 2022
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));// 31

		Scanner scr = new Scanner(System.in);
		System.out.println("1 For Add\n2 For sub\n3  For mul\nEnter choice");
		int ch = scr.nextInt();

		if (ch == Calc.ADD.v) {
			//
			//
		}
	}

}

class A {
	final int SUNDAY = 0;
	final int MONDAY = 1;
	final int TUE = 2;
	final int WEN = 3;

}

//collection of final -- constants 
enum Days {
	SUNDAY(0), MONDAY(1), TUE(2), WEN(3), THUS(4), FRI(5), SAT(6);
	int value;// variable

	Days(int v) {
		this.value = v;
	}
}

enum Drink {
	SMALL('S', 1);
	int value;
	char c;

	Drink(char x, int y) {
		this.c = x;
		this.value = y;
	}
}

enum Calc {
	ADD(1), SUB(2), MUL(3);

	int v;

	Calc(int x) {
		this.v = x;
	}
}
