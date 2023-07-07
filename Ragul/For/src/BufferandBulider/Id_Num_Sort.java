package BufferandBulider;

import java.util.Comparator;

public class Id_Num_Sort implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee ob= (Employee) o1;
		Employee ob1= (Employee) o2;	
		if(ob.getIdnum()>ob1.getIdnum())
		{
			return 1;
		}
		if(ob.getIdnum()<ob1.getIdnum())
		{
			return -1;
		}

		return 0;
	}


}
