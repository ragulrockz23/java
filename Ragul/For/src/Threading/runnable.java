package Threading;

public class runnable implements Runnable{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new runnable();
		Runnable r1 = new runnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for( int i=1;i<=5;i++) {
			System.out.println(i+"*"+"7"+"="+ i*7);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



}
