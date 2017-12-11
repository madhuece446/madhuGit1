package com.icicibank.personalloan;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.get("https://www.flipkart.com/mens-footwear/sports-shoes/pr?sid=osp,cil,1cu&otracker=nmenu_sub_Men_0_Sports%20Shoes");
	
	
	driver.manage().window().fullscreen(); 							// to maximize the window
	driver.manage().deleteAllCookies(); 							// to delete all cookies
	driver.navigate().back(); 		                                // to navigate backward the web page
	Thread.sleep(4000);
	driver.navigate().forward(); 									// to navigate forward the web page
	driver.navigate().refresh(); 									// to refresh page
	
	String title = driver.getTitle();  								// gives the title for the page
	System.out.println(title);
	
	String url = driver.getCurrentUrl();  							// gives the URL of the page 
	System.out.println(url);
	
	driver.close();  												// closes the browser
}

}

//import org.openqa.selenium.firefox.GeckoDriverService;