package multithreadingEx;

import java.util.*;

public class smallCapsMultithreading {
	public static void main(String k[]) {
		System.out.println("Thread Started");
		Thread t=Thread.currentThread();
		System.out.println("Name "+t.getName()+" "+"Priority "+t.getPriority());
		smallLetter small= new smallLetter("Small");
		capsLetter caps= new capsLetter("Caps");
		List<String> li= new ArrayList<>();
		
		
	}
	

}
