package org.wipro.automation.rediffmail.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class InitiateBrowser 
{
   public WebDriver driver;
	
    @BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		
		if(ReadPropFile.read_config_data("BrowserName").equalsIgnoreCase("chrome"))
		{
			
	   driver= new ChromeDriver();

        }

	
	else if(ReadPropFile.read_config_data("BrowserName").equalsIgnoreCase("edge"))
	{

		driver= new EdgeDriver();
		
	}
	
	else if(ReadPropFile.read_config_data("BrowserName").equalsIgnoreCase("safari"))
	{

		driver= new SafariDriver();
		
	}
	
	
	 
	
	else if(ReadPropFile.read_config_data("BrowserName").equalsIgnoreCase("FF"))
	{

		driver= new FirefoxDriver();
		
	}
	
	
	
	
	
	
	else if(ReadPropFile.read_config_data("BrowserName").equalsIgnoreCase("IE"))
	{

		driver= new InternetExplorerDriver();
		
	}
	
	driver.get(ReadPropFile.read_config_data("ApplicationURL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
   }
	
	
	
        @AfterMethod
		public void closeBrowser()
		{	
		
		driver.quit();
		
		}
		
		
		
		}
		
	
