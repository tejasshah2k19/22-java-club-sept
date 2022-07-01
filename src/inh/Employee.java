package inh;
//code reuse 

//process which -> object of one class can access property of another class 

//extends 

//Employee --> Parent 	Super 	Base 
//PartTimeEmployee --> Child sub  Derived
class PartTimeEmployee extends Employee {
	int majuri = 0;

	public int getMajuri() {
		return majuri;
	}

	public void setMajuri(int majuri) {
		this.majuri = majuri;
	}

}

public class Employee {
	String firstName;
	String lastName;
	private int salary;

	// default
	// no argument - default
	// call?
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.salary = 0;
		// System.out.println("Employee()");
	}

	public Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	// tax
	// leave

	public static void main(String[] args) {
		Employee e = new Employee();// Employee()
		Employee e2 = new Employee("ram", "patel", 200000);

		System.out.println(e);// hashcode
		System.out.println(e2);// hashcode

		System.out.println(e2.getSalary());

		e.setSalary(15000);
		e.setSalary(25000);

		System.out.println(e.getSalary());
//		System.out.println(e.setSalary(30000)); //error 

		PartTimeEmployee p = new PartTimeEmployee();
		p.setFirstName("KishorKaka");
		p.setLastName("patel");
		p.setMajuri(2500);
	}
}
