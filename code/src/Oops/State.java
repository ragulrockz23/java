package Oops;

public class State {
 
		   int rollno;
		   String name;  
		 private static final String college ="ITS"; 
		   
		   State(int r, String n){  
		   rollno = r;  
		   name = n;  
		   }  
		   
		   void display (){
			   System.out.println(rollno+" "+name+" "+college);
			   }  
	       
		 
	
		 public static void main(String args[]){  
		 State s1 = new State(123,"Ragul");  
		 State s2 = new State(234,"Saravana");  
		 
		 
		 s1.display();  
		 s2.display();  
		 }  
		 
}
