package com.obsqura.TestNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base
{
	@Test
	public void radioButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		boolean maleRadioButtonIsSelected = maleRadioButton.isSelected();
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleRadioButton.click();
		boolean femaleRadioButtonIsSelected = femaleRadioButton.isSelected();
		
		
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		boolean showSelectedValueButtonIsDisplayed = showSelectedValueButton.isDisplayed();
		
		assertTrue(maleRadioButtonIsSelected, "Male radio button is not selected");
		assertTrue(femaleRadioButtonIsSelected, "Female radio button is not selected");
		assertTrue(showSelectedValueButtonIsDisplayed, "Button is not displayed");
	}
	
	@Test
	public void verifyGroupRadioButtonsDemo()
	{
		String expectedResult = "Gender : Male"+"\n"+"Age group: 1 to 18";
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement patientsGender = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		patientsGender.click();
		boolean isSelectedPatientsGender = patientsGender.isSelected();
		
		WebElement patientsAgeGroup = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		patientsAgeGroup.click();
		boolean isSelectedPatientsAgeGroup = patientsAgeGroup.isSelected();
		
		WebElement getResultButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResultButton.click();
		boolean getResultButtonIsDisplayed = getResultButton.isDisplayed();
		
		WebElement getResultText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String textDataOfGetResult = getResultText.getText();
		
		assertTrue(isSelectedPatientsGender, "Patients gender not selected");
		assertTrue(isSelectedPatientsAgeGroup, "Patients age group is not selected");
		assertTrue(getResultButtonIsDisplayed, "Get result button is not displayed");
		assertEquals(textDataOfGetResult, expectedResult, "Expected and actual result are not same");
		
		
	}

}
