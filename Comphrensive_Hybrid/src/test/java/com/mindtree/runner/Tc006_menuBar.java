package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.EmiCalculator;
import com.nobroker.pageobject.menuBar;
import com.nobroker.uistore.menuBarUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ConfigReader;

public class Tc006_menuBar extends BaseClass {
	public menuBar menu;
	@Test(priority=2)
	public void menubar()  throws InterruptedException, IOException {
		logs.enterInfoLog("find if the text present in page or not");
		exReport.enterPassLog("find if the text present in page or not");
		menu.getProperty();
		String title=webDriver.getText(driver,menuBarUi.nobroker);
		if(title!=" ") {
			assertTrue(true);
			logs.enterInfoLog("the title is present in the page");
			logs.enterInfoLog("title is"+title);
			exReport.enterPassLogWithSnap("the title is present in the page"+title);
		}
		else {
			assertTrue(false);
			logs.enterInfoLog("the title is  not present in the page");
			exReport.enterFailLogWithSnap("no title");
			
		}
	}
	 @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("menu-post your property");
		 menu=new menuBar(driver, webDriver, exReport);
			logs.createLogger(menuBar.class);	
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


