package ragul;

public class Ragul {

	public static void main(String[] args) 
	{
        
		int number = 1;
		int save ,total,Bo;
		while(number<=50)//50  100
		{
			save=number%10; //1   0 0
			total = number/10; //0 5
			Bo = total+save; 
			
			if(Bo<=5)
			{
				System.out.println(number);
			}
			number++;
			
		}
		
		int number2=100;
		int save2,total2,bo2 ;
		while(number2<=501)
		{
			save2=number2%100;
			total2=number2/100;
			bo2 = total2+save2;
			if(bo2<=5)
			{
				System.out.println(number2);
			}
			number2++;
		}
		
		
		
	}

}
