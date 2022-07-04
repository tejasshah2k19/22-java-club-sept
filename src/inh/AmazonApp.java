package inh;

import java.util.Scanner;

public class AmazonApp {

	public static void main(String[] args) {
//		ProductNonIndia pn = new ProductNonIndia();
//		pn.getData();
//		pn.calculateDuty();
//		pn.display();
//		

		ProductIndia p[] = new ProductIndia[3];// 5
		ProductNonIndia pn[] = new ProductNonIndia[3];
		int indianCount = 0;
		int nonIndianCount = 0;

		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("\n0 for exit\n1 For Insert \n 2For Display");
			int choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n0 India\n1 NonIndia \nEnter choice");
				int subChoice = scr.nextInt();
				if (subChoice == 0) {
					// india
					p[indianCount] = new ProductIndia();// constructor
					p[indianCount].getData();//
					p[indianCount].calculateDiscount();
					indianCount++;// 1

				} else if (subChoice == 1) {
					// non india
					pn[nonIndianCount] = new ProductNonIndia();
					pn[nonIndianCount].getData();
					pn[nonIndianCount].calculateDuty();
					nonIndianCount++;// 1
				} else {
					System.out.println("PTA....");
				}
				break;
			case 2 - 2:

				System.exit(0);
			case 2:
				System.out.println("\nIndia Products\n");
				for (int i = 0; i < indianCount; i++) {
					p[i].display();
				}
				System.out.println("\n  NON  India Products\n");
				for (int i = 0; i < nonIndianCount; i++) {
					pn[i].display();
				}
			}

		}

//		for (int i = 0; i < p.length; i++) {
//			p[i] = new ProductIndia();//constructor 
//			p[i].getData();//
//			p[i].calculateDiscount();
//		}
//		for (int i = 0; i < p.length; i++) {
//			p[i].display();
//		}

	}
}

class Product {
	String name;
	int price;
	int qty;

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name price and qty");
		name = scr.next();
		price = scr.nextInt();
		qty = scr.nextInt();
	}

	void display() {
		System.out.print(name + " " + price + " " + qty + " ");
	}
	// getName
	// getPrice
	// getQty
}

//S{Single Responsiblity Class} O L I D 
class ProductIndia extends Product {
	int discount;
	float disocuntPerc;

	public ProductIndia() {
		this.disocuntPerc = 5;
	}

	void calculateDiscount() {
		this.discount = (int) (this.price * this.disocuntPerc) / 100;
	}

	void display() {
		super.display();
		System.out.println(discount);
	}

}

//KISS -> Keep It Simple , Stupid 
class ProductNonIndia extends Product {
	int duty;
	float dutyPerc;

	public ProductNonIndia() {
		this.dutyPerc = 5;
	}

	ProductNonIndia(float newDutyPerc) {
		this.dutyPerc = newDutyPerc;
	}

	void calculateDuty() {
		this.duty = (int) (this.price * this.dutyPerc) / 100;
	}

	void display() {
		super.display();
		System.out.println(duty);
	}
}