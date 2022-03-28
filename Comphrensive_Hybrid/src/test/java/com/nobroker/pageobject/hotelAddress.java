package com.nobroker.pageobject;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.hotelAddressUi;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class hotelAddress {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();
	
	public CaptureScreeshot screenshot;

	public hotelAddress(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(hotelAddress.class);	
	}
	
	public void getAddress() throws IOException, InterruptedException {
		//click on search bar
		logs.enterInfoLog("click on the search icon");
		exReport.enterPassLog("click on search icon");
		webDriver.clickElement(driver, hotelAddressUi.input);
		webDriver.implicitWait(driver, 1000);
		logs.enterInfoLog("enter the place to fetch the address");
		exReport.enterPassLog("enter the place to fetch the address");
		webDriver.clickElement(driver, hotelAddressUi.input);
		Thread.sleep(2000);
		webDriver.sendText(driver,hotelAddressUi.input, "gateway");
		Thread.sleep(2000);
		
		webDriver.sendKeys(driver,hotelAddressUi.input,Keys.ARROW_DOWN);
		Thread.sleep(1000);
		webDriver.clickElement(driver,hotelAddressUi.input);
		//click on search
		Thread.sleep(2000);
		webDriver.sendKeys(driver,hotelAddressUi.input,Keys.ENTER);
		Thread.sleep(1000);
		webDriver.clickElement(driver, hotelAddressUi.search);
	      //get the address
		
	}
		
	
		
		
		
	}
	


