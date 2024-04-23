package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginT1;
import pageObjects.Task2;

import testBase.BaseClassT1;

public class TC_003_T2 extends BaseClassT1{
	@Test 
	public void register() throws InterruptedException {
		LoginT1 L1=new LoginT1(driver);
		
		Task2 T2= new Task2(driver);
		
		L1.click_register();
		Thread.sleep(3000);
		L1.username();
		Thread.sleep(3000);
		L1.password();
		Thread.sleep(3000);
		L1.submit();
		Thread.sleep(3000);
		T2.payuser();
		Thread.sleep(3000);
		T2.book();
		Thread.sleep(3000);
		T2.Emma();
		Thread.sleep(3000);
		T2.amount();
		Thread.sleep(3000);
		T2.paynow();
		Thread.sleep(3000);
		T2.paynow1();
		Thread.sleep(3000);
		T2.date();
		Thread.sleep(3000);
		T2.des();
		Thread.sleep(3000);
		T2.next1();
		Thread.sleep(3000);
		T2.Previous();
		Thread.sleep(3000);
		T2.changeamount();
		Thread.sleep(3000);
		T2.next();
		Thread.sleep(3000);
		T2.Confirm1();
		Thread.sleep(3000);
		T2.print();
		
		
	}

}
