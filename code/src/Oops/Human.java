package Oops;

public class Human implements Animal{
	
	public static void main(String arg[]) {
		
		Mammal ob=new Human();
		Animal obj=new Human();
		ob.sleep();
		ob.eat();
		obj.behaviour();
		
		
	
	}
	 
	public void sleep() {
		System.out.println("Human & Animals will be sleep 8Hrs");
	}
	public void eat() {
		System.out.println("Human & Animals will be eat 3Times");
	}
	public void behaviour() {
		System.out.println("Aminals Attacks Other Animals ");
	}
}
