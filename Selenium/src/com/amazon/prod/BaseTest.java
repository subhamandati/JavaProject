package com.amazon.prod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties p;
	public static FileInputStream fis;
	private static Properties mainprop;
	private static Properties subprop;
	
	
	public static void init() throws Exception 
	{
		fis = new FileInputStream(projectpath+"//data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectpath+"//environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		String environment = mainprop.getProperty("env");
		System.out.println(environment);
		
		fis= new FileInputStream(projectpath+"//"+environment+".properties");
		subprop = new Properties();
		subprop.load(fis);
		
		
		
		
	}
	public static void openBrowser(String browser)
	{
		
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Subhashini\\drivers\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			options.addArguments("user-data-dir=C:\\Users\\Dell\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			
			
			driver.manage().window().maximize();
		}
		
		else if(p.getProperty(browser).equals("firefox"))
		{	
			System.setProperty("webdriver.gecko.driver", "E:\\Subhashini\\drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			ProfilesIni p =new ProfilesIni();
			FirefoxProfile profile = p.getProfile("SubhashiniFFProfile");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(profile);
			
			driver = new FirefoxDriver(options);
			
			driver.manage().window().maximize();
		}
	}
	
	public static void navigateUrl(String url) {
		driver.get(subprop.getProperty(url));
	} 
	
	public static void click(String locatorkey)
	{
		
		getElement(locatorkey).click();
	}

	
	public static void enterText(String locatorkey, String value) {
		getElement(locatorkey).sendKeys(mainprop.getProperty(value));
	}

	public static void selectOption(String locatorkey, String value) {
		getElement(locatorkey).sendKeys(mainprop.getProperty(value));
	}
	
	public static WebElement getElement(String locatorkey) {
		WebElement element= null;
		if(locatorkey.endsWith("_id")){
			element = driver.findElement(By.id(mainprop.getProperty(locatorkey)));
		}else if(locatorkey.endsWith("_name")){
			element = driver.findElement(By.name(mainprop.getProperty(locatorkey)));
			
		}else if(locatorkey.endsWith("_classname")){
			element = driver.findElement(By.className(mainprop.getProperty(locatorkey)));
			
		}else if(locatorkey.endsWith("xpath")){
			element = driver.findElement(By.xpath(mainprop.getProperty(locatorkey)));
			
		}else if(locatorkey.endsWith("css")){
			element = driver.findElement(By.cssSelector(mainprop.getProperty(locatorkey)));
			
		}else if(locatorkey.endsWith("_textlink")){
			element = driver.findElement(By.linkText(mainprop.getProperty(locatorkey)));
			
		}else if(locatorkey.endsWith("_partialtextlink")){
			element = driver.findElement(By.partialLinkText(mainprop.getProperty(locatorkey)));
			
		}
		return element;
		
	}
}

