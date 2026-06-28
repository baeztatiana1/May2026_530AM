package demoTestNG;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{

	
	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		Assert.assertEquals("hello", "hello testng");
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	
	
	@Test(priority=0)
	public void fourth_testcase()
	{
		System.out.println("fourth_testcase");
	}
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	@Test
	public void seventh_testcase()
	{
	}
	}
