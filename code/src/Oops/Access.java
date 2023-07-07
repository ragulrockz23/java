/**
 * 
 */
package Oops;

/**
 * @author ragul
 *
 */
  public  class Access {

	/**
	 * @param args
	 */
	
	public int age=25;
	protected int Bank_Bal=25000;
	private int ATM_Pin=1234;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Access ob=new Access();
	     ob.Fb_use();
	     ob.Lap_use();
	     System.out.println(ob.age);
	     System.out.println(ob.ATM_Pin);
	     System.out.println(ob.Bank_Bal);
	}
	protected void Fb_use() {
		System.out.println("Im using facebook");
		
	}
	protected void Lap_use() {
    	System.out.println("Im using Laptop");
    }
 
  
}
