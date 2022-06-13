
public class DefaultValue {

	public static void main(String[] args) {
		StudentG sg = new StudentG();
		sg.printData();
	}
}

class StudentG {
	String firstName;//class - null
	char gender;//null character - '\0' 
	int rollNo;//0
	float fees;//0.0
	boolean isPaid;//false 

	StudentG(){
		isPaid = true;
	}
	
	 
	// get

	void printData() {
		System.out.println(firstName);//null
		System.out.println(gender);//null character 
		System.out.println(rollNo);//0
		System.out.println(fees);//0.0
		System.out.println(isPaid);//false
	}
}