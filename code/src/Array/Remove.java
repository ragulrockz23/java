package Array;
import java.util.Scanner;

public class Remove {
	int arr[];
	int size;
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Remove obj=new Remove();
		obj.rmv_duplicate();

	}
	void rmv_duplicate() {
		
		int i,j;
		int arr[]=new int[size];
		System.out.println("Enter the Size  :");
		size=sc.nextInt();
		System.out.println("Enter the Element :");
		for( i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Traverse on array
		for(  j=0;j<arr.length-1;j++) {
			if(arr[i] != arr[i+1]) {
				arr[j]=arr[i];//1 2 3 4 5 6 7
			}
		}
		
		//last element of an array
		arr[j++] = arr[arr.length-1];
		
		for(int k=0;k<j;k++) {
			System.out.println("After Removing the duplicate Element :" +arr[k]);
		}
	}

}
