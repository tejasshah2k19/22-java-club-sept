package dateapi;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// date -> Date
		// util
		// sql

		Date d = new Date();
		System.out.println(d.toString());// object => hashcode
		// toString -> Date -> print Date MM:HH:SS XXXXX

		int h = d.getHours();
		System.out.println(h);

		int m = d.getMinutes();
		System.out.println(m);

		System.out.println("date => " + d.getDate());// 7
		// month that starts with 0
		System.out.println("month => " + d.getMonth());// 8
		
		int year = d.getYear(); // 2022 - 1900 => 122 
		
		System.out.println("Year => " +  (1900+year));
		//2022 - 1900 =>   
		KBC k = new KBC();
		System.out.println(k.toString());// object -> hashcode

	}
}

class KBC {
	/*
	 * public String toString() { return "ABC"; }
	 */
}
