package ExceptiionLearning;

public class throwsDemo {
	static void divide(int a, int b) throws ArithmeticException ,DenominatorException{// jvm throw the method
		if(a<=0) {
			throw new DenominatorException("neumorator zero");
		}
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		try {
			divide(7, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(DenominatorException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();//this for void method ,this print the divide(7, 7)=1.
		}

	}

}
