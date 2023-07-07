package first_package;

public class Prime {

	public static void main(String arg[])
	{
		int n=17;
		int i=2;
		boolean flag=false;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			i++;
		}
		if(flag==true)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
		
	}
}
