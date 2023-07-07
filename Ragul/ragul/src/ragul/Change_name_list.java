package ragul;

import java.util.ArrayList;
import java.util.List;

public class Change_name_list {

	public static void main(String[] args) {
   List name= new ArrayList();
   name.add("saravana");
   name.add("rahul");
   name.add("senthil");
   name.add("rahul");
   name.add("kavin");
   name.add("mahadevan");
   System.out.println(name);
    for(int i=0;i<name.size();i++)
    {
    	if(name.get(i)=="rahul")
    	{
    		name.set(i, "ragul");
    	}
    }
    System.out.println(name);

   
	}

}
