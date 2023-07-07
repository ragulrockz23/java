package Threading;

public class ThreadDemo extends Thread{
	public static void main(String[] args) throws InterruptedException{
		Thread t1= new ThreadDemo();
		Thread t2= new ThreadDemo();
		//obj.tables();
		/*
		 * System.out.println( obj.getName()); obj.setName("firstThread");
		 * System.out.println( obj.getName()); System.out.println( obj.getPriority());
		 * obj.setPriority(MAX_PRIORITY); System.out.println( obj.getPriority());
		 * System.out.println(obj.getId());
		 */
		t1.start();
		Thread.sleep(1000);
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("completed");
}

public void run()  {
	
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
