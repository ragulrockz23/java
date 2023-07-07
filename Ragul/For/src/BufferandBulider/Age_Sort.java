package BufferandBulider;

import java.util.Comparator;

public class Age_Sort implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee ob= (Employee) o1;
		Employee ob1= (Employee) o2;	
		if(ob.getAge()>ob1.getAge())
		{
			return 1;
		}
		if(ob.getAge()<ob1.getAge())
		{
			return -1;
		}

		return 0;
	}

}
