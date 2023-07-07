package BufferandBulider;

import java.util.Comparator;

public class Designation_Sort implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee ob= (Employee) o1;
		Employee ob1= (Employee) o2;
		return ob.getDesignation().compareTo(ob1.getDesignation());
	}

}
