package For_Loop;

public class Prime {

	public static void main(String[] args) {
		int n = 751;
		int reverse = 0;
		while (n > 0) {
			int a = n % 10;
			reverse = reverse * 10 + a;
			n /= 10;
		}
		
		int count = 0;
		
		for(int i=2;i<=reverse/2;i++) {
			if (reverse % i == 0) {
				count++;

			}
			
		}
		if (count==0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}

}
