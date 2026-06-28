package firstpkg;         // just means this class exist under this package         ;semicolon means it ends there 



public class MathOperationstaty        // Class name always starts with Uppercase.  Class is black             //you can define data in the class
{ //code starts with the curly bracket 

	 int  square=10; //square is a container holds data. If you're going to use a number you need to use int 
     int  cube =20; //cube is a container holds data 
                                                         
    
     public void taty() // public void is a method (give a Method name must be lowercase and end with () parentheses is always black) can have data or  not inside parentheses 
     {
	 String name ="Taty";  // local variable         //name is a container where value is kept     //String is a class is a data type                   
    	 System.out.println(square);  //is a task activity //system is a Class. println is a Method lowercase and ends with () 
         System.out.println(name); //printing in an activity a task. Any task you want to perform you must put in the method
	
         //you can define the data in the method also 
	 
	
     }
	
	public static void main(String[] args) // to execute the java program to you need a main method to execute the code entry point to run any java program
	{
	char x='A';       // x is the container. Keywords are in the color PURPLE and ALWAYS starts with a lowercase
	System.out.println(x);	//Class is BLACK and starts with Uppercase
		
		
	MathOperationstaty abc=new MathOperationstaty(); //anything you define in the class you want to execute you need object of the class to // can give any variable abc as the container 
	System.out.println(abc.cube);// callin data
		System.out.println(abc.square); //calling data 
		abc.taty();// calling the method  
  
		//you can define data in the main method as well. When you create a method with a class name this is a constructor 
		
	}
 
} // closed bracket writing outside of the class is not allowed 








// inside of the class you can only do two things 1. define the data and 2. perform action activity like print the value 