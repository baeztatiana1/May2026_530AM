package firstpkg;

public class FirstProgram 
{

	int a =10; 
	float b=10.5f;
	char c= 'X';
	String d= "java";
	boolean e= true;
	
	String loc= "India";
	
	
	
	public void print_date()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	   
	public void meth2()
	{
		int x=100;
		System.out.println(x);
	}
	
	
	
public static void main(String[] args) 
{
	FirstProgram abc=new FirstProgram(); //instance of the object 'FirstProgram'
	abc.print_date();
	System.out.println(abc.loc);
}
}





