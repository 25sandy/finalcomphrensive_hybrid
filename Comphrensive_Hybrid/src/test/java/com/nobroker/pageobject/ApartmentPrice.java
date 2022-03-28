package com.nobroker.pageobject;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.HomepageUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class ApartmentPrice {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public ApartmentPrice(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(ApartmentPrice.class);	
	}
	public void getprice() throws InterruptedException {
		logs.enterInfoLog("click on newapartment option" );
		exReport.enterPassLog("click on new apartment option");
		
		webDriver.clickElement(driver, HomepageUi.bhk1);
		Thread.sleep(1000);
		 webDriver.switchTab(driver, 1);
		 logs.enterInfoLog("select the apartment option 1 BHK ");
		 exReport.enterPassLog("select the apartment option 1BHK");
		webDriver.clickElement(driver, HomepageUi.invidual);
		//System.out.println("--------");
		Thread.sleep(1000);
		
		
	}
}
