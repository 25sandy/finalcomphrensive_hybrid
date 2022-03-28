package com.nobroker.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import com.nobroker.reusable.WebDriverHelper;

public class BaseClass {

	static public WebDriver driver;
	static public WebDriverHelper webDriver;
	public ExcelData excel;
	public String browser;
public ExtentReport exReport;
	public Logs logs;
	public CaptureScreeshot screenshot;

	@BeforeTest
	public void required() throws IOException {
		webDriver = new WebDriverHelper();
		excel = new ExcelData();
		logs = new Logs();
		exReport = new ExtentReport();

	}

	@BeforeClass
	public void driverSetUp() throws IOException {
		// webDriver = new WebDriverHelper();
		if (ConfigReader.getBrowser().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (ConfigReader.getBrowser().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webDriver.implicitWait(driver, 10);
		exReport=new ExtentReport();
		
	}

	@AfterTest
	public void excelsetup() {
		exReport.flush();
	}

	@AfterClass
	public void driverExit() throws IOException {

		driver.quit();
	}
}
