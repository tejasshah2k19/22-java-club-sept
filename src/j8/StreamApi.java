package j8;

import java.util.ArrayList;

public class StreamApi {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//even
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Integer x : list) {
			System.out.println(x);
		}

		// java 8
		list.stream().forEach(System.out::println);
		
		
		
	}
}
