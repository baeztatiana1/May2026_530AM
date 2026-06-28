package oopsconcept;

public class EmployeeSalary 

{

	private String name="Taty";
	private int id=20;
	
	private int salary=10000;
	private String name1="Romero";
	private int id1=30;
	private int salary1=200000;
	
	
	
		
	
	
	public static void main(String[] args) 
	{
		
		EmployeeSalary abc=new EmployeeSalary();
		System.out.println(abc.getName());
		System.out.println(abc.getId());
		System.out.println(abc.getSalary());
		
		System.out.println(abc.getName1());
		System.out.println(abc.getId1());
		System.out.println(abc.getSalary1());
		

	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public int getSalary() {
		return salary;
	}






	public void setSalary(int salary) {
		this.salary = salary;
	}






	public String getName1() {
		return name1;
	}






	public void setName1(String name1) {
		this.name1 = name1;
	}






	public int getId1() {
		return id1;
	}






	public void setId1(int id1) {
		this.id1 = id1;
	}






	public int getSalary1() {
		return salary1;
	}






	public void setSalary1(int salary1) {
		this.salary1 = salary1;
	}

}
