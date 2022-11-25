package concurrencyd;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolDemo {

	public static void main(String[] args) {
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);

		Thread t1 = null;
		ex.scheduleAtFixedRate(t1, 1, 1, TimeUnit.MINUTES);
		// 1 1 1 1 1
		// 31 days
		ex.scheduleWithFixedDelay(t1, 5, 10, TimeUnit.SECONDS);

		// bar -> near [0.001]
		
		//X -> 12   googlemarketplaceid 
		
		//y -> 10
		//Z -> 10 
		
	}
}

//nearby app 
//
//cafe 
//atm
//bank 
//bar 
