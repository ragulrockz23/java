package Array;
import java.util.Scanner;
public class A_Rotation {
  Scanner sc=new Scanner(System.in);
  int arr[] ;
  int size;
	public static void main(String[] args) {
		A_Rotation ob=new A_Rotation();
		ob.rotation();

	}

	void rotation() {
		
		
		System.out.println("Enter Array Size:");
		size=sc.nextInt();
	    arr=new int[size];
		int brr[] = arr;
		System.out.println("Array Value:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		
		}
		
		int temp=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
			}
		arr[arr.length-1]=temp;
		
				System.out.println("First rotate array");
				for(int k=0;k<arr.length;k++)
				{
					System.out.print(arr[k]+" ");
				}
		
		int temp1=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=temp1;
		
		System.out.println("\n Array after rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		
		}

	}

}
