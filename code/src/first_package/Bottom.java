package first_package;

public class Bottom {
	
	
	 public static void main(String arg[])
	  {
	   Bottom obj=new Bottom();
	    System.out.println("----- 1 to 5 in three rows ------");
	     obj.array();
	    System.out.println("----- 2 to 10 even number in three rows ------");
	     obj.array1();
	    System.out.println("----- 1 to 3 same number repeat in three rows ------");
	     obj.array2();
	    System.out.println("----- 5 to 1  natural in three rows ------");
	     obj.array3();
	    System.out.println("----- 4 to 1 same number repeat in three rows ------");
	     obj.array4();
	  }
	 public void array()
	   {
	    int row=1;
	   
	    while(row<4)
	   {
	     int a=1;
	     int n=1;
	     while(n<6)
	     {
	     System.out.print(a+" ");
	     n++;
	     a++;
	     }
	    row++;
	    System.out.println();
	   
	    }
	  }


	 public void array1()
	   {
	    int row=1;
	    while(row<4)
	   {
	     int a=2;
	     int n=1;
	     while(n<6)
	     {
	     System.out.print(a+" ");
	     n++;
	     a+=2;
	     }
	    row++;
	    System.out.println();
	   
	    }
	  }

	 public void array2()
	   {
	    int row=1;
	     int a=1;
	    while(row<4)
	   {
	     int n=1;
	     while(n<6)
	     {
	     System.out.print(a+" ");
	     n++;
	     }
	     a++;
	    row++;
	    System.out.println();
	   
	    }
	  }
	 public void array3()
	   {
	    int row=1;
	    while(row<4)
	   {
	     int a=5;
	     int n=1;
	     while(n<6)
	     {
	     System.out.print(a+" ");
	     n++;
	    a--;
	     }
	    row++;
	    System.out.println();
	   
	    }
	  }
	public void array4()
	   {
	    int row=1;
	     int a=4;
	    while(row<=4)
	   {
	     int n=1;
	     while(n<6)
	     {
	     System.out.print(a+" ");
	     n++;
	     }
	     a--;
	    row++;
	    System.out.println();
	   
	    }
	  }
	}


