package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// unique
		// unordered
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(20);
		hs.add(30);
		hs.add(-30);
		hs.add(300);
		hs.add(20);
		hs.add(10);
		hs.add(30);// false
		System.out.println(hs);
		System.out.println(hs.size());// 5

		Iterator<Integer> it = hs.iterator();//

		while (it.hasNext()) {
			System.out.println(it.next());//
		}

		System.out.println(hs);
		hs.remove(90);//boolean -> false 
		hs.remove(10);
		System.out.println(hs);
		
		//hs.clear();
		//System.out.println(hs);
		
		hs.contains(20);//
		
		
		
		
		
		
	}
}
