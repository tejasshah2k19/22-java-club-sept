package innerdemo;

public class Game {

	// board

	// player

	// score

	// stage

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		o.seeInner();

		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.seeOuter();

		OuterClass.InnerClass inner2 = o.new InnerClass();

		OuterNested.StaticInner staticInner = new OuterNested.StaticInner();
		staticInner.seeOuter();
	}
}

//inner class 
class OuterClass {// OuterClass.class
	private int k = 90;

	private class SecretInner {
		//
	}

	class InnerClass {// OuterClass$InnerClass.class
		public int t = 900;
		private int m = 900;

		void seeOuter() {
			System.out.println(k);
		}

	}

	void seeInner() {
		InnerClass in = new InnerClass();
//		System.out.println(t);
		System.out.println(in.t);
		System.out.println(in.m);
	}

}

//nested inner 
class OuterNested {
	// OuterNested$StaticInner.class
	int k = 20;
	static int p = 52;

	static class StaticInner {
		void seeOuter() {
//			System.out.println(k);
			System.out.println(p);
		}
	}
}

class MethodInner {
	void createInner() {
		class MethodLocalInner {
			int k = 222;

			void add() {
				System.out.println(k);
			}
		}
		//
	}

}