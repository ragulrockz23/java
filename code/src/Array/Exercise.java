package Array;
import java.util.Scanner;

public class Exercise {
	int arr[];
	int n;
    static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		Exercise ob=new Exercise();
		ob.chg_element();
		ob.add();

	}
	void chg_element() {
		
		 
		System.out.println("Enter the Array Size:");
		n=s.nextInt();
		arr=new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				arr[i]=-1;
				System.out.println("After Changing the Element:"+arr[i]);
			}
		}
		
	}
	void add() {
		
		int i;
		
		arr=new int[n];
		
		int brr[]=new int[n];
		
		int c[]=new int[n];
		System.out.println("Enter the A Elements:");
		for( i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the B Elements:");
		for( i=0;i<brr.length;i++) {
			brr[i]=s.nextInt();
		}
		
		for( i=0;i<c.length;i++) {
			 c[i]=arr[i]+brr[i];
			 System.out.println("The Adding value: arr[i] + brr[i] =" + c[i]);
		}
	
		
	}

}
