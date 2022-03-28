package com.mindtree.runner;

import static org.junit.Assume.assumeTrue;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.footer;
import com.nobroker.pageobject.payrent;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ConfigReader;

public class Tc010_payrent extends BaseClass {
	public payrent rent;
	@Test(priority=2)
	public void reent() throws IOException {
		logs.enterInfoLog("click on the payrent option in home page");
		exReport.enterPassLog("click on the payrent option in home page");
		rent.printrent();
		webDriver.switchTab(driver, 1);	
		String data=" ";
		//String data=webDriver.getText(driver, HomepageUi.data);
        if(data!=" ") {
        	 assertTrue(true);
        	logs.enterInfoLog("payable option"+data);
        	exReport.enterPassLog(data);
        	
        }
        else {
        	 assertTrue(false);
        	 exReport.enterFailLogWithSnap("error");
        }
     
	}
	
	@Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("payrent");
		 rent=new payrent(driver, webDriver, exReport);
			logs.createLogger(payrent.class);	
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
