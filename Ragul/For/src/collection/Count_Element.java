package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Count_Element {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(11);
		l.add(10);
		l.add(13);
		l.add(14);
		System.out.println(l);
		
		/*
		 * int count=0; ListIterator itr=l.listIterator(); while(itr.hasNext()); {
		 * itr.next(); if(count==1) { count++;
		 * 
		 * } System.out.println(l+"Presence ="+count); }
		 */
		/*for(int i=0;i<l.size();i++) {
			int count=0;
			for(int j=0;j<=i;j++) {
				if(l.get(i)==l.get(j)) {
					count++;
				}
				if(count==1) {
					System.out.println(l.get(i)+"->Presence ="+count);
				}
			}*/
		Set<Integer> s=new HashSet<>(l); 
		  
		  for(Integer i:s)
		  {
		   System.out.println(i+"  elements count = "+ Collections.frequency(l, i));
		}

	}

}
