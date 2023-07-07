package first_package;

public class HCF {

		 public static void main(String arg[])
		 {
		  HCF object=new HCF();
		  object.hcf(14,6);
		 }
		   public void hcf(int a,int b)
		     {
		    int i=1;
		    int highest=0;
		     int small= a>b? b:a;
		     
		     while(i<=small)
		     { 
		     if(a%i==0 && b%i==0)
		        {
		        int  hrf=i;
		      highest=hrf;
		      }
		   
		     i++;   
		     } 
		    System.out.println("hcf number="+highest);
		   }
		}


