package first_package;


public class Test {
	
	public static void main(String arg[]) {
		Test obj=new Test();
		obj.pattern();
		System.out.println("******************************");
		obj.reverse_Array();
		System.out.println("******************************");
		obj.reverse();
		System.out.println("******************************");
		obj.table();
		System.out.println("******************************");
		obj.subset();
	}
	
	
	void pattern() {
		int size=5;
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				if(i==0||i==size-1) {
				System.out.print("*");
			}
				else {
					if(j==0||j==size-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
				}
			}
			
			}
			System.out.println("");
		}
	}
	void reverse_Array() {
		int arr[]= {3,1,7,5,2};
		int brr[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			brr[i]=arr[i];
		}
		 
		for(int i=brr.length-1;i>=0;i--) {
			System.out.println("After Reverse the Element:" +brr[i]);
		}
		
	}
	void reverse() {
		int num=7312;
		int a=0;
		int b=0;
		for (int i=1;num>0;i++) {
			int c=num%10;
			if(i%2==0) {
				a=a+c;
			}
			else {
				b=b+c;
			}
			num=num/10;
		}
		System.out.println("The Addition Value :"+a);
		System.out.println("The Addition Value :"+b);
		int d=a-b;
		System.out.println("Sum:"+d);
		
	}
	void table() {
		  int num = 7;
		  int size = 16;
	        for(int i = 1; i <= size; i++)
	        {
	            System.out.println(num + "*" + i + "=" +(num*i));
	        }
	}
	void subset() {
		int arr[]= {5,4,1,7,2};
		int brr[]= {5,4,2};
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(brr[i]==arr[j]) {
					System.out.println("The Subset of Array Element :" +arr[j]);
				}
			}
		}
	}
}
			
	
	


