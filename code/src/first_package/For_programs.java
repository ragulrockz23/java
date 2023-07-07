package first_package;

public class For_programs {
	public static void main(String args[]) {
		For_programs obj = new For_programs();
		obj.Pattern();
		System.out.println("****************************************************");
		obj.Pattern1();
		System.out.println("****************************************************");
		obj.Pattern2();
		System.out.println("****************************************************");
		obj.Pattern3();
		System.out.println("****************************************************");
		obj.Pattern4();
	}

	public void Pattern() {
		int size = 5;
		// loop to print the pattern
		for (int i = 0; i < size; i++) {
			// print spaces
			for (int j = 1; j < size - i; j++) {
				System.out.print(" ");
			}
			// print number
			for (int k = 0; k <= i; k++) {
				System.out.print(k + 1);
			}
			System.out.println();
		}
	}

	public void Pattern1() {
		
		int size = 5;

		for (int i = 1; i <=size; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void Pattern2() {
		int size = 5;
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size - i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void Pattern3()
	{
		int size=5;
		for(int i=1;i<=size;i++)
		{
			for(int k=5;k>=i;k--)
			{
				
			
					System.out.print(i);
			
			}
	
			for(int j=1;j<=size;j++) {
				
				System.out.print("");
			}
			System.out.println();
		}
	}
	public void Pattern4() {
		int x=1;
		int y=5;
		for(int row=1;row<=y;row++)
		{
			for(int z=y;z>=row;z--) {
				System.out.print("  ");
				
			}
			
			for(int col=1;col<=x;col++)
			{
				System.out.print("* ");
			}
			x+=2;
			System.out.println("");
		}
	}

}
