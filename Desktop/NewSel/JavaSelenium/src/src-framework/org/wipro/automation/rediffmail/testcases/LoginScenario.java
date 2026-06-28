package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.pages.LoginPage;
import org.wipro.automation.rediffmail.pages.LoginPage_PF;

public class LoginScenario extends InitiateBrowser 
{
    @Test
	public void tc01_vaildate_login_functionality_vaild_credential() throws Exception
	{
	
		
		LoginPage_PF login=new LoginPage_PF (driver);
		
		login.enter_username_textbox("John1");
	    login.enter_password_textbox("pass1234");
	    login.click_rememberme_checkbox();
	    login.click_loginbttn();
	}

	
	
	
	
}