package com.obsqura.TestNGframework;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base 
{
	@Test
	public void table()
	{
		String name = "Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement tableLocate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List <WebElement> tableHeader = tableLocate.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
		int rowSize = tableHeader.size();
		for(WebElement namesOfTableHeader : tableHeader)
		{
			String tableHeaderText = namesOfTableHeader.getText();
		}
		List <WebElement> tableCoulmn = tableLocate.findElements(By.xpath("//tr[@class]"));
		int columnSize = tableCoulmn.size();
		//WebElement findName = driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
		//boolean nameFind = findName.isDisplayed();
		for(WebElement namesOfRow : tableCoulmn)
		{
			String tableRowValueText = namesOfRow.getText();
			
		}
		//assertTrue(nameFind, "Ashton Cox is not in the table");
	}

}
