package org.xyz.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class BrowserControl 
{
	WebDriver driver;
	
	
	@Test
	public void control_browser()      //method
	{
	
	
		
		driver= new ChromeDriver(); //this is object of the class //this will launch chrome driver 
		
		
		driver.manage().window().maximize();  
		
		driver.get("https://www.google.com/");// can only get the url
		
	
		driver.get("https://www.saucedemo.com/");
		//or you can use driver.navigate().to("https://www.saucedemo.com/"); instead of.get above
		
		
	
		
		driver.navigate().back(); //navigate has more features 
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.close(); //this can only closes one tab/window
		
		driver.quit(); // this will close all the windows 
		
	}
	
	
}
	
	