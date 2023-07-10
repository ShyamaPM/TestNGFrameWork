package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends Base
{
	@Test
	public void verifySingleInputFieldWhenEnterDataOnTextFieldAndClcikOnShowMessageButton()
	{
		String textFieldInput = "Hello";
		String expectedMessage = "Your Message : "+textFieldInput;
		WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(textFieldInput);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		String showMessageButtonText=showMessageButton.getText();
		WebElement yourMessage = driver.findElement(By.xpath("//div[contains(text(),' Message')]"));
		String yourMessageText = yourMessage.getText();
		assertEquals(expectedMessage,yourMessageText,"Your message is not "+expectedMessage);
	}
	@Test
	public void verifyTwoInputFieldWhenValueEnterOnTextFieldAndClcikOnGetTotalButton()
	{
		int textEnterValueA = 10;
		int textEnterValueB = 20;
		String expectedTotalValueOfAandB = "Total A + B : "+(textEnterValueA+textEnterValueB);
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys(String.valueOf(textEnterValueA));
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys(String.valueOf(textEnterValueB));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		String getTotalButtonText=getTotalButton.getText();
		WebElement totalAPlusBMessage = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalAPlusBMessageText=totalAPlusBMessage.getText();
		assertEquals(expectedTotalValueOfAandB,totalAPlusBMessageText,"Total value is not matching with "+expectedTotalValueOfAandB);
	}
	
	@Test
	public void verifyTheColorOfShowMessageButton()
	{
		String expectedColor = "rgba(255, 255, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonColor = showMessageButton.getCssValue("color");
		assertEquals(showMessageButtonColor, expectedColor,"The color is not same as "+expectedColor);
	}
	
	@Test
	public void verifyShowMessageButtonText()
	{
		String expectedTextofShowMessageButton = "Show Message";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String getTextofShowMessageButton = showMessageButton.getText();
		assertEquals(getTextofShowMessageButton, expectedTextofShowMessageButton,"The text of show message button is not matching with" +expectedTextofShowMessageButton);
	}
	
	@Test
	public void verifyTheFontWeightofShowMessageButton()
	{
		String expectedFontWeightofShowMessageButton = "400";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontWeightofShowMessageButton = showMessageButton.getCssValue("font-weight");
		assertEquals(fontWeightofShowMessageButton, expectedFontWeightofShowMessageButton,"The font weight is not matching with "+expectedFontWeightofShowMessageButton);
	}
	
	@Test
	public void verifyBackgroundColorofShowMessageButton()
	{
		String expectedBackgroundColor= "rgba(0, 123, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgrondColorofShowMessageButton = showMessageButton.getCssValue("background-color");
		assertEquals(backgrondColorofShowMessageButton, expectedBackgroundColor, "The background color does not match with "+expectedBackgroundColor);
	}
	
	@Test
	public void assertTrueSample()
	{
		String expectedValue = "ABC";
		String actualValue = "ABC";
		boolean flag = false;
		if(expectedValue.equals(actualValue))
		{
			flag = true;
		}
		assertTrue(flag,"Expected and actual values are not same");
	}
	
	@Test
	public void verifyShowMessageButtonisDisplayed()
	{
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
		assertTrue(isShowMessageButtonDisplayed, "Show message button is not displayed");
	}
	
	@Test
	public void verifyGetTotalButtonIsEnabled()
	{
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotalButtonEnabled = getTotalButton.isEnabled();	
		assertTrue(isGetTotalButtonEnabled, "Get total button is not enabled");
		
	}
	@Test
	public void assertFalseSample()
	{
		boolean flag = false;
		assertFalse(flag, "Flag is true");
	}
	
	@Test
	public void asserNullSample()
	{
		String value = null;
		assertNull(value, "Value is not null");
	}
	
	@Test
	public void asserNotNullSample()
	{
		String value = "ABC";
		assertNotNull(value, "Value is null");
	}
	@Test
	public void softAssert()
	{
		String value1 = "123";
		String value2 = "ABC";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertNull(value1, "Value is not null");
		softAssert.assertNotNull(value2, "Value is null");
		softAssert.assertAll();
		
	}

}
