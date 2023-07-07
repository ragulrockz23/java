package string;

public class length {

	public static void main(String[] args) {
	  String s="  Appl e  ";
	  String st=s.strip();
	  String st1=s.stripLeading();
	  String st2=s.stripTrailing();
	  System.out.println(st1);
	  System.out.println(st2);
	  System.out.println(st.length());
	  String m="hai";
	  char[] s1= {'h','e','l','o'};
	  
	  String n=m.copyValueOf(s1);
	  

	}

}
