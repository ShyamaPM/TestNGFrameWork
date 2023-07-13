package com.obsqura.TestNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base 
{
	@Test
	public void table()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement tableLocate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List <WebElement> tableHeader = tableLocate.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
		
	}

}
