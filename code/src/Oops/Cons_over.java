package Oops;

public class Cons_over {
	private String S_Name;
	private int Roll_No;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int S_Science;
	
	Cons_over(){
		
	}
	Cons_over(String S_Name,int Roll_No,int Tamil,int English,int Maths,int Science,int S_Science){
		this.S_Name=S_Name;
		this.Roll_No=Roll_No;
		this.Tamil=Tamil;
		this.English=English;
		this.Maths=Maths;
		this.Science=Science;
		this.S_Science=S_Science;
	}
	void Display()
	{
		
		System.out.println("Enter Student Name:" +S_Name);
		System.out.println("Enter Student Roll_No:" +Roll_No);
		System.out.println("Enter Tamil Mark:" +Tamil);
		System.out.println("Enter English Mark:" +English);
		System.out.println("Enter Maths Mark:" +Maths);
		System.out.println("Enter Science Mark:" +Science);
		System.out.println("Enter S_Science Mark:" +S_Science);
		System.out.println("The Total Mark:" +gettotal());

	
	}

	void setTamil(int Tamil) {
		this.Tamil = Tamil;
	}
	void setEnglish(int English) {
		this.English = English;
	}
	void setMaths(int Maths) {
		this.Maths = Maths;
	}
	void setScience(int Science) {
		this.Science = Science;
	}
	void setS_Science(int S_Science) {
		this.S_Science = S_Science;
	}
	int getTamil() {
		return Tamil;
	}
	int getEnglish() {
		return English;
	}

	int getMaths() {
		return Maths;
	}
	int getScience() {
		return Science;
	}
	int getS_Science() {
		return S_Science;
	}
	int gettotal() {
		return getTamil() + getEnglish() + getMaths() + getScience() + getS_Science();
	
	}
	
}
