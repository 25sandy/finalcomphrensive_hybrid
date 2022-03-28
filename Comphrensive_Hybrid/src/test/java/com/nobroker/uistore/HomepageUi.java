package com.nobroker.uistore;

import org.openqa.selenium.By;

public class HomepageUi {
	//ApartmentPrice
	public static By bhk1=By.xpath("//a[@href='/1bhk-flats-for-sale-in-gurgaon_gurgaon']");
	public static By invidual=By.id("apartment");
	//public static By status=By.id("prop_status_1");
	public static By aprice=By.id("minDeposit");
	
	//new_project
	//public static By np=By.xpath("(//div[@class='heading-6 nb__3YrHu'])[6]");
	public static By np=By.id("builderHomeTile");
	public static By chennai=By.xpath("//img[@src='https://assets.nobroker.in/nb-new/public/Common/chennai.png']");
	public static By search=By.xpath("(//div[@class='text-18 font-semibold'])[0]");
	public static By details=By.id("navheaderContainer");
	//footer
	public static By aboutus=By.xpath("//div[@class='nb__3N2G9 nb__2WC_s']");
	public static By blog=By.xpath("(//div[@class='nb__o507g'])[7]");
	public static By time=By.xpath("//div[@class='col-md-6 col-xs-12 col-sm-6']");
	//payrent
	public static By payrent=By.xpath("//div[@class='nb__3BKJW']");
	public static By data=By.xpath("//h1[@class='nb__UjvTW']");
	//testmonial
	public static By test=By.xpath("//a[@href='/testimonials/']");
	public static By rating=By.id("about-nobroker-home");
	
}
