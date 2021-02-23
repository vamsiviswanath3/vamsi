package Dec_prac1;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*import org.openqa.selenium.WebDriver;
*/
public class NewTest_Dec28 {
	WebDriver driver;
	
	@DataProvider(name = "TC01_Job_Titles")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_job_Titles.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
	
	 /*@DataProvider(name = "TC01_OrangeHRM")
	  public static Object[][] test3() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian67","TestEngineer","doing a test","have done that" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian68","test automation eng","done","is doing " }, 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian69","selenium eng","started","have done" }
	        	};
	  }*/
	
	
	
  @Test(dataProvider="TC01_Job_Titles")
  public void f( String url,String UserName,String Password,String JobTitle,String Descr,String Note) throws Exception {
	  
		//OpenChromeBrowser
	//	driver = TestBrowser.OpenChromeBrowser();
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 	driver =new ChromeDriver();
	 	driver.manage().window().maximize() ;	
	 	
		driver.get(url);
		//SendKeys
		 findElement(By.id("txtUsername")).sendKeys(UserName);
		 findElement(By.id("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		
			  
		 	
		 
		
		  findElement(By.linkText("Admin")).click();
		  findElement(By.linkText("Job")).click();
		  findElement(By.id("menu_admin_viewJobTitleList")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle);
		  findElement(By.id("jobTitle_jobDescription")).sendKeys(Descr);
		  findElement(By.id("jobTitle_note")).sendKeys(Note);
		  findElement(By.id("btnSave")).click();
		  

		/*  findElement(By.linkText("Nationalities")).click();
		  findElement(By.name("btnAdd")).click();
		  findElement(By.id("nationality_name")).sendKeys(Nationality);
		  findElement(By.id("btnSave")).click();*/


	  
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
