
public class AtmMenu {

	void wid() {
		System.out.println("AtmMenu :: wid() ");
	}

	void dep() {
		System.out.println("AtmMenu :: dep() ");
	}

	public static void main(String[] args) {
		AtmMenuIcici atm = new AtmMenuIcici();
		atm.wid();
		atm.dep();
		atm.chkBal();
	}
}

//parent | super | base    --> giver 
//child  | sub   | derived --> taker 
class AtmMenuIcici extends AtmMenu {
	void chkBal() {
		System.out.println("AtmMenuICICI :: chkbal() ");
	}
}

//types inheritance 
/*
 * 
 * single level 
 * 
 * Parent 
 * 
 * Child 
 * 
 * multilevel 
 * 
 * GP
 * 
 * P
 * 
 * Child  
 * 
 * 
 * multiple 
 * 
 * Parent 	Parent 
 * 	    child
 * 
 * hirerchical 
 * 
 * 		P
 *   C			C 
 * T   X     J     L 
 * 
 * 
 * 
 * 
 * hybrid 
 * 
 * A      D
 * 
 *     B 
 * 
 * C
 * 
 * 
 * 
 * 
 * */


