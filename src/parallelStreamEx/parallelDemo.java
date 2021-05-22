package parallelStreamEx;
import java.util.*;

import parallelStreamEx.person.Sex;

public class parallelDemo {
	public static void main(String k[]) {
		ArrayList<person> personList=new ArrayList<>();
		person p1=new person("Sunita", Sex.FEMALE, 22,3000);
		person p2=new person("Vinita", Sex.FEMALE, 29,5000);
		person p3=new person("Ramesh", Sex.MALE, 32,2500);
		person p4=new person("Sujita", Sex.FEMALE, 34,8000);
		person p5=new person("Rajesh", Sex.MALE, 37,12000);
		person p6=new person("Suresh", Sex.MALE, 21,14000);
		person p7=new person("Vimmesh", Sex.MALE, 19,10000);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		personList.add(p7);
		
		long start=System.currentTimeMillis();
		personList.stream().forEach((x)->System.out.println(x));
		System.out.println("Males in Person class");
		
		personList.stream().filter((p)->p.getGender()==person.Sex.MALE).forEach(System.out::println);
		System.out.println("Average Age of person class");
		
		double avgAge=personList.stream().filter(p->p.getGender()==person.Sex.MALE).mapToInt(person::getAge).average().getAsDouble();
		long end=System.currentTimeMillis();
		
		System.out.println(avgAge);
		System.out.println("Time "+(end-start));

		
		System.out.println("Using parallel stream\n\n");
		long start1=System.currentTimeMillis();
		personList.parallelStream().forEach((x)->System.out.println(x));
		System.out.println("Males in Person class");
		
		personList.parallelStream().filter((p)->p.getGender()==person.Sex.MALE).forEach(System.out::println);
		
		//average age using parallel stream
		System.out.println("Average Age of person class");
		double avgAgeParallel=personList.parallelStream().filter(p->p.getGender()==person.Sex.MALE).mapToInt(person::getAge).average().getAsDouble();
		long end1=System.currentTimeMillis();
		System.out.println(avgAgeParallel);
		
		System.out.println("Time"+(end1-start1));
		
		//sum of salary
		int totalSal=personList.parallelStream().mapToInt(person::getSalary).sum();
		System.out.println("Total salry "+totalSal);
		
		//max & min salary
		Optional op1=personList.parallelStream().max((x,y)->x.getSalary()-y.getSalary());
		Optional op2=personList.parallelStream().min((x,y)->x.getSalary()-y.getSalary());
		System.out.println("Max Salary "+op1);
		System.out.println("Min Salary "+op2);
		
		
		//count
		int count = (int)personList.parallelStream().filter(x -> x.getSalary()>=10000).count();
	    System.out.println("Person count whose salary gretaer than 10000"+count);
	}

}
