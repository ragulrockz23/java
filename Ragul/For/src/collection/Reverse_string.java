package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_string {

	public static void main(String[] args) {
		List<String> l= Arrays.asList("Ragul","Suthagar","Surya","Mathesh");
		System.out.println(l);
		List<StringBuffer> l1=new ArrayList();
		for(String i: l)
		{  
		StringBuffer n=new StringBuffer(i);
		 l1.add(	n.reverse());
			
		}
		System.out.println("Reverse the list:\n"+l1);
	}

	

}
