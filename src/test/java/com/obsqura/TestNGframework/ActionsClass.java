package com.obsqura.TestNGframework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base
{
	@Test
	public void actionsClass()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragableNZeroOne = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action = new Actions(driver);
		action.moveToElement(dragableNZeroOne).click();
		action.moveToElement(dragableNZeroOne).build().perform();
		action.doubleClick(dragableNZeroOne).perform();
		action.contextClick(dragableNZeroOne).perform();
		WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(dragableNZeroOne, destination).build().perform();
	}

}
