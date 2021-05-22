package multiThreading;

public class myThread extends Thread {
	private callMe cm;
	private String name;
	
	public myThread(callMe cm, String name) {
		this.cm=cm;
		this.name=name;
	}
	@Override
	public void run() {
		cm.print(name);
	}

}
