package Threading;

public class LambdaExpression {

	public static void main(String[] args)throws InterruptedException {
		Runnable R=()->{
			for(int i=1;i<=5;i++) {
				System.out.println("welcome");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		
		};
		//R.run();

	
	Runnable S=()->{
		for(int i=1;i<=5;i++) {
			System.out.println("Ragul");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	};
	//S.run();
	Thread t1=new Thread(R);
	Thread t2=new Thread(S);
	t1.start();
	t2.start();

	}
	
	
	

}
