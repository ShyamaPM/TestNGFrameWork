package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckTimeOrder extends Base
{
	@Test
	public void locateByClass() //5891ms
	{
		WebElement showMessaegButton=driver.findElement(By.className("form-control"));
	}
	
	@Test
	public void locateById() //5832ms
	{
		WebElement showMessageButton= driver.findElement(By.id("single-input-field"));
	}
	
	@Test
	public void locateByCSSSelector() //6138ms
	{
		WebElement showMessageButton= driver.findElement(By.cssSelector("input#single-input-field"));
	}
	
	@Test
	public void locatByXPath() //5968ms
	{
		WebElement showMessageButton= driver.findElement(By.xpath("//input[@id='single-input-field']"));
	}
	

}
