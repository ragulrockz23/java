package ExceptiionLearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		Error ob = new Error();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Value :");
		try {
			int first = sc.nextInt();
			System.out.println("Please Enter B Value :");
			int second = sc.nextInt();
			ob.add(first, second);
			ob.multiply(first, second);
			ob.divide(first, second);
			String firstString = String.valueOf(first);// change the string to integer 
		} catch (InputMismatchException e) {
			// e.getMessage();
			System.out.println("pls enter integer value...");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Final Exception");
		} finally {
			ob.thanks();
		}

	}

	private void multiply(int first, int second) {
		System.out.println(first * second);
	}

	private void add(int first, int second) {
		System.out.println(first + second);
	}

	private void divide(int first, int second) {
		System.out.println(first / second);
	}

	void thanks() {
		System.out.println("Shutdown");

		try {
			System.out.println(6 / 0);
		} catch (Exception e) {
			System.out.println("inside exception");
		}
	}

}
