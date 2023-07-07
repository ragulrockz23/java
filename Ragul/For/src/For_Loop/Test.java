package For_Loop;

public class Test {
	
	public void Palindrome() {
		int n=121;
		int reverse=0;
		int temp=n;
		while(n>0) {
			int a=n%10;
			reverse=reverse*10+a;
			n/=10;
		}
		if(temp==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	public void Fact() {
		int n=5,sum=1,i;
		for(i=1;i<=n;i++) {
		 sum=sum*i;
		}
		
		System.out.println("The Factorial Number :" +sum);
	}

	public static void main(String[] args) {
		Test ob=new Test();
		ob.Palindrome();
		ob.Fact();

	}

}
