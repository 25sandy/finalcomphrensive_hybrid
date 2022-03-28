package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nobroker.pageobject.LoanAggrement;
import com.nobroker.pageobject.Login;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ConfigReader;

public class Tc001_Login_ToWebsite extends BaseClass {
	public Login login;
     
	
	   @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("Login");
		   login = new Login(driver,webDriver,exReport);
			logs.createLogger(Login.class);
			
		}
	   
		@Test(priority=1)
		public void openNobroker() {
			
			webDriver.openPage(driver, ConfigReader.getUrl());
			//System.out.print(ConfigReader.getUrl());
			if (webDriver.getCurrentUrl(driver).equals(ConfigReader.getUrl())) {
			    exReport.enterInfoLog("nobroker  as opened");
			    logs.enterInfoLog("nobroker as opened");
			   assertTrue(true);
			} else {
				exReport.enterPassLog("nobroker didn't open");
				 assertTrue(false);
			}
		}
		@Test(priority=2)
		public void Login() throws InterruptedException, IOException {
			logs.enterInfoLog("click on login button");
			exReport.enterPassLog("click on the login button");
			//System.out.println(excel.getNumericData("login", 0, 0));
			login.clicklogin();
		}
		@Test(priority=3)
		public void enterDetails() throws IOException {
			login.enterDetails(excel.getStringData("login", 0, 0),excel.getStringData("login", 1, 0));
			exReport.enterPassLogWithSnap("loggedin succesfully"+" ");
		}
	

}
