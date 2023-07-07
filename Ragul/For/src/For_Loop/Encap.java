package For_Loop;

public class Encap {
	private int bal;

	public static void main(String[] args) {
		Encap bal=new Encap();
		bal.set_bal(2500);
		bal.set_bal(575);
		bal.debit(1200);
		bal.get_bal();
		

	}
	void set_bal(int amt)
	{
		bal=bal+amt;
		System.out.println("Your Transaction Completed");
	}
	void debit(int amt)
	{
		bal=bal-amt;
		System.out.println("Successfully Debited");
	}
	void get_bal()
	{
		System.out.println(bal);
	}

}
