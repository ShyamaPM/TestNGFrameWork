package com.obsqura.TestNGframework;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Table extends Base 
{
	@Test
	public void table()
	{
		List <String> nameList = new ArrayList<>();
		String expectedResult = "Ashton Cox";
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement tableLocate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		wait.until(ExpectedConditions.visibilityOf(tableLocate));
		List <WebElement> tableHeader = tableLocate.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(tableHeader));
		int rowSize = tableHeader.size();
		for(WebElement namesOfTableHeader : tableHeader)
		{
			String tableHeaderText = namesOfTableHeader.getText();
		}
		List <WebElement> tableColumn = tableLocate.findElements(By.xpath("//tr[@class]"));
		int columnSize = tableColumn.size();
		WebElement findName = driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
		wait.until(ExpectedConditions.visibilityOf(findName));
		boolean nameFind = findName.isDisplayed();
		for(WebElement namesOfRow : tableColumn)
		{
			String tableRowValueText = namesOfRow.getText();
			nameList.add(tableRowValueText);
			if(tableRowValueText.contains(expectedResult))
			{
				System.out.println("Name exists in table");
				break;
			} else
			{
				System.out.println("Name not exists in table");
			}
		}
		
		assertTrue(nameFind, "Name is not in the table");
	}


}
