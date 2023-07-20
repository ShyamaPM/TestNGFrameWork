package com.obsqura.TestNGframework;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class DropDown extends Base
{
	@Test
	public void dropDownUsingSelectClass()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Red");
		select.selectByValue("Yellow");
		select.selectByIndex(3);
		
		List <WebElement> options = select.getOptions(); 
		int size = options.size();
		
		WebElement multipleDropdown = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	    Select select2 = new Select(multipleDropdown);
	    boolean isMultipleSelect =select2.isMultiple();
	    select2.selectByVisibleText("Red");
		select2.selectByValue("Yellow");
	    
	}
	
	@Test
	public void selectingLanguageFromSeleniumSite()
	{
		
		String languageName = "Português (Brasileiro)";
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		driver.navigate().to("https://www.selenium.dev/");
		List <WebElement> languages = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='dropdown']//child::a"));
		fluentWait.until(ExpectedConditions.elementToBeClickable(dropDown));
		dropDown.click();
		for(WebElement languageList: languages)
		{
			String menuText = languageList.getText();
			if(menuText.equals(languageName))
			{
				languageList.click();
				break;
			}
		}
		
	}
	
	@Test
	public void selectingAboutDropDownValue()
	{
		String aboutName= "Structure and Governance";
		driver.navigate().to("https://www.selenium.dev/");
		List <WebElement> about = driver.findElements(By.xpath("//div[@class='dropdown-menu']//a"));
		WebElement dropDownValue = driver.findElement(By.xpath("//a[@id='navbarDropdown']"));
		dropDownValue.click();
		for(WebElement aboutDropDown: about)
		{
			String menuText = aboutDropDown.getText();
			if(menuText.equals(aboutName))
			{
				aboutDropDown.click();
				break;
			}
		}
	}

}
