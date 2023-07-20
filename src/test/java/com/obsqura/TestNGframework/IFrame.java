package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrame extends Base {
	
	@Test
	public void verifyiFrame()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		int size = driver.findElements(By.tagName("iframe")).size(); // how many iframe tags are present
		//driver.switchTo().frame(2); //by giving index
		driver.switchTo().frame("a077aa5e"); //using id
		WebElement iFrameImage = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		iFrameImage.click();		
	}
}
