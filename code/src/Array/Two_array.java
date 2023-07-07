package Array;

public class Two_array {

	public static void main(String[] args) {
		Two_array ob = new Two_array();
		ob.merge();
		ob.rmv_duplicate();

	}

	void merge() {
		int arr[] = { 7, 5, 9, 2, 3, 11 };
		int brr[] = { 3, 5, 9 };

		int crr[] = new int[arr.length + brr.length];
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		int i;
		for (i = 0; i < brr.length; i++) {
			crr[i + arr.length] = brr[i];
		}
		System.out.println("The Merging Arrays:");
		for (i = 0; i < crr.length; i++) {
			System.out.print(" " + crr[i]);
		}

	}

	void rmv_duplicate() {
		int count = 0;

		int A[] = { 7, 3, 5, 1, 9 };
		int B[] = { 3, 4, 8 };

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					count += 1;

				}
			}
		}
		int C[] = new int[A.length + B.length - count];
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i];
		}
		int temp = A.length;
		for (int i = 0; i < B.length; i++) {
			boolean flag = false;
			for (int j = 0; j < A.length; j++) {
				if (B[i] == A[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				C[temp] = B[i];
				temp++;
			}
		}
		System.out.println(" \n After Rmoving duplicate Element:");
		for (int i = 0; i < C.length; i++) {
			System.out.print(" " + C[i]);
		}

	}
}