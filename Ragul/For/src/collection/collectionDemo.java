package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionDemo {

	public static void main(String[] args) {
		List l=new ArrayList();//capacity 10;
		List ll=new ArrayList();
		//Integer i= new Integer(7);deprecated;
		Integer i=7;
		l.add(i);
		l.add("Hai");
		l.add(true);
		l.add(5.5);
		l.add('c');
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		//l.get(10);
		//Collections.EMPTY_LIST
		System.out.println(l);
		int j=(Integer)l.get(0)+2;//conversion of unboxing
		System.out.println(j);
		l.addAll(ll);
		l.set(0, 700);
		//l.clear();
		System.out.println(l);
		List backup=new ArrayList(l);
		backup.addAll(l);
		System.out.println(backup);
		Object []c=backup.toArray();
		for(Object e: c) {
			System.out.print(i);
		}

	}

}
