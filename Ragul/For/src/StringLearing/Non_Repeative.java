package StringLearing;

public class Non_Repeative {

	public static void main(String[] args) {
		String s="aasse";
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length-1;i++) {
			boolean flag=false;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]) {
					
					flag=true;
				
				}
			}
			if(flag==false) {
				System.out.println(a[i]);
				break;
			
			}
				
		}

	}

}
