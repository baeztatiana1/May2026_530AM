package org.xyz.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;



public class FirstAutomationSauce 
{
	WebDriver driver;
	
	
	@BeforeMethod 
	public void launchbrowser()
	{
	
		ChromeOptions co= new ChromeOptions ();
		
		co.addArguments("--incognito");
		
		driver= new ChromeDriver(co); //this will launch chrome driver (co) will launch incognito
		
		driver.get("https://www.saucedemo.com/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		 //System.out.println(driver.getCurrentUrl());
		 //System.out.println(driver.getTitle());
		 
		//Assert.assertEquals(driver.getTitle(),"Rediffmail - Free Email for Login with Secure Access");
		
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closerBrowser()
	{
		//driver.close();
	}
		
	

    @Test(enabled=false)
	public void register_functionlaity()
	{
	
	
	//driver.findElement(By.cssSelector("[title='Create new Rediffmail account']")).click();
	
	WebElement login= driver.findElement(By.className("signin-btn")); //login locator and store in login as container //this is my landmark
	
	//relative locator used 
	driver.findElement(with(By.xpath("//a[@title='Create new Rediffmail account']")).below(login)).click();
	
	
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	
	 Assert.assertEquals(driver.getTitle(),"Rediffmail - Free Email for Login with Secure Access");
	
	
	
	//driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
	
	driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("Taty seo");
	
	driver.findElement(By.cssSelector("[placeholder='Enter Rediffmail ID']")).sendKeys("myemail");
	
	driver.findElement(By.cssSelector("[placeholder='Enter password']")).sendKeys("mypassword");
	
	driver.findElement(By.cssSelector("[placeholder='Retype password']")).sendKeys("mypassword");
	
	//date of birth 
	
	
	Select dob_month=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
	
	
	//this are different ways to select a drop down only chose 1
	
	//dob_month.selectByIndex(2); //FEB
			
	//dob_month.selectByValue("05"); //May
	
	//dob_month.selectByVisibleText("Sep");
	
	//dob_month.selectByContainsVisibleText("Dec");
	
	dob_month.selectByValue("12");

	
	Select dob_day=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
	
    dob_day.selectByValue("21");
	
    Select dob_year=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
    
    dob_year.selectByValue("1987");
    
    //WebElement female=driver.findElement(By.xpath("//select[contains(@name,'gender'")); *need help with radio button
    
    Select country=new Select(driver.findElement(By.xpath("//select[contains(@name,'country')]")));
    
    country.selectByValue("222");
    
    driver.findElement(By.cssSelector("[placeholder='Enter recovery email']")).sendKeys("myemail1.com");
    
   
    
    driver.findElement((By.id("[class='f12']"))).click();
    
    
    
    driver.findElement(By.cssSelector("[id='mobno']")).sendKeys("201-000-0000");
    
    
    driver.findElement(By.cssSelector("[type='checkbox']"));
    
    
    WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(20));
    
    
    driver.close();    
	}
	
	
	
    @Test(enabled=true)
	public void login_functionlaity()
	{
	
    	WebElement username_textbox=driver.findElement(By.cssSelector("[placeholder='Username']"));//username
    	

        username_textbox.sendKeys("standard_user"); //telling it to write username
	
	//username_textbox.clear();//it you want to clear it 
	
	//username_textbox.sendKeys("john.seo");//telling it write the correct username 
    driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("pass1234");//password and telling it to write the password 
	
    driver.findElement(By.cssSelector("[class='submit-button btn_action']")).click(); //telling it to click to submit
    
   
    WebElement wrong_password=driver.findElement(By.cssSelector("[class='error-button']"));//showing error message
  
 String full_text= driver.findElement(By.cssSelector("[data-test='error']")).getText();//showing the error 
 

 
WebElement password=driver.findElement(By.cssSelector("[placeholder='Password']"));
          password.clear();//clearing the password
         
          password.sendKeys("secret_sauce");//telling it to write the correct pw
     driver.findElement(By.cssSelector("[name='login-button']")).click();//telling it to click to log in 
     
   
     
     
List<WebElement> productlist =driver.findElements(By.cssSelector("//div[text()='Sauce Labs Backpack']"));
    



    
   // System.out.println(driver.findElement(By.id("remember")).isSelected()); //true
    
    //driver.findElement(By.id("remember")).click(); //uncheck 
    
    //System.out.println(driver.findElement(By.id("remember")).isSelected()); //now this is false because we unchecked box with above code 
    
    
    
    //System.out.println(driver.findElement(By.className("signin-btn")).getLocation());
    
   // System.out.println(driver.findElement(By.className("signin-btn")).isEnabled());//True 
    
   // System.out.println(driver.findElement(By.className("signin-btn")).isDisplayed()); //True

 //  driver.findElement(By.className("signin-btn")).click();

     
	
	
	}
	
}
