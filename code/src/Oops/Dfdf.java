package Oops;

public class Dfdf {

	private int Ac_No;
	private String IFSC;
	private int ATM_PIN;
	private int CCV;
	private String Bank_Name;
	private String Branch_Name;

		

	Dfdf(){
		 
		 this.Bank_Name="State Bank Of India";
		 this.Branch_Name="Cinnadharapuram";
		 this.IFSC="SBIN0085";
	 }
	Dfdf(int Ac_No,int ATM_PIN,int CCV) {
		this();
		this.Ac_No=Ac_No;
		this.ATM_PIN = ATM_PIN;
		this.CCV = CCV;
	}
	
	
	  void getBank_Name(){
			 System.out.println("The Customer Bank_Name:"+Bank_Name);
			 
		 }
	  void getBranch_Name(){
			 System.out.println("The Customer Branch_Name:"+Branch_Name);
			 
		 }
	  void getAc_No() {
			System.out.println("The Customer Account:"+Ac_No);
		}
	  void getIFSC(){
		 System.out.println("The Customer IFSC Code:"+IFSC);
		 
	 }
	  void getATM_PIN(){
			 System.out.println("The Customer ATM_PIN:"+ATM_PIN);
			 
		 }
	  void getCCV(){
			 System.out.println("The Customer CCV:"+CCV);
			 
		 }
	 
	

	public static void main(String arg[]) {
		Dfdf ob = new Dfdf(12345,2020,987);
		Dfdf ob1 = new Dfdf();
		ob1.getBank_Name();
		ob1.getBranch_Name();
		ob.getAc_No();

		ob1.getIFSC();
		ob.getATM_PIN();
		ob.getCCV();
		
		
		
	}

}
