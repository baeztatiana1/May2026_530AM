package org.wipro.automation.rediffmail.data;

import org.testng.annotations.DataProvider;

public class TestDataDriven 
{

	
	@DataProvider(name="login")
	public Object[][] Login_data()
	{
	
	 //String data1="John1";
	// Object[] data2= {"John1","johnpass1", "Age"};
	 Object[][]data3={{"John1","johnpass1"},{"David1","Davidpass1"},{"Nenna1","Nennapass1"}};
	 return data3;
	 
	}
	
	
	
	@DataProvider(name="Register")
	public Object[][] register_data()
	{
	
	 //String data1="John1";
	// Object[] data2= {"John1","johnpass1", "Age"};
	 Object[][]data3={{"John1","johnpass1"},{"David1","Davidpass1"},{"Nenna1","Nennapass1"}};
	 return data3;
	 
	}
	
	
	
	
}
