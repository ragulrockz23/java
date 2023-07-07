package first_package;

public class WOT_Fibo {
	public static void main(String args[])
	{
		  int f = 0;
	        int g = 1;

	        for(int i = 1; i <= 10; i++)
	        {
	            f = f + g;
	            g = f - g;
	            //System.out.print(f + " ");
	        

	        if(i<=1)
	        {
	        	System.out.println(0);
	        
	        }
	        if(i==2)
	        {
	        	System.out.println(1);
	        	
	        }
	        }
	}

}
