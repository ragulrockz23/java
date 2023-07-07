package ragul;

public class Pattern {
	public static void main(String args[])
	{
		int i,j,rows=8;
		
		for(i=0;i<rows-1;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.println("*");
				
			}
			for(int k=0;k<=rows-1-i;k++) {
				System.out.println("*"+"");
			}
		System.out.println();
		}
		
	}

}
