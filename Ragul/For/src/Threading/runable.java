package Threading;

public class runable implements Runnable{
	public void run () {
		add();
	}
	void add() {
		for(int i=1;i<=5;i++) {
			System.out.println("welcome");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Second implements Runnable{
	
	public void run () {
		for(int i=1;i<=5;i++) {
			System.out.println("Thankyou");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Third implements Runnable{
	
	public void run () {
		for(int i=1;i<=5;i++) {
			System.out.println("Bye");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	//}
}
//public abstract class fullRunnable implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		//Runnable f = new First();
		//Runnable s = new Second();
		//Runnable t = new Third();
		//Thread t1 = new Thread(new fullRunnable());
		Thread t2 = new Thread(new Second());
		Thread t3 = new Thread(new Third());
		
				
				
				
				
				
				
		//t1.start();
		//Thread.sleep(1000);
		t2.start();
		t3.start();
		
		
	}


}
