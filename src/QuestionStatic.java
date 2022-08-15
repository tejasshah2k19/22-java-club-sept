
public class QuestionStatic {
	static {
		System.out.println("Static 0");
	}

	public static void main(String[] args) {
		System.out.println("i am from main");// 1
		Panda p = new Panda("panda");
	}
}
//class load -> static block [ call once ] 
//class instance --> instance block , constructor [ n time ] 

class Panda {
	Panda() {
		System.out.println("Panda()");
	}

	Panda(int a) {
		System.out.println("Panda(int)");
	}

	Panda(String x) {
		System.out.println("Panda(String)");// 5
	}

	{
		System.out.println("Instance 1");// 3
	}
	static {
		System.out.println("Static 1");// 2
	}
	{
		System.out.println("Instance 2");// 4
	}
}