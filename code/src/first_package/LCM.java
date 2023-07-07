package first_package;

public class LCM {
	public static void main(String arg[])
	
	
	{
		  LCM obj=new LCM();
		    obj.lcm(8,16);
		    obj.lcm_three(6,14,22);
		    obj.lcm_three(6,5,10);
		 }
		 public void lcm(int a,int b)
		 {
		  int large=a>b?a:b;
		  while(true)
		  {
		   if(large%a==0 && large%b==0)
		   {
		    System.out.println(large);
		     break;
		   }
		   large++;
		  }
		 }

		 //LCM three numbers using while loop
		 public void lcm_three(int a, int b,int c)
		
			  {
			  int large=a>b?a:b;
			  int larger=large>c? large:c;
			  while(true)
			  {
			   if(larger%a==0 && larger%b==0 && larger%c==0)
			   {
			    System.out.println("lcm number="+larger);
			     break;
			   }
			   larger++;
			  }
			 }

			}
		 
		
