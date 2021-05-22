package multiThreading;

public class evenRunnable implements Runnable {
	
	private String name;

	public evenRunnable(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i=i+2) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
