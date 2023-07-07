package StringLearing;

public class Task {

	public static void main(String[] args) {
		Task obj = new Task();
		obj.vowel_count();
		System.out.println("---------------------------------------");
		obj.vowels_index();
		System.out.println("---------------------------------------");
		obj.print_number();
		System.out.println();
		System.out.println("---------------------------------------");
		obj.reverse_string();
		System.out.println();
		System.out.println("---------------------------------------");

		obj.palindrome();
		System.out.println();
		System.out.println("---------------------------------------");

		obj.change_value();

	}

	void vowel_count() {
		String s = "india is my country and all indians are my brothers and sisters";
		char a[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count += 1;
			}
		}
		System.out.println("The Vowels Count :" + count);
	}

	void vowels_index() {
		String s = "india is my country and all indians are my brothers and sisters";
		char a[] = s.toCharArray();
		int i;
		int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {

				count++;
			} else if (s.charAt(i) == 'e') {

				count1++;
			} else if (s.charAt(i) == 'i') {

				count2++;
			} else if (s.charAt(i) == 'o') {

				count3++;
			} else if (s.charAt(i) == 'u') {

				count4++;
			}

		}
		System.out.println("a Letter Count " + count);
		System.out.println("e Letter Count " + count1);
		System.out.println("i Letter Count " + count2);
		System.out.println("o Letter Count " + count3);
		System.out.println("u Letter Count " + count4);

	}

	void print_number() {
		String s = "india celebrates the 71 independent day";

		int i;

		for (i = 0; i < s.length(); i++) {

			if (s.codePointAt(i) < 57 && s.codePointAt(i) > 48) {
				System.out.print(s.charAt(i));
			}

		}

	}

	void reverse_string() {
		String s = "i love you diii...";
		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}

	}

	void palindrome() {
		String s = "LOL";
		String ss = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ss = ss + s.charAt(i);
		}
		if (s.equals(ss)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	void change_value() {
		String msg = "My Age is 12 ";
		msg = msg.replaceFirst("12", "25");
		// msg=msg.replaceAll("a", "o");
		System.out.println(msg);
	}
	/*int a[]= {4,2,3,5,7,6,1};
	Arrays.sort(a);
	for(int i:a) {
	System.out.print(i);
	}*/
}
