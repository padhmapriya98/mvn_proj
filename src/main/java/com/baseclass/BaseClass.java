package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static WebDriver driver;


	
	public static WebDriver getBrowser(String name) {

		if (name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
		}
	
		return driver;
		
	}
    public static void geturl(String url) {

    	driver.get(url);
    	
	}
	public static void elementclick(WebElement element ) {

		element.click();
		
	}
	public static void inputvalue(WebElement element, String value) {

		element.sendKeys(value);
		
	}
   
    public static void close() {
      
    	driver.close();
    	
	}   
    
}