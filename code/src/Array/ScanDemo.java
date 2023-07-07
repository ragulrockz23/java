package Array;
import java.util.Scanner;
public class ScanDemo {
	
	int a,b;
	static Scanner in=new Scanner(System.in);//scanner object created

	void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String arg[]) {
	//new ScanDemo().add(7, 8);--->Anonymous object
	ScanDemo obj=new ScanDemo();	
	System.out.println("Enter X Value :");
	int a=in.nextInt();//run time input //cammel class
	System.out.println("Enter Y Value :");
	int b=in.nextInt();
	System.out.println("The Addition value is :");
	
	obj.add(a, b);
	}
}
