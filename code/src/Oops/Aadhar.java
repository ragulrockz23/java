package Oops;

public class Aadhar {
	private int Age;
	//private String Name;
	//private long Number;
    static String Nationality="Indian";
    
    Aadhar(){
    	
    }
    Aadhar(int Age,String Name,long Number){
    	
    	this.Age=Age;
    	//this.Name=Name;
    	//this.Number=Number;
    	
    }
    void display() {
    	System.out.println(getAge() +""+getNumber()+""+Nationality);
    }
    
	 private int  getAge() {
		
		 return Age;
	
	}
	 private int getNumber() {
		// TODO Auto-generated method stub
		return 0;
	 }

	
	
	public static void main(String[] args) {
		
		Aadhar ob=new Aadhar(23,"Ragul",1234567890);
		ob.display();
		
		

	}

}
