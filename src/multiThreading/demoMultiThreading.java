package multiThreading;

public class demoMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread Started");
		Thread t=Thread.currentThread();
		System.out.println("Name "+t.getName()+" "+"Priority "+t.getPriority());
		evenThread even= new evenThread("Even");
		oddThread odd= new oddThread("Odd");
		even.start();
		odd.start();
		try {
			even.join();
			odd.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Even is alive "+even.isAlive()+" Odd is alive "+odd.isAlive());
		System.out.println("The END");
	}

}
