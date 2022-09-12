package dateapi;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // cal init
		System.out.println(c); // toString -> Calendar

		System.out.println(c.get(Calendar.YEAR));// public static final
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));

		// Capital -> constant --> final

		System.out.println(c.getTimeInMillis());

		Date d1 = new Date(); // today
		Date d2 = new Date(1662559959874L);
		System.out.println(d1);
		System.out.println(d2);

	}

}
