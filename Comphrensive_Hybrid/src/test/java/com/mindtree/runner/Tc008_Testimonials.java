package com.mindtree.runner;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nobroker.pageobject.Testimonials;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.BaseClass;
import com.nobroker.utility.ConfigReader;

public class Tc008_Testimonials extends BaseClass {
	public Testimonials project;
	@Test(priority=2)
	public void project() throws InterruptedException, IOException {
		project.getdetails();
		webDriver.switchTab(driver, 1);	
		String para=webDriver.getText(driver, HomepageUi.rating);
		if(para!=" ") {
		 assertTrue(true);
		 logs.enterInfoLog("the testimonial is printed"+para);
		 exReport.enterPassLogWithSnap(para);
		
		}
		else {
			assertTrue(false);
			exReport.enterFailLogWithSnap(para);
		}
	}
	 @Test(priority = 0)
		public void setUp() {
		   exReport.createNewTestReport("Testimonials");
		 project=new Testimonials(driver, webDriver, exReport);
			logs.createLogger(Testimonials.class);	
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
