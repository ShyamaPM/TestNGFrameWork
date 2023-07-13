package com.obsqura.TestNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MenuOptions extends Base
{
	@Test
	public void menuSelection(String menuCategory)
	{
		List <WebElement> menu = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
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
