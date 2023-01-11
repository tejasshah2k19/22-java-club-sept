package j8.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {

	public static void main(String[] args) {
		Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(27));
		System.out.println(d);
		System.out.println(d.getSeconds());
	}
}
//country 
//India-> Asia/Kolkata
//LOs -> A/L_A
//

//source -> india  2feb2023 16.15  
//dest -> Los 