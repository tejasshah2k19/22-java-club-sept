
public class X {

	public static void main(String[] args) {
		
		String s5= "";
		s5+=2;
		s5+='c';
		s5+=false;
		System.out.println(s5);
		System.out.println(s5 == s5.intern());
		
		
	}
}
