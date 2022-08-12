
public class Cricket {

	int players;
	static int thirdUmpire;

	// instance block
	// instance initializer block
	{
		this.players = 25;
		thirdUmpire = 9;
		System.out.println("instance init...block 1");
	}

	{
		this.players = 250;
		thirdUmpire = 90;
		System.out.println("instance init...block 2 ");
	}

	public Cricket() {
		this.players = 11;
		thirdUmpire = 3;
		System.out.println("Default constructor....");
	}

	public Cricket(int p) {
		this.players = p;
		thirdUmpire = 6;
		System.out.println("parameterized constructor...");
	}

	public static void main(String[] args) {
//		Cricket c = new Cricket();
//		System.out.println(c.players);// 11
//
//		Cricket c1 = new Cricket(33);
//		System.out.println(c1.players);//33
		System.out.println("main method.......");
		Cricket c2 = new Cricket(33);
		System.out.println(c2.players);
		System.out.println(c2.thirdUmpire);
	}

	// static block
	static {
//		players = 555;
		thirdUmpire = 999;
		System.out.println("static block ...1 ");
	}
	
	static {
		System.out.println("static block ..... 2 ");
	}

}
