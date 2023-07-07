package BufferandBulider;

import java.util.Comparator;

public class Salary_Sort implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee ob= (Employee) o1;
		Employee ob1= (Employee) o2;	
		if(ob.getSalary()>ob1.getSalary())
		{
			return 1;
		}
		if(ob.getSalary()<ob1.getSalary())
		{
			return -1;
		}

		return 0;
	}

}
