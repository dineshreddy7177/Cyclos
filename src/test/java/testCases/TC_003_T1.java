package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginT1;
import pageObjects.Task1;
import testBase.BaseClassT1;

public class TC_003_T1 extends BaseClassT1{
	@Test
	
	public void register() throws InterruptedException {
      LoginT1 LT=new LoginT1(driver);
		
		Task1 T1 = new Task1(driver);

			LT.click_register();
			Thread.sleep(3000);
			LT.username();
			Thread.sleep(3000);
			LT.password();
			Thread.sleep(3000);
			LT.submit();
			Thread.sleep(3000);
			 T1.payuser();
			 Thread.sleep(3000);
			 T1.book();
			 Thread.sleep(3000);
			 T1.Emma();
			 Thread.sleep(3000);
			 T1.amount();
			 Thread.sleep(3000);
			 T1.paynow();
			 Thread.sleep(3000);
			 T1.des();
			 Thread.sleep(3000);
			 T1.next();
			 Thread.sleep(3000);
			 T1.Confirm();
			 Thread.sleep(3000);
			 T1.print();
		}
	}

