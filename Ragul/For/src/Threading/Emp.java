package Threading;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import BufferandBulider.Employee;

public class Emp {
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
			/*c = new Id_Num_Sort();
			break;*/
			 c=(o1,o2)->{
				Employee a1= (Employee) o1;
				Employee b1= (Employee) o2;	
				if(a1.getIdnum()<b1.getIdnum())
				{
					return 1;
				}
				if(a1.getIdnum()>b1.getIdnum())
				{
					return -1;
				}
				else
				return 0;
			
			};
		}
		case 2: {
			/*c = new Name_Sort();
			break;*/
			c=(o1,o2)->{
				Employee a2= (Employee) o1;
				Employee b2= (Employee) o2;
				return a2.getName().compareTo(b2.getName());
			};
		}
		case 3: {
			/*c = new Age_Sort();
			break;*/
			c=(o1,o2)->{
				Employee a3= (Employee) o1;
				Employee b3= (Employee) o2;	
				if(a3.getAge()>b3.getAge())
				{
					return 1;
				}
				if(a3.getAge()<b3.getAge())
				{
					return -1;
				}

				return 0;
			

			};
		}
		case 4: {
			/*c = new Designation_Sort();
			break;*/
			c=(o1,o2)->{
				Employee a4= (Employee) o1;
				Employee b4= (Employee) o2;
				return a4.getDesignation().compareTo(b4.getDesignation());
			};
		}
		case 5: {
			/*c = new Salary_Sort();
			break;*/
			c=(o1,o2)->{
				Employee a5= (Employee) o1;
				Employee b5= (Employee) o2;	
				if(a5.getSalary()>b5.getSalary())
				{
					return 1;
				}
				if(a5.getSalary()<ob1.getSalary())
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
