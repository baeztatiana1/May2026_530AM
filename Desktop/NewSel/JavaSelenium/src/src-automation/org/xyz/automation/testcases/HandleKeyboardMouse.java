package org.xyz.automation.testcases;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v146.page.Page.CaptureScreenshotFormat;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class HandleKeyboardMouse 
{

	
	@Test (enabled=true)
	 public void  tc01_handleAlert() throws Exception
	 {
		 
		 
		 WebDriver driver = new ChromeDriver();
	  // Open application URL passing the URL
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    // Maximize browser
    driver.manage().window().maximize();
	
    driver.findElement(By.className("signin-btn")).click();
    driver.switchTo().alert().accept();
    
    CaptureScreenShot.testresult(driver, "tc01_handleAlert");
	
	 }
	
	

	@Test (enabled=false)
	 public void  handleMouse() throws Exception
	 {
		 
		 
		 WebDriver driver = new ChromeDriver();
	  // Open application URL passing the URL
     driver.get("https://www.mphasis.com/home.html");
     // Maximize browser
     driver.manage().window().maximize();

     Actions act=new Actions(driver);
    // act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
     
     act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
     //act.click(driver.findElement(By.xpath("//span[text()=' HealthCare '] "))).perform();
     
     act.keyDown(Keys.COMMAND). click(driver.findElement(By.xpath("//span[text()=' HealthCare '] "))).keyUp(Keys.COMMAND).perform(); //this opens the other window/tab
     
     
    // act.scrollToElement(driver.findElement(By.xpath("//span[text()='ENTERPRISE AGENCY PLATFORM, GOVERNED']"))).perform();
     
     Set<String> windowsid= driver.getWindowHandles();//once you have two tabs your going to handle with this method this gets you the windows id. Need to Iterator 
     System.out.println(windowsid);
     
  Iterator<String> itr=windowsid.iterator();   //default this doesn't point to any window
  System.out.println(itr);
  
     
     String win1= itr.next();//points to window 1. you can change the name to homepage instead of win1 if this makes more sense
  
     String win2=itr.next();//points to window 2. you can change the name to healthcare instead of win2 if this makes more sense 
     
     driver.switchTo().window(win2);
    
     
     System.out.println(driver.getTitle());
     //Thread.sleep(Duration.ofSeconds(2));
   //driver.switchTo().window(win1);
     
   
  
   
   
   
     
  act.keyDown(Keys.COMMAND). click(driver.findElement(By.xpath("//span[text()='NEWS ROOM'] "))).keyUp(Keys.COMMAND).perform(); //this opens the other window/tab 
     
     
	 }
	
	
	
	
	
	
 
	@Test(enabled=false) 
	 public void  handlekeyboard()
	 {
		 
		 
		 WebDriver driver = new ChromeDriver();
	  // Open application URL passing the URL
     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
     // Maximize browser
     driver.manage().window().maximize();


	Actions act=new Actions(driver);
	
	//act.sendKeys(Keys.PAGE_DOWN).perform();
	
	act.sendKeys("john1").perform();//username
	act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("john1234").perform();//password
	//act.sendKeys(Keys.ENTER).perform();
	
	
	
	
	
	
		
}
}