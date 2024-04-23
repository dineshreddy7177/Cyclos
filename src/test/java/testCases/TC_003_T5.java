package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginT1;
import pageObjects.Task5;
import testBase.BaseClassT1;

public class TC_003_T5 extends BaseClassT1{
	@Test 
	public void register() throws InterruptedException {
	LoginT1 L1=new LoginT1 (driver);
	
	Task5 T5 = new Task5(driver);
	L1.click_register();
	L1.username();
	L1.password();
	L1.submit();
	Thread.sleep(2000);
	T5.payuser();
	Thread.sleep(2000);
	T5.ReceiveQRcode();
	Thread.sleep(2000);
	T5.amount();
	Thread.sleep(2000);
	T5.generateQRcode();
	Thread.sleep(2000);
	T5.generateNEWQRcode();


}
}
