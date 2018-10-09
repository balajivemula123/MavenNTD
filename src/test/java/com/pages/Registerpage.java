package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.BaseSetup;
import com.Wrapperclasses.SeleniumWrappaer;

public class Registerpage extends BaseSetup

{

	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement Phone;
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement Addres;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement Postalcode;
	
	@FindBy(name="country")
	WebElement Dropdown;
	
	@FindBy(name="email")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement PassWord;
	

	@FindBy(name="confirmPassword")
	WebElement CPassWord;
	
	@FindBy(name="register")
	WebElement Submit;
	
	
	public  Registerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Registerdetails(String Fname,String Lname,String phone,String Email,String addres, String city,String state,
			                    String postalcode,String dropdown,String username,String password,String cpassword )
	{
		SeleniumWrappaer.enterText(FirstName, Fname);
		SeleniumWrappaer.enterText(LastName, Lname);
		SeleniumWrappaer.enterText(Phone, phone);
		SeleniumWrappaer.enterText(email, Email);
		SeleniumWrappaer.enterText(Addres, addres);
		SeleniumWrappaer.enterText(City, city);
		SeleniumWrappaer.enterText(State, state);
		SeleniumWrappaer.enterText(Postalcode, postalcode);
		
		SeleniumWrappaer.WBdropdown(Dropdown, dropdown);
		
		
		SeleniumWrappaer.enterText(UserName, username);
		SeleniumWrappaer.enterText(PassWord, password);
		SeleniumWrappaer.enterText(CPassWord, cpassword);
	}
	
	public void clickonsubmit()
	{
		SeleniumWrappaer.SeleniumClick(Submit);
		
	}
	
	
	
}
	
	