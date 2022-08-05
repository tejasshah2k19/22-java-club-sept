
public class ConstructorDemo {
	public static void main(String[] args) {
		StudentC sc = new StudentC();//default constructor 
		sc.printData();
	}
}

class StudentC {
	String firstName;// class - null - ram 
	char gender;// null character - '\0'
	int rollNo;// 0
	float fees;// 0.0
	boolean isPaid;// false

	// get

	// constructor -- special method same name as class name
	// and it must not have any return type.

	// use --> to initialize instance variable.
	// implicit - default no arg
	// explicit - default no arg , arg parameterized
	public StudentC() {
		firstName = "ram";
	}

	void printData() {
		System.out.println(firstName);// null
		System.out.println(gender);// null character
		System.out.println(rollNo);// 0
		System.out.println(fees);// 0.0
		System.out.println(isPaid);// false
	}
}