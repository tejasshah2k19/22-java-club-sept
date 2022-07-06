package api;

import java.lang.Math;
import java.lang.String;

public class MathDemo {

	public static void main(String[] args) {
//		Math m = new Math();//lang 
		// all static
		String s = new String();

		double x = Math.sin(1500000000);
		double y = Math.sqrt(9);
		double z = Math.random();
		System.out.println(x);
		System.out.println(y);
		System.out.println((int) (z * 100000));// explicit cast
		int a = 9;
		float b = 2;
		float c = a / b;// implicit
		System.out.println(c);//
	}
}
