package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistartionPage;
import pageObjects.RegistrationConformation;
import testBase.BaseClass;

public class TC_001_New_registration  extends BaseClass{
	@Test
	public void registrationAccout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		 RegistartionPage rp=new  RegistartionPage(driver);
		RegistrationConformation rc=new RegistrationConformation(driver);
		hp.click_register();
		Thread.sleep(3000);
		rp.setname();
		Thread.sleep(3000);
		rp.setloginName();
		
		rp.setEmail();
		
		rp.setwebsite();
		
		rp.setGender();
		
		rp.withoutselectFromDropdown();
		
		rp.setMobilephone();
		
		rp.setLandlinephone();
		
		rp.clickNext();
		Thread.sleep(3000);
		rc.psd();
		rc.cpsw();

		rc.cb();
		rc.capcha();
		rc.submit();



}
}
