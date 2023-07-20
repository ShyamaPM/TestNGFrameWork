package com.obsqura.TestNGframework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUpload extends Base
{
	@Test
	public void fileUploadUsingAutoIT() throws IOException, InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPDFFileButton = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPDFFileButton.click();
		Runtime.getRuntime().exec("C:\\Users\\abhij\\OneDrive\\Documents\\AutoIt\\FileUpload.exe");
		
		WebElement processTaskButton = driver.findElement(By.xpath("//button[@id='processTask']"));
		wait.until(ExpectedConditions.elementToBeClickable(processTaskButton));	
		processTaskButton.click();
	}
	
	@Test
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\abhij\\OneDrive\\Desktop\\SELENIUM.pdf");
	}
	
	@Test
	public void fileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPDFFileButton = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPDFFileButton.click();
		// file path passed as parameter to StringSelection
		StringSelection ss = new StringSelection("C:\\Users\\abhij\\OneDrive\\Desktop\\SELENIUM.pdf");
		//Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//Robot object creation
		Robot robot = new Robot();
		robot.delay(250);
		//pressing enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		//pressing ctrl+v
	    robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//releasing ctrl+v
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//pressing enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		//releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
