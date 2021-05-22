package multiThreading;

public class callMe {
	public synchronized void print(String name) {
		synchronized (this){
			System.out.print("["+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.print("]");
		}
		
	}
}
