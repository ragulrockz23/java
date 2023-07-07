package first_package;

public class Recursion {
	public static void main(String arg[]) {
		Recursion ob = new Recursion();
		int fat = ob.fact(5);
		System.out.println(fat);
		ob.Neon(9);
		ob.Neon(132);

	}

	public int fact(int num) {
		if (num == 1) {
			return 1;

		}
		return fact(num - 1) * num;

	}
	public int Neon(int n) {
		int num=n;
		int square=num*num;
		if(square>9) {
		int split=square%10;
		int split1=square/10;
		int split2=square/100;
		int count=split+split1+split2;
		if(count==n)
		{
			System.out.println(n+" = is a Neon number");
		}
		else {
			System.out.println(n+" = is a not neon number");
		}
		if(n==num)
		{
			return n;
		}
		}
		return Neon(n);
	}

}
