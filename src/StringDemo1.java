
public class StringDemo1 {

	public static void main(String[] args) {

		String name2 = new String("royal");
		String name = "royal";// string pool constant
		String name3 = "royal";

		System.out.println(name.length());
		System.out.println(name.charAt(0));// r
		System.out.println(name.charAt(1));// o
		System.out.println(name.charAt(2));// y
//		System.out.println(name.charAt(6));//RuntimeError 

		System.out.println(name.indexOf('a'));// 3
		System.out.println(name.indexOf('z'));// -1

		String name4 = "royal a royal";
		System.out.println(name4.indexOf('a'));// 3
		System.out.println(name4.lastIndexOf('a'));//

		String email = "royal@gmail.com";
		String userEmail = "royal@gmail.com";

		boolean ans = email.equals(userEmail);
		System.out.println(ans);
		// strcmp => int
		// same ->0
		// not same str1-str2
		// india
		// indica
		// 0000-2
		email = "india";
		userEmail = "indica";
		int ans2 = email.compareTo(userEmail);// same ->0 else str1-str2
		System.out.println(ans2);

		email = "royal@GMAIL.com";
		userEmail = "royal@gmail.COM";

		System.out.println(email.equalsIgnoreCase(userEmail));

	}
}

//char name[45]; // 'r' 'o' 'y' 'a' 'l'
//class String { 
// char values[] ;

//} 

//gc -> garbage collector 
