/**
 * 
 */
package Oops;



/**
 * @author ragul
 *
 */
public  class EB_Calc implements EB_Bill {

	/**
	 * @param args
	 */
	int units;
	int tbill;
	int consumer_no;

	//static String Type_Of_Connection = "Domestic";
	String Consumer_Name;
 static	int LR;
	int CR;

	public static void main(String[] args) {

		EB_Bill bill = new EB_Calc();
	//	EB_Bill bill1 = new EB_Calc();
	//	EB_Bill bill2 = new EB_Calc();
		bill.setdata(123, "Ragul");
		
		bill.Calc(300);
		bill.getdata();
		bill.display();
		bill.Calc(300);
		bill.getdata();
		bill.display();

	}
	public void setdata(int consumer_no, String Consumer_name){
		
		this.consumer_no=consumer_no;
		this.Consumer_Name = Consumer_name;
		

	}

	/*EB_Calc(){
		
	}
	EB_Calc(){
		
	}*/

	
	public void getdata() {
		System.out.println(" Enter consumer number  :" + consumer_no);
		System.out.println(" Enter consumer name  :" + Consumer_Name);
		System.out.println(" Enter previous month reading  :" + LR);
		System.out.println(" Enter current month reading  :" + CR);

	}

	public void Calc(int CR) {
		this.CR=CR;
		this.units= CR-LR;
		this.LR= CR+LR;
		if (units <= 100) {
			tbill = 1 * units;
		} else if (units > 100 && units <= 200) {
			tbill = (int) (2.50 * units);
		} else if (units > 200 && units <= 500) {
			tbill = 4 * units;
		} else {
			tbill = 6 * units;
		}

		if (units <= 100) {
			tbill = 2 * units;
		} else if (units > 100 && units <= 200) {
			tbill = (int) (4.50 * units);
		} else if (units > 200 && units <= 500) {
			tbill = 6 * units;
		} else {
			tbill = 7 * units;
		}

	}

	public void display() {
		System.out.println("Your EB Bill :"+tbill);
	}

}
