package Array;

import java.util.Scanner;

public class Sorting {
	public static void main(String arg[]) {
		Sorting ob = new Sorting();
		ob.adjacency();
	}

	Scanner sc = new Scanner(System.in);
	int a[];
	int size;

	void adjacency() {

		System.out.println("Enter the Size");
		size = sc.nextInt();
		a = new int[size];
		boolean flag = false;
		System.out.println("Enter the Array Element:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("User input:");
		int n = sc.nextInt();

		System.out.println("Adjacency of Array");
		for (int i = 0; i < a.length; i++) {

			if (n == a[i]) {
				flag = true;
				if (i != 0 && i != a.length - 1) {
					System.out.print(a[i + 1] + " ");
					System.out.print(a[i - 1] + " ");

				}
				if (n == a[i] && i == 0) {

					System.out.print(a[i + 1] + " ");

				}
				if (n == a[i] && i == a.length - 1) {
					System.out.print(a[i - 1] + " ");
				}
			}

		}
		if (flag == false) {
			System.out.println("Your number not founded...");
		}

	}
	
}
