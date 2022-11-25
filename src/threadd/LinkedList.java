package threadd;

import java.util.Scanner;

public class LinkedList {
	Node head = null;
	Node last = null;
	
	public static void main(String[] args) {
	}

	void addNode() {
		Scanner scr = new Scanner(System.in);
		if (head == null) {
			head = new Node();
			last = head;
			System.out.println("Enter number");
			head.data = scr.nextInt();
			head.next = null;
		} else {
			Node tmp = new Node();
			System.out.println("Enter number");
			tmp.data = scr.nextInt();
			tmp.next = null;
			last.next = tmp;
			last = tmp;
		}
	}

}

class Node {
	int data;
	Node next;
}
