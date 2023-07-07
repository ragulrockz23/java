package ragul;

import java.util.ArrayList;
import java.util.List;

public class AddNumber_list {

	public static void main(String[] args) {
		List <Integer> l=new ArrayList();
	    l.add(12);
	    l.add(14);
	    l.add(16);
	    l.add(13);
	    l.add(17);
	    l.add(18);
	    l.add(11);
	    l.add(19);
	    int sum=0;
	    for(int i=0;i<l.size();i++)
	    {
	    	sum=l.get(i)+sum;
	    }
	    System.out.println("sum :"+sum);
	}

}
