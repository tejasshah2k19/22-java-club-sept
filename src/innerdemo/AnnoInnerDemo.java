package innerdemo;

public class AnnoInnerDemo {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.print();

		// anno inner class
		Print p1 = new Print() {

			public void print() {
				System.out.println("Print()");
			}
		};

		p1.print();

		p.add(new Print() {
			public void print() {
				System.out.println("Print()");
			}
		});
	}
}

interface Print {
	abstract void print();
}

class Printer implements Print {
	public void print() {
		System.out.println("Print()");
	}

	void add(Print p) {
		p.print();

	}

}