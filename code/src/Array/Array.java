package Array;

import java.util.Scanner;

public class Array {
	int arr[];
	int size;
	boolean senthil=false;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Array ob = new Array();
		
		System.out.println(ob);
		// ob.aggregate();
		ob.find_duplicate();

	}

	public void aggregate() {
		
		System.out.println("Enter the Size of Element");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int max = Integer.MIN_VALUE;

		int s_max = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				s_max = max;
				max = arr[i];
			}

		}
		System.out.println("The  Maximum Element:" + max);
		System.out.println("The Second Maximum Element:" + s_max);
	}

	public void find_duplicate() {
		
	int i;
		int count = 0;
		
		System.out.println("Enter the value:");
		int size = s.nextInt();
		arr = new int[size];
		System.out.println("array elements: ");
		for ( i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

		}

		for ( i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Dupicate Number Founded...");
					System.out.println(" The Repeated Number is : " + arr[j]);
					senthil=true;
					count++;
					
					
				}
				
			}

		}
		if (count != 0 ) {
			
			
			System.out.println("The Repeated Number Count : "+count);

		}
		if(senthil==false) {
			System.out.println("Dupicate Number  Not Founded...");
		}

	}

}
