package firstpkg;


public class Ilovepizza 

{


	    int a=1;
		float b=5.99f;
		char c='I';
		boolean d=true;
		float h=7.99f;
	
		String e="I love Pizza";
         String f="My favorita pizza is cheese";
	     String loc="NYC";
	
	 public void ilovecheesepizza()
{
	      float h=7.99f;
	      System.out.println(h);
	       System.out.println(a);
}

	public static void main(String[] args)
	{
		
		Ilovepizza a=new Ilovepizza();
		System.out.println(a.a);
		System.out.println(a.b);
	    System.out.println(a.c);
	    System.out.println(a.d);
	    System.out.println(a.e);
	    System.out.println(a.f);
       System.out.println(a.h);
        System.out.println(a.loc);
       
       Ilovepizza abc=new Ilovepizza();
       abc.ilovecheesepizza();
	
       
       Ilovepizza2 sec=new Ilovepizza2 ();
       sec.main(args);
       
       
		
	}

}
