package multithreadingEx;

public class capsLetter extends Thread{
	public capsLetter(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=65; i<=70; i++) {
			char ch=(char) i;
			System.out.println(getName()+" "+ch);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
