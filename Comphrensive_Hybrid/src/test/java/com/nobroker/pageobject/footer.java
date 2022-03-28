package com.nobroker.pageobject;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class footer {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	
	public CaptureScreeshot screenshot;
	public footer(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(EmiCalculator.class);	
	}
	public void footoperation() throws InterruptedException {
		
		webDriver.clickElement(driver, HomepageUi.aboutus);
		//webDriver.switchTab(driver, 1);	
		Thread.sleep(1000);
		logs.enterInfoLog("select the option our blogs");
		exReport.enterPassLog("select the option our blogs");
		webDriver.clickElement(driver,HomepageUi.blog);
		Thread.sleep(1000);
		webDriver.switchTab(driver, 1);	
		logs.enterInfoLog("print the cureent time and date");
		exReport.enterPassLog("print cureent time and date ");
		
	}

}
