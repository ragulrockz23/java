package string;

public class Demo {

	public static void main(String[] args) {
		String s = "welcome";
		String s1 = "WELCOME";
		String s2 = "welcome";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Demo ob = new Demo();
		Demo obj = new Demo();
		System.out.println("your string class object value :" + ob.hashCode());
		System.out.println("your string class object value :" + obj.hashCode());
		String a = new String("Apple");
		String a1 = new String("Apple");
		System.out.println("your new string class object value :" + a.hashCode());
		System.out.println("your new string class object value :" + a1.hashCode());
		System.out.println("your class object :" + (ob == obj));
		System.out.println("your class object :" + ob.equals(obj));
		System.out.println("Compare the S and S2 :" + (s == s2));
		System.out.println("Compare the S and S1 :" + (s == s1));
		System.out.println("Compare the S1 and S2 :" + (s1 == s2));
		System.out.println("Compare the S and S2 :" + s.equals(s2));
		System.out.println("Compare the S and S1 :" + s.equals(s1));
		System.out.println("Compare the S1 and S2 :" + s1.equals(s2));

	}

}
