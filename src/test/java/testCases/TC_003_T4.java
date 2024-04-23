package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginT1;
import pageObjects.Task4;
import testBase.BaseClassT1;

public class TC_003_T4 extends BaseClassT1{
	@Test 
	public void register() throws InterruptedException {
	LoginT1 L1=new LoginT1 (driver);
	
	Task4 T4 = new Task4(driver);
	L1.click_register();
	L1.username();
	L1.password();
	L1.submit();
	Thread.sleep(2000);
	T4.payuser();
	T4.book();
	T4.Emma();
	T4.amount();
	Thread.sleep(3000);
	T4.paynow();
	Thread.sleep(3000);
	T4.Recurring();
	Thread.sleep(3000);
	T4.futuredate();
	Thread.sleep(3000);
	T4.date();
	Thread.sleep(3000);
	T4.Fixednumberofoccurrences();
	Thread.sleep(3000);
	T4.Numberofoccurences();
	Thread.sleep(3000);
	T4.months();
	Thread.sleep(3000);
	T4.weeks();
	Thread.sleep(3000);
	T4.des();
	Thread.sleep(3000);
	T4.next();
	T4.Confirm();

}
}