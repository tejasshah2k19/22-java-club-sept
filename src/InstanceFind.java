
public class InstanceFind {

	public static void main(String[] args) {
		Delhi d = new Delhi();
		Gujarat g = new Gujarat();

		India.whichState(d);
		India.whichState(g);

		India.add(10, 20);// int,int
		India.add(20.20, 10);// double,int
	}
}

class India {
	void add() {
		System.out.println("add India");
	}

	static void whichState(India india) {// polymorphism -> runtime
		//
		System.out.println(india.getClass().toString());
		if (india.getClass().toString().equals("class Delhi")) {
			System.out.println("Delhi");
		}

		if (india.getClass().toString().equals("class Gujarat")) {
			System.out.println("Gujarat");
		}

		// a == b
		if (india instanceof Delhi) {
			System.out.println("D");
		} else if (india instanceof Gujarat) {
			System.out.println("G");
		} else {
			System.out.println("I");
		}

		System.out.println("*************");
		india.add();//
	}

	static void add(double x, double y) {
		System.out.println(x + y);
	}
}

class Delhi extends India {
	void add() {
		System.out.println("add Delhi");
	}
}

class Gujarat extends India {
	void add() {
		System.out.println("add Guj");
	}
}