package com.amazon.prod;

import org.openqa.selenium.By;

public class AmazonSearch extends BaseTest{

	public static void main(String[] args) throws Exception {
		init();
		openBrowser("chromebrowser");
		navigateUrl("amazonurl");
		selectOption("amazondropdown_id","amazondropvalue");
		enterText("amazonsearctext_name","amazonsearchtext");
		click("amazonsearchbutton_xpath");
		
	}

	

}
