package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends Base
{
	@Test
	public void alertsAccept()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeGreen = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMeGreen.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void alertsDismiss()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeYellow = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickMeYellow.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();	
	}
	
	@Test
	public void clickForPrompt()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickForPromptBoxButton =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickForPromptBoxButton.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Shyama P M");
		driver.switchTo().alert().accept();
	}

}
