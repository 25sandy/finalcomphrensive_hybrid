package com.nobroker.pageobject;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class Testimonials {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public Testimonials(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(Testimonials.class);	
	}
	public void getdetails() throws InterruptedException {
		logs.enterInfoLog("click on the testimonials option");
		exReport.enterPassLog("click on the testimonial option");
		webDriver.clickElement(driver,HomepageUi.test);
		 //webDriver.switchTab(driver, 1);	
		
	}
}
