package Dec_prac1;
import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*import org.openqa.selenium.WebDriver;
*/
public class NewTest_DataProvider1 {
	WebDriver driver;
	
	 @DataProvider(name = "OrangeHRM")
	  public static Object[][] test3() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian67" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian68" }, 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian69" }
	        	};
	  }
	
	
	
  @Test(dataProvider="OrangeHRM")
  public void f( String url,String UserName,String Password,String Nationality) throws Exception {
	  
		//OpenChromeBrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		driver.get(url);
		//SendKeys
		 findElement(By.id("txtUsername")).sendKeys(UserName);
		 findElement(By.id("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		
			  
		 	
		 
		
		  findElement(By.linkText("Admin")).click();
		  findElement(By.linkText("Nationalities")).click();
		  findElement(By.name("btnAdd")).click();
		  findElement(By.id("nationality_name")).sendKeys(Nationality);
		  findElement(By.id("btnSave")).click();


	  
  }
  
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
}
