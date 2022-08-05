package inh;

public class ConstructorHierInheritance {

	public static void main(String[] args) {
		// Parent p = new Parent();//Parent()

		// Child c = new Child();// Child()
		Child c = new Child(30);// Parent() Child(int)

//		Parent p = new Parent(10);
	}
}


//Parent p =new Child(); 
//p.add(); 


class Parent {

//	Parent() {
//		System.out.println("Parent()");
//	}

	Parent(int x) {
		System.out.println("Parent(int)");
	}
}

class Child extends Parent {

	Child() {
		super(20); // super() //first line in constructor
		System.out.println("Child()");
	}

	Child(int x) {
		super(12);// super()
		System.out.println("Child(int)");
	}
}