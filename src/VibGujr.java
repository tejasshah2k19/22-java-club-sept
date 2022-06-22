//has a 
//is a 
class VG {
	int year;
	Industry s, r, h;// container ship
}

class Industry {
	String name;
	int totalParicipants;
}

public class VibGujr {

	public static void main(String[] args) {

		VG vg = new VG();
		vg.s = new Industry();
		vg.s.name = "soft";
		vg.s.totalParicipants = 12000;

		VibGujData v = new VibGujData();
		v.year = 2010;
		v.soft = 12000;
		v.realEstate = 1300;

		VibGujData u = new VibGujData();
		u.year = 2011;
		u.soft = 1200;
		u.realEstate = 13000;

		VibGujData w = new VibGujData();
		w.year = 2012;
		w.soft = 15000;
		w.realEstate = 16000;

		System.out.println("year Real Sw");
		v.display();
		u.display();
		w.display();
	}

}

class VibGujData {
	int year;// 2010 2011 2012 2013
	int soft;
	int realEstate;
//	int industry[];

	void display() {
		System.out.println(year + "  " + soft + "  " + realEstate);
	}
}
