/**
 * 
 */
package Array;

/**
 * @author ragul
 *
 */
import java.util.Scanner;

public class Student {

	/**
	 * @param args
	 */
	String Name;
	int age;
	int arr_size;
	int total;
	double Average;
	int arr[];
	int even_total,odd_total;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Student s = new Student();

		s.size();
		s.name();
		s.age();
		s.avg();
		s.index();
		s.total();
		s.sum();
		

	}

	public void size() {

		
		System.out.println("Enter the Size:");
		arr_size = s.nextInt();
		 arr = new int[arr_size];
		

	}

	public void name() {
		
		System.out.println("Enter the Student Name:");
		for (int i = 0; i < arr_size; i++) {

			Name= s.nextLine();
			
		}

	}

	public void age() {
		
		int arr[] = new int[arr_size];
		System.out.println("Enter the Student Age:");
		for (int i = 0; i < arr_size; i++) {

			arr[i] = s.nextInt();
			total = total + arr[i];
		

		}

		System.out.println("The Total of Student Age : " + total);

	}

	public void avg() {
		Average = total / arr_size;
		System.out.println("The Average of Age :" + Average);

	}

	public void index() {
		
		System.out.print(" enter the count number :");
		int count = s.nextInt();
		int eve[] = new int[count];
		System.out.println("enter the number : ");
		for (int i = 0; i < count; i++) {
			eve[i] = s.nextInt();
		}
		for (int i = 0; i < count; i++) {
			if (i % 2 == 0) {
				System.out.println("even number = " + eve[i]);
				even_total = Math.addExact(eve[i], even_total);

			}
		}
		System.out.println();
		for (int i = 0; i < count; i++) {
			if (i % 2 != 0) {
				System.out.println("odd number = " + eve[i]);
				odd_total = Math.addExact(eve[i], odd_total);

			}

		}
	}

	public void total() {
		System.out.println("odd number total= " + odd_total);
		System.out.println("even number total= " + even_total);
	}

	public void sum() {
		System.out.println("sum of numbers = " + Math.subtractExact(odd_total, even_total));
	}

}
