package string;

public class AsciiDemo {

	public static void main(String[] args) {
		AsciiDemo ob = new AsciiDemo();
		ob.lower();
		System.out.println("***************************************");
		ob.upper();
		System.out.println("***************************************");
		ob.number();

	}

	void lower() {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < alphabets.length(); i++) {
			char ch = alphabets.charAt(i);
			//alphabets.codePointCount(ch , i);
			System.out.println("ASCII value of " + ch + " is - " + (int) ch);
		}
	}

	void upper() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < alphabet.length(); i++) {
			char ch1 = alphabet.charAt(i);
			System.out.println("ASCII value of " + ch1 + " is - " + (int) ch1);
		}
	}

	void number() {
		String number = "0123456789";
		for (int i = 0; i < number.length(); i++) {
			char ch2 = number.charAt(i);
			System.out.println("ASCII value of " + ch2 + " is - " + (int) ch2);

		}

	}

}
