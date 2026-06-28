package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.data.TestDataDriven;
import org.wipro.automation.rediffmail.pages.LoginPage;
import org.wipro.automation.rediffmail.pages.LoginPage_PF;

public class LoginScenario_DDF extends InitiateBrowser 
{
    @Test(dataProvider="Login",dataProviderClass=TestDataDriven.class)
	public void tc01_vaildate_login_functionality_vaild_credential(String username, String password) throws Exception
	{
	
		
		LoginPage_PF login=new LoginPage_PF (driver);
		
		login.enter_username_textbox(username);
	    login.enter_password_textbox(password);
	    login.click_rememberme_checkbox();
	   // login.click_loginbttn();
	}

    @DataProvider(name="Login")
	public Object[][] login_data()
	{
		
		//String data="John1";
		//Object[] data2= {"John1","johnpass1"};
		Object[][] data3= {{"John1","johnpass1"},{"David1","Davidpass1"},{"Neena1","Neenapass1"}};
		
		
		return data3;
		
		
		
	}
	
	
	
}