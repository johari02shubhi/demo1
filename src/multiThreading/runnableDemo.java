package multiThreading;

public class runnableDemo {
	public static void main(String k[]) {
		evenRunnable even= new evenRunnable("Even");
		oddRunnable odd= new oddRunnable("Odd");
		Thread tEven= new Thread(even);
		Thread tOdd= new Thread(odd);
		tEven.start();
		tOdd.start();
		try {
			tEven.join();
			tOdd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Even is alive "+tEven.isAlive()+" Odd is alive "+tOdd.isAlive());
		System.out.println("The END");
		
		
		
		
	}
}
