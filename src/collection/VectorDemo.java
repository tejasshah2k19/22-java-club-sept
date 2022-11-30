package collection;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		// dynamic array
//		ArrayList<Integer> list = new ArrayList<Integer>();// 10

		Vector<Integer> list = new Vector<>();// 10
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

		list.remove(0);// 0th index
		// 20 30
		System.out.println(list);// 20 30

		// search
		System.out.println(list.contains(10));// false

		list.add(55);
		// 20 30 55

		list.add(0, 100);
//		100 20 30 55 

		Vector<Integer> list1 = new Vector<>();// 10

		list1.add(2000);
		list1.add(12000);
		list.addAll(list1);
		// 100 20 30 55 2000 12000

		list.clear();
	}
}
