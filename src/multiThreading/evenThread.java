package multiThreading;

public class evenThread extends Thread{
	public evenThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0; i<10; i=i+2) {
			System.out.println(getName()+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
