package For_Loop;

public class Pattern {
	public static void main(String arg[]) {
		Pattern ob = new Pattern();
		ob.character();
		System.out.println("*******************************");
		ob.Prime();
		System.out.println("*******************************");
		ob.Sum();
	}

	public void character() {

		int size = 4;
		char a = 'a';
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print(a + " ");
			}
			a++;
			System.out.println();
		}

	}

	public void Prime() {

		int n = 149327;
		int reverse = 0;
		while (n > 0) {
			int a = n % 10;
			reverse = reverse * 10 + a;
			n = n / 10;

		}
		int i = 1;
		int count = 0;
		while (reverse > i) {

			if (reverse % i == 0) {
				count++;

			}
			i++;
		}
		if (count == 2) {
			System.out.println("Prime");

		} else {
			System.out.println("Not Prime");
		}

	}

	public void Sum() {
		int i = 149327,count=0,sum=0,sum1=0;
       while(i>0)
       {
    	   int n=i%10;
    	   count=count+1;
    	   
       
       if(count%2==0)
       {
    	   sum=sum+n;
       }
       else {
    	   sum1=sum1+n;
       }
       i=i/10;
	}
       System.out.println("Sum of Even:"+sum);
       System.out.println("Sum of Odd:"+sum1);
       int sub=sum-sum1;
       System.out.println("Subtraction:"+sub);
	}

}
