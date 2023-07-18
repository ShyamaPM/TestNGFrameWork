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
		action.moveToElement(dragableNZeroOne).click(); //  single  click
		action.moveToElement(dragableNZeroOne).build().perform(); // mouse hover
		action.doubleClick(dragableNZeroOne).perform(); // double click
		action.contextClick(dragableNZeroOne).perform(); // right button click
		WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(dragableNZeroOne, destination).build().perform();
		int xAxis = destination.getLocation().getX();
		int yAxis = destination.getLocation().getY();
		action.dragAndDropBy(dragableNZeroOne, xAxis, yAxis);
	}

}
