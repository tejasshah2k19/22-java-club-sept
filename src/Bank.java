
public class Bank {
	int bal;

	Bank() {
		bal = 10000;
	}

	Bank(int b) {
		bal = b;
	}

	void wid() {
		int amt = 9000; //
		bal = bal - amt;
	}

	void wid(int amt) {
		bal = bal - amt;
	}

	public static void main(String[] args) {

		Bank b = new Bank();// 10000
		Bank c = new Bank(25000);// 25000

	}
}
