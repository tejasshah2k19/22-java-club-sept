
public class EncapsulationDemo {

	public static void main(String[] args) {
		BankBob b = new BankBob();
//		b.balance = 1233;

		b.setBalance(25000);
		System.out.println(b.getBalance());
	}
}

class BankBob {
//int balance; //not good 

	private int balance; // follow this
	private boolean lock;

	public void setBalance(int amt) {
		balance = amt;
	}

	public int getBalance() {
		return balance;
	}

	public void setLock(boolean value) {
		lock = value;
	}

	public boolean isLock() { // getLock()
		return lock;
	}

}
