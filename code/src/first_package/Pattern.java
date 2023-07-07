package first_package;

public class Pattern {

	public static void main(String arg[])
	{
		int j;
		int i;
		
		for(i=1;i<=5;i++)
		{
			
			for(j=5;j>=1;j--)
			{
				if(i==j)
				{
				System.out.print(" 1");

				}
				else
				{
					System.out.print(" 0");
					
				}
				
			}
			System.out.println();
			
		}
		
		
	}
}
