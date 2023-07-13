package com.obsqura.TestNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\OneDrive\\Documents\\Eclipse_Workspace\\7rmartSuperMarket\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	
	@AfterMethod
	public void browserCloseorQuit()
	{
		driver.quit();
	}
	
	
	

}
