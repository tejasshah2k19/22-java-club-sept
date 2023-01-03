package j8.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime l = LocalTime.now();
		System.out.println(l);
	
		LocalTime l1 = LocalTime.of(21, 00);
		System.out.println(l1);
		System.out.println(l1.plusMinutes(45).plusMinutes(45));
		
		
		
	}
}
