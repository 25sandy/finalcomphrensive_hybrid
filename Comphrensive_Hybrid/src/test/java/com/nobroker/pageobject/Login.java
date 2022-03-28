package com.nobroker.pageobject;

import org.openqa.selenium.WebDriver;

import com.nobroker.reusable.WebDriverHelper;
import com.nobroker.uistore.LoginUi;
import com.nobroker.utility.ExtentReport;
import com.nobroker.utility.Logs;

public class Login {

	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public Login(WebDriver driverr, WebDriverHelper webDriverr,ExtentReport exReport2) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReport2;
		logs.createLogger(Login.class);
		
	}
	public void clicklogin() throws InterruptedException {
		webDriver.clickElement(driver, LoginUi.login);
	}
	public void enterDetails(String string2, String string) {
		logs.enterInfoLog("Enter phone number and password");
		exReport.enterPassLog("Enter your registered phone number and password");
		//enter phone number
	    webDriver.clickElement(driver,LoginUi.phno);
	    webDriver.sendText(driver,LoginUi.phno,string2);
	    webDriver.implicitWait(driver, 1000);
	    //webDriver.sendText(driver,LoginUi.phno ,"8508577013",ENTER);
	    webDriver.clickElement(driver,LoginUi.off);
	    webDriver.implicitWait(driver, 1000);
	    logs.enterInfoLog("click on login using password");
	    exReport.enterPassLog("click on login using password");
	    webDriver.clickElement(driver,LoginUi.cpass);
	    webDriver.implicitWait(driver, 1000);
	    logs.enterInfoLog("enter the password");
	    exReport.enterPassLog("enter the password");
	    webDriver.clickElement(driver,LoginUi.pass);
	    webDriver.implicitWait(driver, 1000);
	    webDriver.sendText(driver,LoginUi.pass,string);
	    webDriver.implicitWait(driver, 1000);
	    logs.enterInfoLog("click on continue");
	    webDriver.clickElement(driver,LoginUi.conti);
	    logs.enterInfoLog("loggedin succesfully");
	    exReport.enterPassLog("loggedin succesfully");
	}
		
	}
	

