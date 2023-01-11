package j8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(201);
		list.add(31);
		list.add(401);
		list.add(51);
		list.add(601);

		// even
		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

		// list->sublist->0th index
		// sublist -> no data
//		Integer data = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).get(0);
//		System.out.println("even => " + data);

		// how to extract single item
		// how to handle null or no item
		Optional<Integer> o = list.stream().findFirst().filter(i -> i % 2 == 0);

		if (o.isPresent()) {
			System.out.println(o.get());// get -> eject -> optional object
		} else {
			System.out.println("No Data Found..");
		}

		Optional<Integer> o1 = list.stream().findAny().filter(i -> i % 2 == 0);
		if (o1.isPresent()) {
			System.out.println(o1.get());// get -> eject -> optional object
		} else {
			System.out.println("No Data Found..");
		}

	}
}
