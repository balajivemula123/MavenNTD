package com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.Wrapperclasses.SeleniumWrappaer;
import com.pages.Homepage;
import com.pages.Loginpage;
import com.utilities.Readproperty;
import com.utilities.TestData;

public class LoginTest extends BaseSetup 
{
	
  //Readproperty pr= new Readproperty("login");
	@DataProvider(name="LoginData")
	public Object[][] getTestDta()
	{
		Object data[][]=TestData.getTestData("Sheet1");
		return data;
	
}
	
	@Test(dataProvider ="LoginData")
	public void verifyUserNameandPassWord(String Firstname,String LastName,String Phone,String Email,String Address,String City,String State,
            String Postalcode,String Country,String Uname,String Password ,String Cpassword ) throws InterruptedException
	
	{
		Homepage pg = new Homepage();
		pg.ClickOnSignOn();
		
		
		
	Loginpage lp= new Loginpage();
		
		lp.EnterUserNameandPassword(Uname,Password);
		lp.ClickOnSubmit();

		//SeleniumWrappaer.Threadsleep();
		
		lp.clickOnSignout();

	

	}	
}
