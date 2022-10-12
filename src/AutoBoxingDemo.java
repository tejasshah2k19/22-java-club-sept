import java.util.ArrayList;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		int a = 10; // primitive
		Integer i = new Integer(10); // non primitive

		System.out.println(a == i);// 5 unBoxing
		System.out.println(a == i.intValue());

		Integer x = 10; // boxing new Integer(10);

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(20); //new Integer(20);  boxing
		list.add(a); // boxing

		
		String str = "123";
		int strInt = Integer.parseInt(str);
		
		int h = 20; 
		Integer hh = h; 
		Integer hx = Integer.valueOf(h);
	
	}
}
