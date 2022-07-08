import java.util.Scanner;

public class ObjectCounter {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("1 Sell car\n2 For Total Car\nEnter choice");
			int ch = scr.nextInt();

			switch (ch) {
			case 1:
				Car c = new Car();
				System.out.println("enter name price");
				c.name = scr.next();
				c.price = scr.nextInt();
				break;
			case 2:
				System.out.println("total sell -> " + Car.getTotal());
				break;
			case 0:
				System.exit(0);
			}
		}
	}

}

class Car {
	Car() {
		total++;
	}

	String name;
	int price;
	private static int total = 0;

	public static int getTotal() {
		return total;
	}
}
