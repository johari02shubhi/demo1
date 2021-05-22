package assertionEx;
import java.util.*;

public class assertionDemoArrayList {

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		List<Integer> li= new ArrayList<>();
		//assert li.size()>10;
		//li.add(23);
		//li.add(44);
		//li.add(2);
		//li.add(78);
		//li.add(102);
		addNumber(li);
		showNumbers(li);
		
		

	}
	public static void addNumber(List<Integer> li){
		int sum=0;
		assert (li !=null) : "List is not null";
		for(int i=0; i<li.size(); i++) {
			sum=sum+li.get(i);
		}
		System.out.println("Sum of Numbers "+sum);
	}
	
	public static void showNumbers(List<Integer> li) {
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		assert (li !=null) : "List is not null";
	}

}
