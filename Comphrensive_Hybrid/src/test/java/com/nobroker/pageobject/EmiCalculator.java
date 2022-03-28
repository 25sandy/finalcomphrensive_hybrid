package com.nobroker.pageobject;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.EmiCalculatorUi;
import com.nobroker.utility.CaptureScreeshot;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class EmiCalculator {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	
	public CaptureScreeshot screenshot;

	public EmiCalculator(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(EmiCalculator.class);	
	}
	public void emiCalci() throws IOException {
		webDriver.clickElement(driver, EmiCalculatorUi.emi);
		webDriver.switchTab(driver, 1);	
		//enter total amount
		logs.enterInfoLog("enter the total loan ammount 120000");
		exReport.enterPassLog("enter the total loan ammount");
		webDriver.clickElement(driver, EmiCalculatorUi.amount);
		webDriver.clearText(driver, EmiCalculatorUi.amount);
		webDriver.implicitWait(driver, 10);
		webDriver.sendText(driver, EmiCalculatorUi.amount, "120000");
		webDriver.sendKeys(driver, EmiCalculatorUi.amount, Keys.ENTER);
		logs.enterInfoLog("enter the rate of interset  5%");
		exReport.enterPassLog("enter the rate of interset");
		//enter the interset
		webDriver.clearText(driver, EmiCalculatorUi.rate);
		webDriver.sendText(driver, EmiCalculatorUi.rate, "5");
		webDriver.sendKeys(driver, EmiCalculatorUi.rate, Keys.ENTER);
		logs.enterInfoLog("enter the loan tenture 3 years");
		exReport.enterPassLog("enter the loan tenture");
		//enter the year
		webDriver.clearText(driver, EmiCalculatorUi.year);
		webDriver.sendText(driver, EmiCalculatorUi.year, "3");
		//click enter
		webDriver.sendKeys(driver, EmiCalculatorUi.year, Keys.ENTER);
		//print the monthly emi
	
		

	}
	

}
