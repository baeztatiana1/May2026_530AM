package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.pages.LoginPage;
import org.wipro.automation.rediffmail.pages.RegisterationPage;

public class RegisterScenario extends InitiateBrowser 
{
    @Test
	public void tc02_vaildate_register_functionality_vaild_data() throws Exception
	{
	
		
    	RegisterationPage reg=new RegisterationPage(driver);
		
    	reg.click_newrediffmailid_link();
		reg.enter_fullname_textbox("John Seo");
    	reg.enter_rediffmailid_textbox("john.seo@rediffmail.com");
    	reg.enter_choose_password_textbox("Johnjohn");
    	reg.enter_retype_password_textbox("johnjohn");
    	reg.select_dob_day_dropdown("21");
    	reg.select_dob_month_dropdown("DEC");
    	reg.select_dob_year_dropdown("1987");
    	reg.click_gender_female();
    	
    	
	}

	
	
	
	
}