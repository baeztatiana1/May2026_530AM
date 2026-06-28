package oopsconcept;

public class Jibendraclass 
{

	public void isEven(int num1) 
	{

		if(num1 % 2==0);
		{
	
System.out.println(num1+" The number is even");
		}
		
	   {
	System.out.println(num1+" The number is odd");
		}
	}
	
	public int cubes(int a)
	{
		int b=a*a*a;
		return b;
	}
	
	public static void main(String[] args)
	{
		Jibendraclass jc=new Jibendraclass();
        jc.isEven(2);
		
         int x= jc.cubes(5);
         System.out.println(x);
	}

	public void area() {
		// TODO Auto-generated method stub
		
	}

}  
