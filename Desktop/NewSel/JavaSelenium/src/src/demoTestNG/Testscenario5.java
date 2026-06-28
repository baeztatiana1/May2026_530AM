package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscenario5
{

	
	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase_");
		
	}
	
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	
	@Test(groups={"Regression","sanity"})
	public void third_testcase()
	{
		System.out.println("third_testcase_");
		
		
	}
		
		
	@Test
	public void fourth_testcase()
	{
		System.out.println("fourth_testcase");
	}
	
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
}
