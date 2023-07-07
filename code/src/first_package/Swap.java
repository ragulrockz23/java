package first_package;

public class Swap {
   public static void main(String arg[])
   {
	   //with out using temp variable
	   int a=10,b=15;
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println("Swap After a:"+a);
	   System.out.println("Swap After b:"+b);
   }
}
