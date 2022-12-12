package collection;

public class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("ram", 25);// 124525
		Employee e2 = new Employee("ram", 25);// 256252
		Employee e3 = e1;
		System.out.println(e1 == e2);// false
		System.out.println(e1 == e3);// true

		// Object -> equals()

		System.out.println(e1.equals(e2));// == false
		System.out.println(e1.equals(e3));// == true

		System.out.println(e1);// address | hashcode
		System.out.println(e2);// .toString()
		System.out.println(e2.toString());
		//hashCode? 
		//equals?
		//toString?
		
		//override
	}
}
