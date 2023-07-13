package com.obsqura.TestNGframework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base
{
	@Test
	public void checkBoxDemo()
	{
		//driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		MenuOptions menuOptions = new MenuOptions();
		menuOptions.menuSelection("Checkbox Demo");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		boolean isCheckBoxisSelected = checkBox.isSelected();
		assertTrue(isCheckBoxisSelected, "Check box is not checked");
	}
	
	@Test
	public void verifyMultipleCheckBoxDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		boolean isDisplayedSelectAllButton = selectAllButton.isDisplayed();

	    WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean checkBoxisOneSelected = checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean checkBoxTwoisSelected = checkBoxTwo.isSelected();
		WebElement checkBoxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean checkBoxThreeisSelected = checkBoxThree.isSelected();
		WebElement checkBoxFour = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean checkBoxFourisSelected = checkBoxFour.isSelected();
		
		assertTrue(checkBoxisOneSelected,"Check box one is not selected");
		assertTrue(checkBoxTwoisSelected,"Check box two is not selected");
		assertTrue(checkBoxThreeisSelected,"Check box three is not selected");
		assertTrue(checkBoxFourisSelected,"Check box four is not selected");
		assertTrue(isDisplayedSelectAllButton, "Select all button is not displayed");
	}
	
	@Test
	public void verifyUnselectMultipleCheckBox()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		WebElement  unSelectAll = driver.findElement(By.xpath("//input[@value='Unselect All']"));
		unSelectAll.click();
		boolean isUnSelectAllDisplayed = unSelectAll.isDisplayed();
		
		WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean checkBoxOneisSelected = checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean checkBoxTwoisSelected = checkBoxTwo.isSelected();
		WebElement checkBoxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean checkBoxThreeisSelected = checkBoxThree.isSelected();
		WebElement checkBoxFour = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean checkBoxFourisSelected = checkBoxFour.isSelected();
		
		assertTrue(isUnSelectAllDisplayed, "Unselect all is displayed");
		assertFalse(checkBoxOneisSelected, "Check box one is selected");
		assertFalse(checkBoxTwoisSelected, "Check box two is selected");
		assertFalse(checkBoxThreeisSelected, "Check box three is selected");
		assertFalse(checkBoxFourisSelected, "Check box four is selected");	
	}
	
}