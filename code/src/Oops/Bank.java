/**
 * 
 */
package Oops;

/**
 * @author ragul
 *
 */
public class Bank {

	/**
	 * @param args
	 */
	private int bal;
	double ROI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank c = new Bank();
		c.credit(500);
		c.credit(250);
		c.depit(700);
		c.check_balance();
		System.out.println(c.bal);

	}

	void credit(int amt) {
		bal = bal + amt;
		System.out.println("Successfully Deposited");
	}

	void depit(int amt) {
		bal = bal - amt;
		System.out.println("Successfully Depitted");
	}

	void check_balance() {
		System.out.println(bal);
	}

}
