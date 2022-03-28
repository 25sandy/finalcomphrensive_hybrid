package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.ApartmentPrice;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ConfigReader;

public class Tc007_ApartmentPrice extends BaseClass {
	public ApartmentPrice price;
	@Test(priority=2)
	public void gprice() throws InterruptedException, IOException {
		
		price.getprice();
		String price=webDriver.getText(driver,HomepageUi.aprice);
		if(price!=" ") {
			assertTrue(true);
			logs.enterInfoLog("the apartment price is"+price);
			exReport.enterPassLogWithSnap(price);
		}
		else {
			assertTrue(false);
			exReport.enterFailLogWithSnap(price);
		}
	}
	 @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("ApartmentCost");
		 price=new ApartmentPrice(driver, webDriver, exReport);
			logs.createLogger(ApartmentPrice.class);	
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
