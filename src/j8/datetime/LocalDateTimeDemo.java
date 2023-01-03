package j8.datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);//
		System.out.println(l.get(ChronoField.DAY_OF_MONTH));
		System.out.println(l.get(ChronoField.DAY_OF_YEAR));

	}

}
