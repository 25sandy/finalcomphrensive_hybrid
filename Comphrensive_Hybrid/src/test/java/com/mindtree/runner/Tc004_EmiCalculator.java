package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.EmiCalculator;
import com.nobroker.pageobject.LoanAggrement;
import com.nobroker.uistore.EmiCalculatorUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ConfigReader;

public class Tc004_EmiCalculator extends BaseClass{
	 public   LoanAggrement loan;
		
		public EmiCalculator emi;
		@Test(priority=2)
		public void emicalci() throws IOException {
			logs.enterInfoLog("emi calculator");
			exReport.enterInfoLog("emi calculator");
			emi.emiCalci();
			String memi=webDriver.getText(driver,EmiCalculatorUi.monthlyEmi);
				
			if(memi!=" ") {
				 assertTrue(true);
				logs.enterInfoLog("Monthly emi for your amount is"+memi);
				exReport.enterPassLog("Monthly emi for your amount is"+memi);
				exReport.enterPassLogWithSnap(memi);
				}
				else {
					 assertTrue(false);
					logs.enterErrorLog("entered wrong ammount");
					exReport.enterFailLogWithSnap(memi);
				}
			//CaptureScreeshot.takeScreenshot();
			
			
		}
		  @Test(priority = 0)
			public void setUp() {
			   exReport.createNewTestReport("Emicalculator");
			 emi=new EmiCalculator(driver, webDriver, exReport);
				logs.createLogger(EmiCalculator.class);	
			}
		   
			@Test(priority=1)
			public void openNobroker() {
				webDriver.openPage(driver, ConfigReader.getUrl());
				//System.out.print(ConfigReader.getUrl());
				if (webDriver.getCurrentUrl(driver).equals(ConfigReader.getUrl())) {
				    exReport.enterInfoLog("nobroker  as opened");
				    logs.enterInfoLog("nobroker as opened");
				} else {
					exReport.enterPassLog("nobroker didn't open");
				}
			}
}
