package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.LoanAggrement;
import com.nobroker.pageobject.Login;
import com.nobroker.pageobject.hotelAddress;
import com.nobroker.uistore.hotelAddressUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ConfigReader;

public class Tc003_getHotelAddress extends BaseClass {
	 public   LoanAggrement loan;
		public Login login;
		public hotelAddress address;
		
		@Test(priority=2)
		public void getaddress() throws IOException, InterruptedException {
			logs.enterInfoLog("search for address");
			exReport.enterPassLog("search for address");
			address.getAddress();
			 String address1=webDriver.getText(driver, hotelAddressUi.head);
			if(address1!=" ") {
				 assertTrue(true);
				logs.enterInfoLog("address that you search is displayed");
				exReport.enterPassLog("address that you search is displayed");
				logs.enterInfoLog("address is"+address1);
				exReport.enterPassLog(address1);
				exReport.enterPassLogWithSnap(address1);
				}
			else {
				 assertTrue(false);
				logs.enterErrorLog("there no hotels in that area named taj");
				exReport.enterFailLogWithSnap("there no hotels in that area named taj");
			}
			
		       }
			
	
	   @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("hotelAddress");
			loan = new LoanAggrement(driver,webDriver,exReport);
			login = new Login(driver,webDriver,exReport);
			address=new hotelAddress(driver,webDriver,exReport);
			logs.createLogger(hotelAddress.class);	
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
