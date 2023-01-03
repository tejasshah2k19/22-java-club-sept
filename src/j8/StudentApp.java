package j8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentApp {

	public static void main(String[] args) {
		StudentBean s1 = new StudentBean("arjun", "arjun@gmail.com", "123", 25, "Ahmedabad");
		StudentBean s2 = new StudentBean("karan", "karan@gmail.com", "456", 26, "Delhi");
		StudentBean s3 = new StudentBean("bhim", "bhim@gmail.com", "789", 28, "Ahmedabad");
		StudentBean s4 = new StudentBean("sahdev", "sahdev@gmail.com", "101112", 24, "Ahmedabad");

		ArrayList<StudentBean> students = new ArrayList<StudentBean>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

//		students.stream().forEach(s -> System.out.println(s.name));
		students.stream().filter(s -> s.age > 25).forEach(s -> System.out.println(s.name));
		List<String> names = students.stream().filter(s -> s.age > 25).map(s -> s.name).collect(Collectors.toList());
		// ArrayList => 25+
		System.out.println(names);
		
		students.stream().filter(new AgeFilter()).map(s->s.name).collect(Collectors.toList());
		
	}
}

class AgeFilter implements Predicate<StudentBean> {

	public boolean test(StudentBean t) {
		return t.age >25;
	}

}

class StudentBean {
	Integer studentId;
	String name;
	String email;
	String password;
	Integer age;
	String city;

	public StudentBean() {
		studentId = (int) (Math.random() * 1000000000);
	}

	StudentBean(String name, String email, String password, int age, String city) {
		studentId = (int) (Math.random() * 1000000000);
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.city = city;

	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
