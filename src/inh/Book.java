package inh;

public class Book {

	Book() {
		System.out.println("Book()");
	}

	Book(int a) {
		this("Ram");
		System.out.println("Book(int)");
	}

	Book(String a) {
		this();
		System.out.println("Book(String)");
	}

	public static void main(String[] args) {

		Book b = new Book(12);
	}
}
