package com.Test;

import org.testng.annotations.Test;

import com.Base.BaseSetup;
import com.pages.Homepage;

public class HomepageTest extends BaseSetup

{
 Homepage pg;
@Test(priority=0)
public void verifyRegisterLink()
{
	pg= new Homepage();
	 pg.ClickOnRegister();
	 
	 	
}

@Test(priority=1)
public void verifyloginLink()
{
	pg= new Homepage();
	 pg.ClickOnSignOn();
	 	 	
}
@Test(priority=2)
public void verifySupportLink()
{
	pg= new Homepage();
	 pg.ClickOnSupport();
	 	 	
}
	
@Test(priority=3)
public void verifyContactLink()
{
	pg= new Homepage();
	 pg.ClickOnContacts();
	 	 	
}
@Test(priority=4)
public void verifyFlightsLink()
{
	pg= new Homepage();
	 pg.ClickOnFlights();
	 	 	
}
@Test(priority=5)
public void verifyHotelsLink()
{
	pg= new Homepage();
	 pg.ClickOnHotels();
	 	 	
}
@Test(priority=6)
public void verifycarrentalsLink()
{
	pg= new Homepage();
	 pg.ClickOnCarrental();
	 	 	 	
}

@Test(priority=7)
public void verifyCruisesLink()
{
	pg= new Homepage();
	 pg.ClickOnCruises();
	 	 	
}
@Test(priority=8)
public void verifyDestinationsLink()
{
	pg= new Homepage();
	 pg.ClickOnDestinations();
	 	 	
} 
@Test(priority=9)
public void verifyVacationsLink()
{
	pg= new Homepage();
	 pg.ClickOnVacations();
	 	 	
}

}
