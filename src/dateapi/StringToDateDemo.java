package dateapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringToDateDemo {

	public static void main(String[] args) {
//
		Date d = new Date();
		System.out.println(d.getMonth());

		DateFormat df = DateFormat.getDateInstance();// Med
		System.out.println(d);
		System.out.println(df.format(d));

		DateFormat dfShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dfShort.format(d));

		DateFormat dfMed = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dfMed.format(d));

		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dfLong.format(d));

		DateFormat dfFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dfFull.format(d));

		Locale fr = new Locale("fr");
		DateFormat dfFullFR = DateFormat.getDateInstance(DateFormat.FULL, fr);
		System.out.println(dfFullFR.format(d));

		Locale hi = new Locale("hi", "in");
		DateFormat dfFullHI = DateFormat.getDateInstance(DateFormat.FULL, hi);
		System.out.println(dfFullHI.format(d));

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Dob : dd/mm/yy");
		String dob = scr.next();
		System.out.println(dob);// short

		try {
			Date dobDate = dfShort.parse(dob);// short

			System.out.println(dobDate.getDay());
			System.out.println(dobDate.getMonth());
			System.out.println(dobDate.getYear() + 1900);

		} catch (ParseException e) {
			System.out.println("Invalid Format");
			e.printStackTrace();
		}

	}
}
