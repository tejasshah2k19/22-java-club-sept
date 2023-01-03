package j8.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIdDemo {

	public static void main(String[] args) {
		ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		ZoneId LosZone = ZoneId.of("America/Los_Angeles");

		System.out.println(indiaZone);
		System.out.println(tokyoZone);
		System.out.println(LosZone);

		LocalTime l1 = LocalTime.now(indiaZone);
		LocalTime l2 = LocalTime.now(LosZone);

		System.out.println(l1.isBefore(l2)); // 10.30 | 12.30
		System.out.println(l2.isBefore(l1));

		System.out.println(l1);
		System.out.println(l2);

		LocalDateTime india = LocalDateTime.now(indiaZone);
		LocalDateTime los = LocalDateTime.now(LosZone);

		System.out.println(india);
		System.out.println(los);
		
		
		System.out.println(ZoneId.systemDefault());

		System.out.println(ZoneId.getAvailableZoneIds());

	}
}
