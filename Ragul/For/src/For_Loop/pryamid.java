package For_Loop;

public class pryamid {

	public static void main(String[] args) {
		int i, j, row = 4;

		for (i = 0; i < row; i++) {

			for (j = row - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		for (i = 0; i < row; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = row; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
