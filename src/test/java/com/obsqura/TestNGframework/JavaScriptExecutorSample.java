package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorSample extends Base
{
	@Test
	public void javaScritptClick()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		js.executeScript("arguments[0].value='hello';", singleInputField);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();", showMessageButton);
	
	}

}
