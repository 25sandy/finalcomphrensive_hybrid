package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.LoanAggrement;
import com.nobroker.pageobject.Login;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ConfigReader;

public class Tc002_Loan_Agreement extends BaseClass{
   public   LoanAggrement loan;
	public Login login;
   @Test(priority = 0)
	public void setUp() {
	   exReport.createNewTestReport("LoginAggrement");
		loan = new LoanAggrement(driver,webDriver,exReport);
		login = new Login(driver,webDriver,exReport);
		logs.createLogger(LoanAggrement.class);	
	}
   
	@Test(priority=1)
	public void openNobroker() {
		webDriver.openPage(driver, ConfigReader.getUrl());
		//System.out.print(ConfigReader.getUrl());
		if (webDriver.getCurrentUrl(driver).equals(ConfigReader.getUrl())) {
			 assertTrue(true);
		    exReport.enterInfoLog("nobroker  as opened");
		    logs.enterInfoLog("nobroker as opened");
		} else {
			 assertTrue(false);
			exReport.enterPassLog("nobroker didn't open");
		}
	}
	
	@Test(priority=2)
	public void loanAgreement() {
		logs.enterInfoLog("Click on the loan aggrement ");
	  loan.selectLA();	
	 
	}
	@Test(priority=3)
	public  void checkpageTitle() throws IOException {
		//webDriver.openPage(driver, ConfigReader.getUrl());
		logs.enterInfoLog("check the page title with the given input");
		exReport.enterPassLog("check the page title with given input");
	     loan.verifyTitle();
	     
	     
	}

	
}
