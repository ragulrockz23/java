package Array;

import java.util.Scanner;

public class OE {
	Scanner sc = new Scanner(System.in);
	int arr[];
	int brr[];
	int crr[];
	int size;

	public static void main(String[] args) {
		OE obj = new OE();
		obj.Odd();

	}

	void Odd() {
		System.out.println("Enter the Size:");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter array element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("The Even Number:");
		brr = new int[brr.length];
		for (int i = 0; i < brr.length; i++) {
			if (arr[i] % 2 == 0) {
				brr[i] = arr[i];
			}
			System.out.print(brr[i] + " ");
		}
		System.out.println("The Odd Number:");
		crr = new int[crr.length];
		for (int i = 0; i < crr.length; i++) {
			if (arr[i] % 2 != 0) {
				crr[i] = arr[i];
			}
			System.out.print(crr[i] + " ");
		}
	}

}
