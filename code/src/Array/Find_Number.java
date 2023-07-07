/**
 * 
 */
package Array;

/**
 * @author ragul
 *
 */
import java.util.Scanner;

public class Find_Number {

	/**
	 * @param args
	 */
	static int arr_count;
	int no[];
	static int src;
	boolean flag=false;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Find_Number obj = new Find_Number();
		obj.size();
		obj.geno();
		obj.search(src);

	}

	public void size() {
		
		System.out.println("Enter the Size of  Number :");
		arr_count = sc.nextInt();
		System.out.println("Search The Number:");
		src= sc.nextInt();
		// int no[] = new int[arr_count];
		
	}

	public void geno() {
		
		no= new int[arr_count];
		System.out.println(no.length);
		System.out.println("Enter the Value : ");

		
		  for (int i = 0; i < no.length; i++) {
		  
		  no[i] = sc.nextInt(); }
		 
		for (int i = 0; i < no.length; i++) {

			System.out.println(""+no[i]);
		}

	}

	public void search(int src) {
		//Scanner sc2 = new Scanner(System.in);
		//int no[] = new int[arr_count];
		//System.out.println("Search the Number :");
		//int search = sc2.nextInt();
		for (int i = 0; i < arr_count; i++) {
			if (src == no[i]) {
				flag=true;
				//System.out.println("Yes Your Number isthere:" + no[i]);
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("Yes Your Number isthere.");
		}
		else {
			System.out.println("Your Number is Notthere.");
		}

	}

}
