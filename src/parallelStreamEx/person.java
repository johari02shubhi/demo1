package parallelStreamEx;

public class person {
	public enum Sex{MALE, FEMALE};
	private String name;
	private Sex gender;
	private int age;
	private int salary;
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public person() {
		super();
	}

	
	public person(String name, Sex gender, int age, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"  "+ gender+"  "+ age+"  "+salary+ " ";
	}
	
}
