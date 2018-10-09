package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseSetup;
import com.Wrapperclasses.SeleniumWrappaer;


public class Loginpage extends BaseSetup
{
  
	@FindBy(xpath="//input[@name='userName']")
	WebElement wbusername;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement wbpassword;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement wbsubmit;
	
	@FindBy(xpath="//a[text()='SIGN-OFF']")
	WebElement wbsignout;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserNameandPassword(String UserName,String PassWord) throws InterruptedException
	{
		SeleniumWrappaer.Threadsleep();
		SeleniumWrappaer.enterText(wbusername, UserName);
		SeleniumWrappaer.enterText(wbpassword, PassWord);
	}
	
	
	public void ClickOnSubmit()
	{
		SeleniumWrappaer.SeleniumClick(wbsubmit);
	}
	
	public void clickOnSignout()
	{
		SeleniumWrappaer.SeleniumClick(wbsignout);
	}
	
	
	
}
