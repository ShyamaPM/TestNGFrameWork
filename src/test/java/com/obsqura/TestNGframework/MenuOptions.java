package com.obsqura.TestNGframework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class MenuOptions extends Base
{
	@Test
	public void menuSelection(String menuCategory)
	{
		Wait <WebDriver> fluentWait = new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class); 
		List <WebElement> menu = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		fluentWait.until(ExpectedConditions.visibilityOfAllElements(menu));
		for(WebElement menuOption:menu)
		{
			String menuText= menuOption.getText();
			if(menuText.equals(menuCategory))
			{
				menuOption.click();
				break;
			}
		}
	}
	

}
