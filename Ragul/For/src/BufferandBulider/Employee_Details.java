package BufferandBulider;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee_Details {

	public static void main(String[] args) {
		Employee ob1 = new Employee(1111, "Ragul", 25, "Software Developer", 25000);
		Employee ob2 = new Employee(1112, "Saravana", 26, "Java Developer", 24000);
		Employee ob3 = new Employee(1113, "Lajeem", 24, "Software Tester", 22000);
		Employee ob4 = new Employee(1117, "Senthil", 23, "UI/UX Developer", 23000);
		Employee ob5 = new Employee(1114, "Kavin", 23, "Java Developer", 24000);
		Employee emp[] = { ob1, ob2, ob3, ob4, ob5 };
		Scanner scan = new Scanner(System.in);
		System.out.println(" before sorting");
		for (Employee i : emp) {
			System.out.println(i);
		}
		System.out.println("pls enter you option ");
		int n = scan.nextInt();
		Comparator c = null;
		switch (n) {
		case 1: {
			c = new Id_Num_Sort();
			break;
			/*
			 * c=(o1,o2)->{ Employee ob= (Employee) o1; Employee b1= (Employee) o2;
			 * if(ob.getIdnum()>ob1.getIdnum()) { return 1; }
			 * if(ob.getIdnum()<ob1.getIdnum()) { return -1; } else return 0;
			 * 
			 * };
			 */
		}
		case 2: {
			c = new Name_Sort();
			break;
			/*
			 * c=(o1,o2)->{ Employee ob= (Employee) o1; Employee b1= (Employee) o2; return
			 * ob.getName().compareTo(ob1.getName()); };
			 */
		}
		case 3: {
			c = new Age_Sort();
			break;
			/*
			 * c=(o1,o2)->{ Employee ob= (Employee) o1; Employee b1= (Employee) o2;
			 * if(ob.getAge()>ob1.getAge()) { return 1; } if(ob.getAge()<ob1.getAge()) {
			 * return -1; }
			 * 
			 * return 0;
			 * 
			 * 
			 * };
			 */
		}
		case 4: {
			/*c = new Designation_Sort();
			break;*/
			c=(o1,o2)->{
				Employee ob= (Employee) o1;
				Employee b1= (Employee) o2;
				return ob.getDesignation().compareTo(ob1.getDesignation());
			};
		}
		case 5: {
			/*c = new Salary_Sort();
			break;*/
			c=(o1,o2)->{
				Employee ob= (Employee) o1;
				Employee b1= (Employee) o2;	
				if(ob.getSalary()>ob1.getSalary())
				{
					return 1;
				}
				if(ob.getSalary()<ob1.getSalary())
				{
					return -1;
				}

				return 0;
			
			};
		}
		default: {
			System.out.println("pls enter valid option");
		}

		}
		Arrays.sort(emp, c);
		for (Employee i : emp) {
			System.out.println(i);
		}
	}

	

}
