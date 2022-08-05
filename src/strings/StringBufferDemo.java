package strings;

public class StringBufferDemo {

	public static void main(String[] args) {

		//mutable  
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb);
	
		sb.append("education");
		System.out.println(sb);//royaleducation 
	
		System.out.println(sb.reverse());//noitacudelayor 
	
		
		String str = new String("ahmedabad");
		StringBuffer sbStr = new StringBuffer(str);
		sbStr.append(" gujarat");
		System.out.println(sbStr);
		
		//StringBuffer s123 = new StringBuffer(scr.next()); 
		
		str = sbStr.toString();//StringBuffer --> String 
		System.out.println(str);
		
		
		StringBuffer sb1 = new StringBuffer("");//2 4 8 16 32 64 
		StringBuffer sb2 = new StringBuffer("royal");
		
		System.out.println(sb1.length());//0 
		System.out.println(sb2.length());//5 
		
		System.out.println(sb1.capacity());//16
		System.out.println(sb2.capacity());//21
		sb1.append("royal"); //5
		
		sb1.delete(0, 5);//release 5 [0 1 2 3 4 ]  
		
		StringBuffer sba = new StringBuffer("royaleducation");
		sba.replace(0, 2, "ROYALIndia");
		System.out.println(sba);


	}
}
