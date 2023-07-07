package Oops;

public class This1 {

	private int age;

	public void setAge(int age) {
		this.age = age;
	

	}

	public void getAge() {
		System.out.println("instance variable:" + age);
	}

	public static void main(String arg[]) {
		This1 obj = new This1();
	
		obj.setAge(24);
	     obj.getAge();	
	}
}
