package string;

public class Method {

	public static void main(String[] args) {
		String s="    Payilagam is in velachery      ";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		s.length();
		String str= "Ragul,Saravana,Lajeem,Kavin,Senthil";
		System.out.println(str.length());
		System.out.println(str);
		String afterTrim=s.trim();
		System.out.println(afterTrim.length());
		System.out.println(afterTrim);
		String first="Ragul";
		first=first+" and Honey";
		first.concat(first);
		first.toUpperCase();
		first=first.concat(first);
		first=first.toUpperCase();
		System.out.println(first);
		for(int i=0;i<str.length();i++) {
			
		}
		

	}

}
