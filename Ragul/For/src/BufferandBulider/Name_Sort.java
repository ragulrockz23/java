package BufferandBulider;

import java.util.Comparator;

public class Name_Sort implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee ob= (Employee) o1;
		Employee ob1= (Employee) o2;
		return ob.getName().compareTo(ob1.getName());
	}

}
