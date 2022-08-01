package strings;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb);
	
		sb.append("education");
		System.out.println(sb);
	
		System.out.println(sb.reverse());
	
		
		String str = new String("ahmedabad");
		StringBuffer sbStr = new StringBuffer(str);
		sbStr.append(" gujarat");
		System.out.println(sbStr);
		
		str = sbStr.toString();
		System.out.println(str);
		
		
		StringBuffer sb1 = new StringBuffer("");//2 4 8 16 32 64 
		StringBuffer sb2 = new StringBuffer("royal");
		
		System.out.println(sb1.length());//0 
		System.out.println(sb2.length());//5 
		
		System.out.println(sb1.capacity());//16
		System.out.println(sb2.capacity());//21
		sb1.append("royal"); //5
		
		sb1.delete(0, 5);//release 5 [0 1 2 3 4 ]  
		
		
	}
}
