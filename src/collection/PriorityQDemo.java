package collection;

import java.util.PriorityQueue;

public class PriorityQDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(20); //offer 
		pq.add(120);
		pq.add(200);
		pq.add(-20);
		pq.add(210);
		pq.add(150);
		pq.add(80);
		pq.offer(200);
		
		
		//10 
		//1 2 3 4 5 6
		//[1 2 3 4 5 6                ]
		
		//-20 20  120 200 
		
		System.out.println(pq.size());
		System.out.println(pq);// unordered - unsorted
		// asc
		// return and remove top element from PQ
		System.out.println(pq.poll());// -20
		System.out.println(pq.poll());// 20
		System.out.println(pq.poll());// 80
		System.out.println(pq.poll());// 120
		System.out.println(pq.poll());// 150
		System.out.println(pq.poll());// 200
		System.out.println(pq.poll());// 210
		System.out.println(pq.poll());// null
		System.out.println(pq.size());

		// ArrayList - duplicate - read - sort
		// PriorityQueue - duplicate - read - sort
		// DSir TSir KMam [ ]
		// PQ -> poll -> DSir-> execute ->
		// Kmam -> execute ->
		// TSir -> execute ->
		
		//Cach -> [3,4,5,6,7] 
		//2 -> 1 2 
		//
		
		
	}
}
