package oopsconcept;

public class DemoEncap 




{
    private String name= "Taty";
    private int age=39;

	
	
	
	
	public static void main(String[] args)
	
	{
		DemoEncap de=new DemoEncap();         // object of the class
		System.out.println(de.name);
		System.out.println(de.getAge());

	}
      public String getName()
      {
    	  return name;
    	  
      }
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
