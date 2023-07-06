package com.obsqura.TestNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base
{
	@Test
	public void webElementCommand()
	{
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys("Hello");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[contains(text(),' Message')]"));
		String yourMessageText = yourMessage.getText();
		String yourMessageTag = yourMessage.getTagName();
		String showMessageButtonClassName = showMessageButton.getAttribute("class");
		singleInputField.clear();
		boolean isShowMessageButtonDisplayed=showMessageButton.isDisplayed();
		boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();
		String backGroundColorOfShowMessageButton=showMessageButton.getCssValue("background-color");
		
	}
	

}
