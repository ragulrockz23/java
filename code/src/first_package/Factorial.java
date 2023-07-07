package first_package;
import java.util.Scanner;
public class Factorial {
	static Scanner sc=new Scanner(System.in);
	public static void main(String arg[])
	{
		
		System.out.println("Enter the Value :");
		int number=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+number+" is: "+fact); 
	}
	     
}
