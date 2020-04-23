package com.amazon.prod;

public class AmazonRegister extends BaseTest {
	
	public static void main(String[] args) throws Exception {
		init();
		openBrowser("firefoxbrowser");
		navigateUrl("icicibank");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().deleteAllCookies();
		Thread.sleep(400);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}

	
}
