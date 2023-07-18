package Revise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice 
{
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\OneDrive\\Documents\\Eclipse_Workspace\\obsquraautomation\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	
	@Test
	public void idDisplayed()
	{
		String expectedResult = "Show Message";
		WebElement enterMessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessage.sendKeys("Test data");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		String attributeOfShowMessageButton = showMessageButton.getAttribute("class");
		String actualResult = showMessageButton.getText();
		WebElement showMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String getText = showMessageText.getText();
		boolean isShowMessageButtonDisplayed=showMessageButton.isDisplayed();
		boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();
		int xAxisValue = showMessageButton.getLocation().getX();
		int yAxisValue = showMessageButton.getLocation().getY();
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		int getTotalYAxis = getTotalButton.getLocation().getY();
		
		if(yAxisValue<getTotalYAxis)
		{
			System.out.println("Show Message button displayed above the the GetTotal button");
		}else
		{
			System.out.println("Show Message button displayed below the the GetTotal button");
		}
		
		
		assertEquals(actualResult, expectedResult, "Expected and actual result are not matching");
		assertTrue(isShowMessageButtonDisplayed, "Show message button is not displayed");
		assertTrue(isShowMessageButtonEnabled, "Show message button is not enabled");	
	}
	
	@Test
	public void checkBoxDemo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckBox.click();
		boolean singleCheckBoxIsSelected = singleCheckBox.isSelected();
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String getSuccessMessageText = successMessage.getText();
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		WebElement unSelectAll = driver.findElement(By.xpath("//input[@value='Unselect All']"));
		unSelectAll.click();
		assertTrue(singleCheckBoxIsSelected, "Check box is not selected");
	}
	
	@Test
	public void radioButton()
	{
		String expectedResult = "Radio button 'Female' is checked";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValueButton.click();
		
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String getTextofSuccessMessage = successMessage.getText();
		assertEquals(getTextofSuccessMessage, expectedResult, "Not match");
	}
	
	@Test
	public void dropdownBox()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement colorDropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		String getTextColorDropDOwn = colorDropDown.getText();
		Select select = new Select(colorDropDown);
		select.selectByValue("Yellow");
		select.selectByVisibleText("Red");
		select.selectByIndex(3);
		
		List <WebElement> totalNumber = select.getOptions();
		int getSize = totalNumber.size();
		
		WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select1 = new Select(multiSelect);
		boolean multipleSelect = select1.isMultiple();
		select1.selectByIndex(2);
		select1.selectByValue("Red");
		
		List <WebElement> multiSize = select1.getOptions();
		int getSize1 = multiSize.size();			
	}
	
	@Test
	public void tabel()
	{
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List <WebElement> columnName = table.findElements(By.xpath("//th[@class='th-sm sorting_disabled']"));
		for(WebElement columnTitle: columnName)
		{
			String getTitle = columnTitle.getText();
			
		}
	}
	
	@AfterMethod
	public void browserQuit()
	{
		driver.quit();
	}
	
	
	

}
