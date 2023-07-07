package StringLearing;

public class Sorting {

	public static void main(String[] args) {
		String ar[]= {"apple","orange","fig","banana"};
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i].compareTo(ar[j])>0) {
					String temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(String s:ar) {
			System.out.print(s+" ");
		}
		

	}

}
