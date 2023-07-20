package com.obsqura.TestNGframework;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Popup  extends Base
{
	@Test
	public void verifyTheOpenWindo()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement likeUsOnFacebook = driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));
		likeUsOnFacebook.click();
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    driver.findElement(By.xpath("(//div[contains(@class,'x1e0frkt')])[3]")).click();
                    driver.close();    
            }
        }
		driver.switchTo().window(MainWindow);
	}

}

