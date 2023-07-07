package StringLearing;

public class Demo {

	public static void main(String[] args) {
		String input="appleamma";
		System.out.println(findDuplicate(input));

	}
	static int findDuplicate(String s) {
		int count=0;
		char ar[]=s.toCharArray();
		for(int i=0;i<ar.length;i++) { 
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
