package oopsconcept; //package name

public class QA4 extends QA2 implements QA3I   //class
{

	
	public void div(int a, int b)// Method 
	{
		int c =a/b;
		System.out.println("divison of 2 numbers: " + c);
	}
	
	

	
	public static void main(String[] args)// Main method 
	{
	
		{
			DemoEncap de=new DemoEncap();
			System.out.println(de.getName());
			System.out.println(de.getAge());

			QA4 q4=new QA4();
			q4.div(40,20);
				
			
		}
		
		
		QA4 q4=new QA4();               // object of the class
		q4.div(40, 20);
		//q4.mul(20, 30);
		
    	q4.subs(20,30);             //what you want called in the console 
		q4.sum(20, 30);            //this is called inheritance because getting info from QA1
		System.out.println(q4.x);
		
		
		//QA1 abc=new QA1();          //needs to have object of the QA1 class
		//abc.sum(20,30);
		q4.qa3im();
	    q4.qa1im();
		
		
	}





	public void qa3im() 
	{
	
		System.out.println("method of QA3I");
		
		
	}  

} 
