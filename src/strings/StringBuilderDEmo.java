package strings;

public class StringBuilderDEmo {

	public static void main(String[] args) {
		// String -->
		// SBuffer SBuilder

		// mutable
		StringBuilder sb = new StringBuilder("royal");
		System.out.println(sb);

		sb.append("education");
		System.out.println(sb);// royaleducation

		System.out.println(sb.reverse());// noitacudelayor

		String str = new String("ahmedabad");
		StringBuilder sbStr = new StringBuilder(str);
		sbStr.append(" gujarat");
		System.out.println(sbStr);

		// StringBuilder s123 = new StringBuilder(scr.next());

		str = sbStr.toString();// StringBuilder --> String
		System.out.println(str);

		StringBuilder sb1 = new StringBuilder("");// 2 4 8 16 32 64
		StringBuilder sb2 = new StringBuilder("royal");

		System.out.println(sb1.length());// 0
		System.out.println(sb2.length());// 5

		System.out.println(sb1.capacity());// 16
		System.out.println(sb2.capacity());// 21
		sb1.append("royal"); // 5

		sb1.delete(0, 5);// release 5 [0 1 2 3 4 ]

		StringBuilder sba = new StringBuilder("royaleducation");
		sba.replace(0, 2, "ROYALIndia");
		System.out.println(sba);

	}
}
