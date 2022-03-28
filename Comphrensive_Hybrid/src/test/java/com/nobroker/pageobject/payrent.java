package com.nobroker.pageobject;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class payrent {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public payrent(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(payrent.class);	
	}
	public void printrent() {
		webDriver.clickElement(driver, HomepageUi.payrent);
		logs.enterInfoLog("print the payable option");
		exReport.enterPassLog("print on the payable option");
		
	}
}
