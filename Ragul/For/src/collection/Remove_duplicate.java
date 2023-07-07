package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Remove_duplicate {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(2);
		l.add(5);
		l.add(6);
		l.add(7);
		System.out.println(l);
		ListIterator<Integer> itr=l.listIterator();
		while(itr.hasNext()) {
			itr.next();
	    
		}
	    		for(int i=0;i<l.size();i++){
	    			for(int j=i+1;j<l.size();j++){
	    				if(l.get(i)==l.get(j)) {
	    					l.remove(j);
	    				}
	    			}
	    		
				
	    		
	    		
	    		
	    		
	    	
	    	
	    }
		System.out.println("After Removing Duplicate ");
		System.out.println(l);

	}

}
