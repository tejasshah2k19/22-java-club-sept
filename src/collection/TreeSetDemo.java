package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// unique
		// unordered
		TreeSet<Integer> hs = new TreeSet<Integer>();
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
		hs.remove(90);// boolean -> false
		hs.remove(10);
		System.out.println(hs);

		// hs.clear();
		// System.out.println(hs);

		hs.contains(20);//
		System.out.println(hs.tailSet(30));
		System.out.println(hs.headSet(30));
		
	}
}
