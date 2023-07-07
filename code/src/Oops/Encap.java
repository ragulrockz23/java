/**
 * 
 */
package Oops;

/**
 * @author ragul
 *
 */
public class Encap {

	/**
	 * @param args
	 */
	int a=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Encap s=new Encap();
			Encap s1=new Encap();
			System.out.println(s.a);
			s.step1();
			s.step2();
			s.a=25;
			System.out.println(s.a);
			s.step1();
			s.step2();
			System.out.println(s1.a);
			s1.step1();
			s1.step2();
	}
	void step1()
	{
		a=a+5;
		System.out.println(a);
	}
	void step2()
	{
		a=a+6;
		System.out.println(a);
	}

}
