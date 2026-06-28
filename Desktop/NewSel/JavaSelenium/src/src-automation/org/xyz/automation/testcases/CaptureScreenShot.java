package org.xyz.automation.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot
{


	public static void testresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;//takes screenshot automatically 
		
        File f= ts.getScreenshotAs(OutputType.FILE);
        
		File fd = new File("./screenshot/sprint1/" + name + ".png");
		
		String car="Honda";
		System.out.println("I drive a car" + car + ", this company has very good service");
		
		FileUtils.copyFile(f, fd);
		
		
		
		
		
	}

}
