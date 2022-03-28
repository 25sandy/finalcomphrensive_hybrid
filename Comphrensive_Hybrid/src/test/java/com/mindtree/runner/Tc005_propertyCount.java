package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.EmiCalculator;
import com.nobroker.pageobject.propertyCount;
import com.nobroker.uistore.propertyCountUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ConfigReader;

public class Tc005_propertyCount extends BaseClass {
	public propertyCount count;
	@Test(priority=2)
	public void counting() throws InterruptedException, IOException {
		logs.enterInfoLog("check for number properties available in particular location");
		exReport.enterPassLog("check the number of properties available in particular location");
		count.countingofplots();
		String count=webDriver.getText(driver, propertyCountUi.count);
		//String count=" ";
	     if(count!=" ") {
	    	 assertTrue(true);
	    	 logs.enterInfoLog("the available property is"+count);
	    	 exReport.enterPassLogWithSnap(count);
	     }
	     else
	     {
	    	 assertTrue(false);
	    	 logs.enterInfoLog("no plots available");
	    	 exReport.enterFailLogWithSnap("no plots is available");
	     }
	}
	 @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("propertyCount");
		 count=new propertyCount(driver, webDriver, exReport);
			logs.createLogger(propertyCount.class);	
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


