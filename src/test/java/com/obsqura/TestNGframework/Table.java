package com.obsqura.TestNGframework;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base 
{
	@Test
	public void table()
	{
		List <String> nameList = new ArrayList<>();
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement tableLocate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List <WebElement> tableHeader = tableLocate.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
		int rowSize = tableHeader.size();
		for(WebElement namesOfTableHeader : tableHeader)
		{
			String tableHeaderText = namesOfTableHeader.getText();
		}
		List <WebElement> tableColumn = tableLocate.findElements(By.xpath("//tr[@class]"));
		int columnSize = tableColumn.size();
		WebElement findName = driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
		boolean nameFind = findName.isDisplayed();
		for(WebElement namesOfRow : tableColumn)
		{
			String tableRowValueText = namesOfRow.getText();
			nameList.add(tableRowValueText);
		}
		
		
		assertTrue(nameFind, "Name is not in the table");
	}


}
