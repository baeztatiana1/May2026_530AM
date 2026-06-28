package oopsconcept; //package name

public class QA2 extends QA1
         //class
{

	int x=100; //global variable 
			
		public void printvalues_X()
		{
		int x =200;//local variable 
		System.out.println(x); //200
		System.out.println(this.x);
		 
			}
	

      public void sum(int a, int b)
      {
    	  System.out.println(x);
    	  int c = a*a+b*b;
    	  System.out.println("sum of 2 numbers:"+c);
      }
		


		
		public void subs(int a, int b)// Method 
	{
		int c =a-b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	

	
	public static void main(String[] args)// Main method 
	{
		QA2 q2=new QA2();              // object of the class
		
		
		
		System.out.println(q2.x); //100
		
		
		q2.printvalues_X(); // 200 
		
		
		System.out.println(q2.x); //200
		
		//q2.subs(20,30);             //what you want called in the console 
		//q2.sum(20, 30);            //this is called inheritance because getting info from QA1
		//System.out.println(q2.x);
		
		
		//QA1 abc=new QA1();          //needs to have object of the QA1 class
		//abc.sum(20,30);

		q2.qa1im();
		
		
		
		
	}  

	 public void qa1im()
	 {
		 System.out.println("method of QA1I");
	 }
	
	
	
} 
