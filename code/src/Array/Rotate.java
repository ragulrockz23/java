package Array;

import java.util.Scanner;

public class Rotate {
	Scanner sc = new Scanner(System.in);
	int a[];
	int size;

	public static void main(String[] args) {
		Rotate obj = new Rotate();
		obj.rotation();

	}

	public void rotation() {
		System.out.println("Enter the Size:");
		size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter the Array Element:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int temp = a[a.length - 1];

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;

		System.out.println("After Rotation");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
