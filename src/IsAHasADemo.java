
public class IsAHasADemo {

	public static void main(String[] args) {

	}
}

class CarC {
	int engine; // property ==> has a
}

//inheritance ==> is a 
class DzireC extends CarC {
	HybridFuel fuel;
}

class Fuel {

}

class HybridFuel extends Fuel {

}

/*
 * Dzire is a Car. Car Has an Engine. Dzire has HybridFuel. HybridFuel is Fuel.
 */
