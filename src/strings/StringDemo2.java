package strings;

public class StringDemo2 {

	public static void main(String[] args) {

		String str = "royal";// immutable -- self destructive

		str.concat("education");// royaleducation
		System.out.println(str);// royal

		System.out.println(str.concat("education"));
		System.out.println(str);// royal

		str = str.concat("education");// royaleducation
		System.out.println(str);

		String name = "royal education";
		System.out.println(name.contains("al"));
		System.out.println(name.startsWith("roy"));
		System.out.println(name.endsWith("roy"));

		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 7));// 3 4 5 6

		System.out.println(name.replace("a", "A"));
		System.out.println(name);

		int doctorId = (int) (Math.random() * 10000);
		System.out.println(doctorId);
		
		String str1 = new String("royal").intern();

	}
}
