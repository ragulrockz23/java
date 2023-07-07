package string;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo obj= new StringDemo();
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		

	}
	public String toString() {
		return "Welcome to the String Class";
	}

}
