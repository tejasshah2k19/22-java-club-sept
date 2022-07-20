
public class VarargsDemo {

	void sumArray(int a[]) {
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans = ans + a[i];
		}
		System.out.println(ans);
	}

	void sumVarArgs(int... a) {// var..arg
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans = ans + a[i];
		}
		System.out.println(ans);
	}

	void varargs1(int... x) {

	}

	void varargs2(int a, int b, int... z) {

	}
/*
 * invalid var args  
	
	
	void varargs3(int... a, int... b) {

	}

	void varargs4(int... a, int b) {

	}

	void varargs3(String... a, int... b) {

	}
*/
	public static void main(String[] args) {
		int x[] = { 1, 2, 3 };
		int y[] = { 1, 2, 3, 4, 5 };

		VarargsDemo obj = new VarargsDemo();

		obj.sumArray(x);
		obj.sumArray(y);
//		obj.sumArray(); //not work 
//		obj.sumArray(1,2,3); //not work 

		obj.sumVarArgs(x);
		obj.sumVarArgs(y);
		obj.sumVarArgs();
		obj.sumVarArgs(1, 2, 3);
		obj.sumVarArgs(1, 2, 3, 4);
		obj.sumVarArgs(1, 2, 3, 4, 5);
		obj.sumVarArgs(1);

	}
}
