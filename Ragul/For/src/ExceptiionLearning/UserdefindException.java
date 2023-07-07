package ExceptiionLearning;

public class UserdefindException {

	public static void main(String[] args) {
		UserdefindException ob = new UserdefindException();
		ob.eligibility(55);
		ob.divide(5, -5);
		try {
		System.out.println(ob.getIndex("apple", 'm'));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

	void divide(int a, int b) {
		try {
			int c = a / b;
			System.out.println(c);
			// return c;
		} catch (ArithmeticException e) {
			try {
				throw new DenominatorException("second number cannot be zero", e);
				// return 0;

			}

			catch (DenominatorException de) {
				System.out.println(de.getMessage());
			}
		}

	}

	void eligibility(int age) {
		try {
			if (age < 0) {
				throw new NegativeAgeException("Age cannot be negative");
			}
			if (age >= 18 && age <= 200) {
				System.out.println("you are eligible for voting");
			}
			if (age > 200) {
				throw new AgeLimitException("Age is above than the limit");
			}
		}

		catch (NegativeAgeException e) {
			System.out.println(e.getMessage());
		} catch (AgeLimitException e) {
			System.out.println(e.getMessage());
		}
	}

	int getIndex(String s, char c) throws StringIndexOutOfBoundsException {
		for (int i = 0; i <= s.length(); i++) {
			if (c == s.charAt(i)) {
				return i;
			}
		}
		return -1;
	}
}
