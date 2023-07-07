package Array;

public class Min_Max {
	int arr[]= {10,20,30,40,50};

	public static void main(String[] args) {
		Min_Max ob=new Min_Max();
		ob.max();
		ob.min();

	}
	void max() {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					temp=arr[i];
				}
			}
		}
		System.out.println("The Second Maximum Value:"+temp);
		
		
	}
	void min() {
		int temp[]=new int[1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp[i+1]=arr[i];
				}
			}
		}
		System.out.println("The Second Minmum Value:"+temp);
	}

}
