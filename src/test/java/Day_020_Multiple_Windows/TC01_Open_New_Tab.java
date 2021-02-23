package Day_020_Multiple_Windows;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TC01_Open_New_Tab {
	
	
	WebDriver driver;
	
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("https://opensource-demo.orangehrmlive.com/");

	//below line opens new tab
	((JavascriptExecutor)driver).executeScript("window.open()");
	
	//strore all the open windows in ArrayList string
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	
//	//Switch to New tab
driver.switchTo().window(tabs.get(1));
	driver.get("http://google.com");
//	
//
//	
//	//back to MainWindow
	driver.switchTo().window(tabs.get(0));
//
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	 TakesScreenshot scrShot1 =((TakesScreenshot)driver);
	 File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(SrcFile1, new File("C:\\HTML Report\\test-output\\Test11112333\\ScreenShot1.png"));

	 
	//driver.TakeScreenShotAuto(driver,"C:\\\\HTML Report\\\\test-output\\\\Test11112333\\\\ScreenShot1.png");
	//C:\\HTML Report\\test-output\\Test11112333\\ScreenShot1.png
	
//	takeSnapShot(driver, "C:\\HTML Report\\test-output\\Test11112333\\ScreenShot1.png") ;
	
	driver.findElement(By.id("btnLogin")).click();

	

	
	
		
	}
	

	
	

}
