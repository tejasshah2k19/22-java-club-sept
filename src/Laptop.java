
public class Laptop {

	private String name;
	private String brand;
	private int price;

	public static void main(String[] args) {

		Laptop l1 = new Laptop();
		l1.name = "Legion y 520";

		Printer p1 = new Printer();
		p1.setName("Canon D5200");
		System.out.println(p1.getName());
		// nonprimitive
		System.out.println(p1.toString());// ???hashcode -> memory location -> hexadecimal -> append class name
		// classname@hashcode

	}
}

class Printer {
	private String name;
	private String brand;
	private int price;

	// accessors
	// getters and setters

	public String getName() {
		return name;
	}

	// this --> current instance
	public void setName(String name) {
		this.name = name;// shadowing
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
