/**
 * 
 */
package first_package;

/**
 * @author ragul
 *
 */
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int i=153,Number,temp,sum=0;
			
				for(Number=i;Number!=0;Number/=10)
			{
				temp=Number%10;
				sum=sum+(temp*temp*temp);
				
			}
			if(sum==i)
			{
				System.out.println(i+" : Armstrong");
	}
			else {
				System.out.println(i+":Not Armstromg");
			}
			
	}

}
