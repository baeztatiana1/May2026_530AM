package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscenario2
{

	
	@Test(groups="smoke")
	public void first_testcase()
	{
		System.out.println("first_testcase_");
		
	}
	
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	
	@Test(groups="sanity")
	public void third_testcase()
	{
		System.out.println("third_testcase_");
		
		
	}
		
		
	@Test
	public void fourth_testcase()
	{
		System.out.println("fourth_testcase");
	}
	
	
	@Test(groups="regression")
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
