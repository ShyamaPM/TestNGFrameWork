package com.obsqura.TestNGframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Base
{
	@Test
	public void fileUploadUsingAutoIT() throws IOException, InterruptedException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPDFFileButton = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPDFFileButton.click();
		Runtime.getRuntime().exec("C:\\Users\\abhij\\OneDrive\\Documents\\AutoIt\\FileUpload.exe");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		Thread.sleep(2000);
		
	}

}
