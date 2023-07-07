package Array;

import java.util.Scanner;
import java.lang.Math;
public class Find_index {

	int no[];
	static int size;

	boolean flag = false;
	Scanner ss = new Scanner(System.in);
	public static void main(String[] args) {
		Find_index o = new Find_index();
		o.size();
		o.find();
		o.index();
		o.mid_element();
		o.min_element();
		o.backup();
		o.max();

	}

	public void size() {
		
		no = new int[size];
		System.out.println("Enter the Size:");

		size = ss.nextInt();

	}

	public void find() {

		
		no = new int[size];  //Static array  | size-static variable

		System.out.println("Enter the Value : ");

		for (int i = 0; i < no.length; i++) {

			no[i] = ss.nextInt();
		}

	}

	public void index() {
		

		System.out.println("Enter the Value : ");

		int c = ss.nextInt();
		int i;

		for (i = 0; i < no.length; i++) {

			if (c == no[i]) {
				System.out.println("your number index value:" + i);
				break;

			}
		}

		if (flag == true) {
			System.out.println("your number index value notthere:");
		}

	}

	public void mid_element() {
		// for(int i=0;i<no.length;i++) {
		if (no.length % 2 != 0) {
			int mid = no.length / 2;

			System.out.println("The Middle Element of Array:" + no[mid]);
		}
	}

	public void min_element() {
		int i;
		for ( i = 0; i < no.length; i++) {
			if (no.length % 2 != 0) {

				System.out.println("The First Element of Array:" + no[i]);
				break;

			}

		}
		if (no.length % 2 != 0) {

			System.out.println("The Last Element of Array:" + no[no.length-1]);
		}
	}
	public void backup() {
		int i;
		int bck[]=new int[size];
		for( i=0;i<no.length;i++) {
			bck[i]=no[i];
			System.out.println("Backup the Array Element:"+bck[i]);
		}
		
	}
	public void max() {
		
		int i=0;
		
		while(i<no.length) {
			System.out.println("The Maximam array element:"+Math.max(no[i], no.length));
			System.out.println("The Minimum array element:"+Math.min(no[i], no.length));
			i++;
			break;
			
		}
		
		
		
	}

}
