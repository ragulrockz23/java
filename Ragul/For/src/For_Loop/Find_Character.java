package For_Loop;

import java.lang.String;

public class Find_Character {
	String whole_letter[] = { "a", "b", "c", "a", "b", "c", "a", "e" };

	public static void main(String[] args) {
		Find_Character object = new Find_Character();
		object.count_duplicate();
		System.out.println("\n---------------------------------------------------");
		object.odd_index_values();

	}

	void count_duplicate() {

		String[] letters = new String[whole_letter.length];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = whole_letter[i];
		}
		for (int i = 0; i < letters.length; i++) {
			int count = 1;
			for (int j = i + 1; j < letters.length; j++) {

				if (letters[i] == letters[j]) {
					letters[j] = "0";
					count += 1;
				}

			}
			if (count > 1 && letters[i] != "0") {
				System.out.println(letters[i] + " Duplicate Letter Count = " + count);
			}

		}

	}

	void odd_index_values() {

		System.out.println("\nOdd Index Letters : ");
		for (int i = 0; i < whole_letter.length; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " index value = " + whole_letter[i]);

			}
			System.out.println();

		}

	}

}
