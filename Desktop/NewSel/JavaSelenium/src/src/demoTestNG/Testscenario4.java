package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testscenario4
{

	
	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase_1");
		
		Assert.assertEquals("hello", "hello");
		
		
		System.out.println("first_testcase_2");
		
		Assert.assertEquals("hello", "hello TestNG");
		
		
		System.out.println("first_testcase_3");
		
		Assert.assertEquals("hello", "hello");
		
		
	}
	
	@Test(enabled=false)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	
	@Test
	public void registration()
	{
		System.out.println("registration");
		
		Assert.assertEquals("hello", "TestNG");
	}
		
		@Test(dependsOnMethods="registration")
		public void login() 
		{
			
			System.out.println("login");
			
			
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
