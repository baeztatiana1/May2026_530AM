package firstpkg;

public class Cars 
{
	
	//attributes =data
       String brand;
       String model;
       int year;
       
       String branda= "BMW";
       String brandb= "Honda";
       String brandc="Toyota";
       
       

		String model1="X5";
		String model2="Accord";
		String model3="Highlander";
	   
	   
		    int yeara=2025;
	        int yearb=2020;
	        int yearc=2024;
	        
	        
	        
	public void st()
	        {
      
    System.out.println("These are the cars");
    
    
	        }
	        
	        
	   public void mo()    
	    {
	    	System.out.println("These are the car models");
	    }
	        
	   public void ye()
	   {
	        
	System.out.println("This is the years of the cars");
	   }
		   
	   
	   
	   public void myop()
	   {
		   System.out.println("My favorite car is the BMW X5");
		   
	   }
	   
	   
	   public void yourop()
	   {
		   System.out.println("What is your favorite car?");
	   }
	   
	   
	   
	   public void whatyear()
	   {
		   System.out.println("what year is your favorite?");
	   }
	   
		   
	   public void myyear()
	   {
		   System.out.println("My favorite year is 2025");
	   }
	   
	   
	   
	   
	public static void main(String[] args)
{
		
		 Cars sta=new Cars();
		 
         sta.st();
		
          
    
		Cars bran=new Cars();
        System.out.println(bran.branda);
        System.out.println(bran.brandb);
        System.out.println(bran.brandc);
        
        
        
        Cars model=new Cars();
        model.mo();
        
        Cars mod=new Cars();
        System.out.println(mod.model1);
        System.out.println(mod.model2);
        System.out.println(mod.model3);
        
        
        
        Cars years=new Cars();
        years.ye();
        
        
        Cars mo=new Cars();
       System.out.println(mo.yeara);
        System.out.println(mo.yearb);
        System.out.println(mo.yearc);
        
        
        Cars me=new Cars();
        me.myop();
        
        
       
        Cars you=new Cars();
        you.yourop();
        
        
       Cars year=new Cars();
       year.whatyear();
       
       
       Cars myyear=new Cars();
       myyear.myyear();
       
        
        
	}

}
