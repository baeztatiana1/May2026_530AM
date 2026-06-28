package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class RegisterationPage 
{

	WebDriver driver;
	
	
	public RegisterationPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	
	public void click_newrediffmailid_link()throws Exception
	{
		
		driver.findElement(By.xpath(ReadPropFile.read_element_data("login_getnewrediffmailid_xpath"))).click();
	}
		
		
		
		
		
		public void enter_fullname_textbox(String fname) throws Exception
	{
		
		driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_fullname_css"))).sendKeys(fname);
		
		  	
	}
	
		
		public void enter_rediffmailid_textbox(String email) throws Exception
	{
		
		driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_rediffmailid_css"))).sendKeys(email);
		
		  
		
		
	}
		
		public void enter_choose_password_textbox(String password) throws Exception
	{
		
		driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_choosepassword_css"))).sendKeys(password);
		
		  
		
		
	}	
		
		
		
		public void enter_retype_password_textbox(String retypepassword) throws Exception
		{
			
			driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_retypepassword_css"))).sendKeys(retypepassword);
			
			  
			
		}	
		
	
		public void select_dob_day_dropdown(String day) throws Exception
		{
			
			Select dob_day=new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_dob_day_css"))));
			dob_day.selectByVisibleText(day);
		
			
		}	
		
		
		public void select_dob_month_dropdown(String Month) throws Exception
		{
			
			Select dob_month=new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_dob_month_css"))));
			dob_month.selectByVisibleText(Month);
		
		
		}
	
		public void select_dob_year_dropdown(String year) throws Exception
		{
			
			Select dob_year=new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_dob_year_css"))));
			dob_year.selectByVisibleText(year);
		
		
		}

		public void click_gender_female() throws Exception
		{
			
			driver.findElement(By.xpath(ReadPropFile.read_element_data("register_gender_female_xpath"))).click();
			
			
		}	
	
		
		
		public void select_ilivein_Unitedstates(String Unitedstates) throws Exception
		{
			
			Select ilivein_US=new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_ilivein_css"))));
			ilivein_US.selectByVisibleText(Unitedstates);
		
		
		}
	
		
		public void enter_register_recoveryemail_textbox(String recoverymail) throws Exception
		{
			
			driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_recoveryemail_css"))).sendKeys(recoverymail);
			
			  
			
		}	
		
		
		
		public void click_register_alernateID()throws Exception
		{
			
			driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_alternateID_css"))).click();
		}
		
	
		
		
		public void select_security_question_dropdown(String food) throws Exception
		{
			
			Select security_question=new Select(driver.findElement(By.xpath(ReadPropFile.read_element_data("register_select_securityq_xpath"))));
			security_question.selectByVisibleText(food);
		
		
		}
		
		

		public void enter_an_answer_textbox(String answer) throws Exception
		{
			
			driver.findElement(By.xpath(ReadPropFile.read_element_data("register_enter_an_answer_xpath"))).sendKeys(answer);
			
			  
			
		}	
		
	
		
		public void enter_mothers_maidenname_textbox(String madienname) throws Exception
		{
			
			driver.findElement(By.xpath(ReadPropFile.read_element_data("register_mothers_maidenname_xpath"))).sendKeys(madienname);
			
			
		}	
		
		
		
		
		public void select_mobile_number_dropdown(String USA) throws Exception
		{
			
			Select mobile_number=new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_mobile_number_usa_css"))));
			mobile_number.selectByVisibleText(USA);
		
		
		}
		
		
		
		
		
		
		
		
		public void enter_mobile_number_textbox(String mobilenum) throws Exception
		{
			
			driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_mobilenumber_css"))).sendKeys(mobilenum);
			
			  	
		}	
	
	
		
		
		
		
		
		
		
}
