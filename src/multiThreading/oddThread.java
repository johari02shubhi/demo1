package multiThreading;

public class oddThread extends Thread {

	public oddThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<10; i=i+2) {
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
