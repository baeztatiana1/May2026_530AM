package org.xyz.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;



public class HandleCalendar 
{
	WebDriver driver;
	
	
	@Test(enabled=false)
	public void calender_textbox()
	{
	
		
		driver= new ChromeDriver(); //this will launch chrome driver 
		
		driver.manage().window().maximize();
		
		driver.get("https://practice-automation.com/calendars/");// can only get the url
		
	driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2026-06-16");
	
	driver.findElement(By.cssSelector("[aria-label='Wed Jun 17 2026Use the space key to select the date.']")).click(); // this is a static not dynamic  
		
		
		
	}
	
	
	@Test
	public void calender_icon() throws Exception
	{
	
		
		driver= new ChromeDriver(); //this will launch chrome driver 
		
		driver.manage().window().maximize();
	
	    driver.get("https://www.agoda.com/");
	
	driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();
	
	driver.findElement(By.cssSelector("[data-selenium-date='2026-06-16']")).click();
	
	Thread.sleep(Duration.ofSeconds(5));
	
	
	driver.findElement(By.cssSelector("[aria-label='Sun Jul 05 2026']")).click();
	
	
}
	
}
	
	