package com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.pages.Homepage;
import com.pages.Loginpage;
import com.pages.Registerpage;
import com.utilities.Readproperty;
import com.utilities.TestData;

public class RegisterTest extends BaseSetup
{
	
	//Readproperty pr = new Readproperty("register");
	
	@DataProvider(name="RegisterData")
	public Object[][] getTestData()
	{
		Object data[][]=TestData.getTestData("Sheet1");
		return data;
	}
	
	
	@Test(dataProvider="RegisterData")
	public void VerifyRegisterDetails(String Firstname,String LastName,String Phone,String Email,String Address,String City,String State,
			                          String Postalcode,String Country,String Uname,String Password ,String Cpassword )
	{
	
		Homepage pg = new Homepage();
		pg.ClickOnRegister();
		
		Registerpage rp= new Registerpage();
		
		rp.Registerdetails(Firstname,LastName,Phone,Email,Address,City,State,Postalcode,Country,Uname,Password,Cpassword);
		
			
		rp.clickonsubmit();
		
		
		Loginpage lp= new Loginpage();
		
		  lp.clickOnSignout();
		
	}
	
	
	
	
	
	
}
