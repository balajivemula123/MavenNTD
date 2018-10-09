package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseSetup;


public class Homepage extends BaseSetup

{
	@FindBy(xpath="//a[text()='SIGN-ON']")
	WebElement signon;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement  register;
	
	@FindBy(xpath="//a[text()='SUPPORT']")
	WebElement  support;
	
	@FindBy(xpath="//a[text()='CONTACT']")
	WebElement contacts;
	
	
	@FindBy(xpath="//a[text()='Flights']")
	WebElement  flights;
	
	@FindBy(xpath="//a[text()='Hotels']")
	WebElement hotels;
	
	@FindBy(xpath="//a[text()='Car Rentals']")
	WebElement carrentals;
	
	@FindBy(xpath="//a[text()='Cruises']")
	WebElement  cruises;
	
	@FindBy(xpath="//a[text()='Destinations']")
	WebElement destinations;
	
	@FindBy(xpath="//a[text()='Vacations']")
	WebElement vacations;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public Loginpage ClickOnSignOn()
	{
		signon.click();
		return new Loginpage();
		
	}
	
	public Registerpage ClickOnRegister()
	{
		register.click();
		return new Registerpage();
	}
	
	public void ClickOnSupport()
	{
		support.click();
	}
	
	
	public void ClickOnContacts()
	{
		contacts.click();
	}
	
	
	public void ClickOnFlights()
	{
		flights.click();
	}
	
	public void ClickOnHotels()
	{
		hotels.click();
	}
	
	public void ClickOnCarrental()
	{
		carrentals.click();
	}
	
	public void ClickOnCruises()
	{
		cruises.click();
	}
	
	
	public void ClickOnDestinations()
	{
		destinations.click();
	}
	 

	public void ClickOnVacations()
	{
		vacations.click();
	}
	
	
	
	
	
	
	
	

}
