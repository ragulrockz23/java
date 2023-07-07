package StringLearing;
import java.util.Scanner;
public class string_duplicate_remove {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size=sc.nextInt();
		String ar[]=new String[size];
		System.out.println("Enter Name :");
		for(int i=0;i<ar.length;i++) {
			String s=sc.next();
			boolean flag=false;
			for(int j=0;j<ar.length;j++) {
				if(s.equals(ar[j])) {
					flag=true;
					break;
					
				}
			}
			if(flag==false) {
				ar[i]=s;
			}
		}
		System.out.println("After Removing Duplicate :");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	

	}

}
