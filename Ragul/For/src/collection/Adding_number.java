package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Adding_number {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(4);
		l.add(5);
		System.out.println(l);
		
		 ListIterator<Integer> itr=l.listIterator();
		 while(itr.hasNext()) {
			 if((int)itr.next()==5) {
				 itr.add(999);
				 
		 
				 }
			 }
		 System.out.println(l);
		
		
		
		 
		

	}

}
