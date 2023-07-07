package For_Loop;

public class for_loop {

	public static void main(String[] args) {
		for_loop ob = new for_loop();
		ob.fact();
		System.out.println("*******************************");
		ob.natural();
		System.out.println("*******************************");
		ob.rev_natural();
		System.out.println("*******************************");
		ob.sum();
		System.out.println("*******************************");
		ob.Even();
		System.out.println("*******************************");
		ob.Odd();
		System.out.println("*******************************");
		ob.Count();
		System.out.println("*******************************");
		ob.Digit();
		System.out.println("*******************************");
		ob.Sum_Digits();
		System.out.println("*******************************");
		ob.Sum();
		System.out.println("*******************************");
		ob.Reverse();
		System.out.println("*******************************");
		ob.palindrome();
		System.out.println("*******************************");
		ob.Factors();
		System.out.println("*******************************");
		ob.Twisted_Prime();
		System.out.println("*******************************");
		ob.Sum_Prime();
		System.out.println("*******************************");
		ob.Armstrong();
		System.out.println("*******************************");
		ob.fibo();
	}

	public void fact() {
		int i, number = 8, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial Number:" + fact);
	}

	public void natural() {
		int i, number = 8;
		for (i = 1; i <= number; i++) {
			System.out.println("The Natural Number:" + i);
		}
	}

	public void rev_natural() {
		int i, number = 8;
		for (i = 0; number > i; number--) {
			System.out.println("The Reverse Natural Number:" + number);
		}
	}

	public void sum() {
		int num = 100, i, sum = 0;
		for (i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum of Natural Numbers:" + sum);
	}

	public void Even() {
		int i, n = 10, sum = 0;
		for (i = 0; i <= n; i += 2) {

			sum += i;

		}
		System.out.println("The Sum of Even Number:" + sum);

	}

	public void Odd() {
		int sum = 0, i, n = 9;
		for (i = 0; i <= n; i += 1) {
			if (i % 2 == 1)
				sum = sum + i;

		}
		System.out.println("Sum of Odd Number:" + sum);
	}

	public void Count() {
		int count, num = 45327;
		for (count = 0; num != 0; ++count) {
			num /= 10;

		}
		System.out.println("Count Digits:" + count);
	}

	public void Digit() {
		int number = 12345;
		int first_digit = 0;
		int last_digit = 0;
		last_digit = number % 10;
		System.out.println("Last Digit:" + last_digit);

		for (; number != 0;) {

			first_digit = number % 10;
			number /= 10;

		}

		System.out.println("First Digit:" + first_digit);

	}

	public void Sum_Digits() {
		int number = 527;
		int first_digit = 0;
		int last_digit = 0;
		int sum;
		last_digit = number % 10;
		System.out.println("Last Digit:" + last_digit);

		for (sum = 0; number > 0;) {

			first_digit = number % 10;
			number /= 10;
			sum = first_digit + last_digit;

		}

		System.out.println("First Digit:" + first_digit);
		System.out.println("Sum:" + sum);
	}

	public void Sum() {
		int n = 567, sum ;
		for (sum=0;n > 0;) {
			sum = sum + n % 10;
			n = n / 10;

		}
		System.out.println("Sum of Digits:" + sum);

	}

//print the given number in reverse
	public void Reverse() {
		int n = 123;
		int R_num = 0;
		int a ;
		for (a=0;n > 0;) {
			a = n % 10;
			R_num = R_num * 10 + a;
			n = n / 10;

		}

		System.out.println("Reverse Number:" + R_num);
	}

//print given number in palindrome or not
	public void palindrome() {
		int r, sum = 0, temp;
		int n = 454;
		temp = n;
		for (;n > 0;) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

//print the all factors of the number
	public void Factors() {
		int x = 60, i;

		System.out.println("-----Enter the positive integer number-----");

		System.out.print("\nThe factors of the " + x + " are: ");
		for (i = 1; i <= x; ++i) {
			if (x % i == 0) {
				System.out.print(i + " ");
			}

		}
	}

//Reverse the given number and check it is prime or not.
	public void Twisted_Prime() {
		int n = 751, reverse = 0, sum = 0, flag;

		while ( n != 0) {
			reverse = n % 10;
			sum = sum * 10 + reverse;
			n = n / 10;
		}

		flag = 0;
		
		for (int j = 2; j <= sum / 2; j++) {

			if ((sum % j) == 0) {
				flag = 1;
			}
			break;
		}

		if (flag == 0) {

			System.out.println("\n Twisted Prime");
		} else {
			System.out.println("Not Twisted Prime");
		}
	}

//check the sum of the given number is prime or not
	public void Sum_Prime() {
		int number, count = 0, sum = 0;

		for (number = 0; number <= 100; number++) {

			int i;
			for (i = 2; i <= number / 2; i++) {

				if (number % i == 0) {

					break;
				}

			}
			if (count == 0 && number != 1) {

				sum = sum + number;
			}

			
		}

		System.out.println("The Sum of Prime Numbers from 1 to 100 is: " + sum);
	}

//check given Number Armstrong or not
	public void Armstrong() {
		int number = 371, originalNumber, remainder, result = 0;

		originalNumber = number;

		while ( originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if (result == number) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
	public void fibo() {
		int n1=0,n2=1,n3,i,count=10;
		for (i=0;count>0;i++) {
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
