package Array;
import java.util.Scanner;
public class Bubble_Sort {
    Scanner sc = new Scanner(System.in);
    int a[];
    int size;
	public static void main(String[] args) {
		Bubble_Sort obj=new Bubble_Sort();
		obj.sort();

	}
	void sort() {
		System.out.println(" Enter the Size:");
	      size=sc.nextInt();
	      a=new int[size];
	      System.out.println("Enter the Element:");
	      for(int i=0;i<a.length;i++) {
	    	  a[i]=sc.nextInt();
	      }
	      for(int i=0;i<a.length;i++) {
	    	  for(int j=i+1;j<a.length;j++) {
	    		  if(a[i]<a[j])
	    		  {
	    			  int temp=a[i];
	    			  a[i]=a[j];
	    			  a[j]=temp;
	    		  }
	    	  }
	      }
	      System.out.println("The Sorting Array:");
	      for(int i=0;i<a.length;i++) {
	    	System.out.print(a[i]+" ");
	      }
	      }

}
