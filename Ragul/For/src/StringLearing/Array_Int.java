package StringLearing;
import java.util.Scanner;
public class Array_Int {
	
	 static int ar[];
	 static int size;

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 
		 System.out.println("Enter the size : ");
		  size=sc.nextInt();
		 System.out.println("Enter the Value :");
		 ar=new int[size];
		/* for(int i=0;i<ar.length;i++) {
			 ar[i]=sc.nextInt();
		 }*/
		 
		
		 for(int i=0;i<ar.length;i++) {
			 int n=sc.nextInt();
			 boolean flag=false;
			 for(int j=0;j<ar.length;j++) {
				 if(ar[j]==n) {
					flag=true;
					break;
				 }
			 }
		 
			 if(flag==false) {
				ar[i]=n;
			 }
		 }
		 System.out.println("After Removing Duplicate :");
		 for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i]+" ");
		 }

	}
	
	

}
