 package Day_39_Date_Time_Picker;
 
 import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
 import java.net.MalformedURLException;
 import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import CommonUtil.TestBrowser;

 public class Date_Picker {

	 static WebDriver driver;

		@Test
		public void Test2() throws Exception {
		
			driver = TestBrowser.OpenChromeBrowser();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String TestURL = "https://opensource-demo.orangehrmlive.com/";
			driver.get(TestURL);
			
			
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
			
			findElement(By.linkText("Leave")).click();
			findElement(By.linkText("Leave List")).click();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//	Select listbox5 =new Select(driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[1]")));
		//	 listbox5.selectByVisibleText("Mar");
			//*[@id="ui-datepicker-div"]/div/div/select[1]
			
			Select listbox5 =new Select(driver.findElement(By.className("ui-datepicker-month")));
		  listbox5.selectByVisibleText("Mar");
		 	 
		 	Select listbox6 =new Select(driver.findElement(By.className("ui-datepicker-year")));
		 	 listbox6.selectByVisibleText("2019");
		 	 
			
		//	String str2="//*[contains(@href,'#') and text()='" + 23 +"']";
		 	Actions act1 = new Actions(driver);
		 	WebElement date2=findElement(By.xpath("//*[contains(@href,'#') and text()='" + 27+"']"));
		 //	WebElement date2=findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[1]/td[5]/a='" + 1 +"']"));

		 	act1.moveToElement(date2).click().build().perform();
		 		
		}
		
		
		

	public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}



 }