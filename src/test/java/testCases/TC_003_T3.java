package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginT1;
import pageObjects.Task3;
import testBase.BaseClassT1;

public class TC_003_T3 extends BaseClassT1{

	@Test 
	public void register() throws InterruptedException {
		LoginT1 L1=new LoginT1 (driver);
		
		Task3 T3 = new Task3(driver);
		
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		T3.payuser();
		T3.book();
		T3.Emma();
		T3.amount();
		Thread.sleep(3000);
		T3.paynow();
		T3.paynow1();
		Thread.sleep(3000);
		T3.instalements();
		T3.des();
		T3.next();
		T3.Confirm();
		
	}
}

