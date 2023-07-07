package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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

}
