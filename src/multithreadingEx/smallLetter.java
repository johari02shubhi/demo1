package multithreadingEx;

public class smallLetter extends Thread{
	public smallLetter(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=97; i<=102; i++) {
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
