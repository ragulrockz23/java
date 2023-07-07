package first_package;

public class Fibonacci {

	public static void main(String arg[])
	{
		int num1=-1,num2=1;
		int count=0;
		int n=10;
		while(count<n)
		{
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			count+=1;
			System.out.println(num3);
			
		}
	
	}
	
}
