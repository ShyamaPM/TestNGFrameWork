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
		String showMessageButtonText=showMessageButton.getText();
		WebElement yourMessage = driver.findElement(By.xpath("//div[contains(text(),' Message')]"));
		String yourMessageText = yourMessage.getText();
		String yourMessageTag = yourMessage.getTagName();
		String showMessageButtonClassName = showMessageButton.getAttribute("class");
		singleInputField.clear();
		boolean isShowMessageButtonDisplayed=showMessageButton.isDisplayed();
		boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();
		String backGroundColorOfShowMessageButton=showMessageButton.getCssValue("background-color");
		String borderColorofShowMessageButton = showMessageButton.getCssValue("border-color");
		String fontColorofShowMessageButton = showMessageButton.getCssValue("color");
		String fontWeightofShowMessageButton = showMessageButton.getCssValue("font-weight");
	}
	
	@Test
	public void verifyTwoInputField()
	{
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys("10");
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys("20");
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		String getTotalButtonText=getTotalButton.getText();
		String getTotalButtonClassName=getTotalButton.getAttribute("class");
		String getTotalButtonId=getTotalButton.getAttribute("id");
		String getTotalButtonTag = getTotalButton.getTagName();
		WebElement totalAPlusBMessage = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalAPlusBMessageText=totalAPlusBMessage.getText();
		String totalAPlusBMessageTag=totalAPlusBMessage.getTagName();
		String borderColorofGetTotalButton = getTotalButton.getCssValue("border-color");
		String fontColorofGetTotalButton = getTotalButton.getCssValue("color");
		String fontWeightofGetTotalButton = getTotalButton.getCssValue("font-weight");
	}
	

}
