package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.rediffmail.utilities.ReadPropFile;

public class RegisterationPage_PF 
{

	WebDriver driver;
	
	
	public RegisterationPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	

	
	@FindBy(xpath="//a[text()='Get a new Rediffmail ID']")
	WebElement getnewrediffmailid;
	
	
	@FindBy(css="[placeholder='Enter your full name']")
	WebElement register_fullname;
	
	

	@FindBy(css="[placeholder='Enter Rediffmail ID']")
	WebElement register_rediffmailid;
	
	@FindBy(css="[placeholder='Enter password']")
	WebElement register_choosepassword;
	
	@FindBy(css="[placeholder='Retype password']")
	WebElement register_retypepassword;
	
	@FindBy(css="[class='day']")
	WebElement register_dob_day;
	
	
	
	public void enter_username_textbox(String id) throws Exception
	{
		
		getnewrediffmailid.sendKeys(id);
	}
		
		
		

		public void register_fullname(String fullname) throws Exception
	{
		
			register_fullname.sendKeys(fullname);
		
		  	
	}
	
		
		public void register_rediffmail_id(String registerid) throws Exception
	{
		
	
			register_rediffmailid.sendKeys(registerid);
		
		
		
	}
		
		public void register_choosepassword_textbox(String rpassword) throws Exception
	{
		
		
			register_choosepassword.sendKeys(rpassword);
		
		  
	}	
		
		
		public void register_dob_day_textbox(String dobday) throws Exception
		{
			
			
			register_dob_day.sendKeys(dobday);
		}
			  
			
		
		
	 /*
		public void register_dob_day_dropdown(String day) throws Exception
		{
			
			WebElement register_dob_day=driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_dob_day_css")));
			((Select) register_dob_day).selectByVisibleText(day);
		
			
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
		
		
		
		//public void click_register_alernateID()throws Exception
		{
			
			driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_alternateID_css"))).click();
		}
		
	
		
		
		//public void select_security_question_dropdown(String food) throws Exception
		{
			
			Select security_question=new Select(driver.findElement(By.xpath(ReadPropFile.read_element_data("register_select_securityq_xpath"))));
			security_question.selectByVisibleText(food);
		
		
		}
		
		

		//public void enter_an_answer_textbox(String answer) throws Exception
		{
			
			//driver.findElement(By.xpath(ReadPropFile.read_element_data("register_enter_an_answer_xpath"))).sendKeys(answer);
			
			  
			
		}	
		
	
		
		//public void enter_mothers_maidenname_textbox(String madienname) throws Exception
		{
			
			//driver.findElement(By.xpath(ReadPropFile.read_element_data("register_mothers_maidenname_xpath"))).sendKeys(madienname);
			
			
		}	
		
		
		
		
		//public void select_mobile_number_dropdown(String USA) throws Exception
		{
			
			//Select mobile_number=new Select(driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_mobile_number_usa_css"))));
			//mobile_number.selectByVisibleText(USA);
		
		
		}
		
		
		
		
		
		
		
		
		//public void enter_mobile_number_textbox(String mobilenum) throws Exception
		{
			
			//driver.findElement(By.cssSelector(ReadPropFile.read_element_data("register_mobilenumber_css"))).sendKeys(mobilenum);
		*\	
			  	
		}	
	
	
		
		
		
		
		
		
		


