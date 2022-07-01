package inh;

public class Car {

//	Car() {
//		System.out.println("Car()");
//	}

	Car(int a) {// int a
		System.out.println("Car(int)");
	}

	Car(String x) {
		System.out.println("Car(String)");
	}

	public static void main(String[] args) {
//		Car c= new Car();

		Dzire d = new Dzire();
	}
}

class Dzire extends Car {
	Dzire() {
		super(20);// int
//		super("ram");
		System.out.println("Dzire()");
	}
}
