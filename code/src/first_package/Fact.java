package first_package;

public class Fact {
 public static void main(String arg[])
 {
	 Fact obj=new Fact();
	 int ans=obj.fact(7);
	 System.out.println(ans);
 }
 public int fact(int n)
 {
	int fact=1;
	 if(n==fact)
	 {
		
		 return 1;
		 
	 }
	 else
	 {
		 return n*fact(n-1);
	 }
   
 }
}
