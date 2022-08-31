package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		// dynamic array
		ArrayList<Integer> list = new ArrayList<Integer>();// 10

		list.add(10);// 0th index
		list.add(20);// 1st index
		list.add(30);// 2nd index
		// 8 used -> 50% size ->then --> i will add more 50%

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int x = scr.nextInt();
		list.add(x);
		x = scr.nextInt();
		list.add(x);
		x = scr.nextInt();
		list.add(x);

		System.out.println(list);
		System.out.println(list.get(2));// 30

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
