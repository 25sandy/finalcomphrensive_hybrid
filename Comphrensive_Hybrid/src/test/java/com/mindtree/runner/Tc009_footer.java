package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.footer;
import com.nobroker.pageobject.Testimonials;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ConfigReader;

public class Tc009_footer extends BaseClass {
	public footer foot;
	@Test(priority=2)
	public void foot() throws InterruptedException, IOException {
		logs.enterInfoLog("click on the about us");
		exReport.enterPassLog("click on the about us");
		foot.footoperation();
		String time=webDriver.getText(driver, HomepageUi.time);
		if(time!=" ") {
			 assertTrue(true);
			logs.enterInfoLog("cureent time is"+time);
			exReport.enterPassLogWithSnap(time);
		}
		else {
			 assertTrue(false);
			logs.enterErrorLog("the page not openned");
			exReport.enterFailLogWithSnap("error");
		}
	}
	 @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("footer");
		 foot=new footer(driver, webDriver, exReport);
			logs.createLogger(footer.class);	
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
