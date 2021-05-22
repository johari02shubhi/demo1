package multiThreading;

public class synchroEx {

	public static void main(String[] args) {
		callMe cm= new callMe();
		myThread javaThread= new myThread(cm,"Java");
		myThread dbThread= new myThread(cm,"DB");
		javaThread.start();
		dbThread.start();
	}

}
