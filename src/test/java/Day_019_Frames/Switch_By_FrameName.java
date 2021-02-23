package Day_019_Frames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Switch_By_FrameName {
	
	//By Index  //driver.switchTo().frame(0); 	driver.switchTo().frame(1);
	//By Name or Id //	driver.switchTo().frame("iframe1");
	//By Web Element //driver.switchTo().frame("id of the element");
	
	static WebDriver driver;
	String ex="Kasi viswanath";
	

	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	//driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	//driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	driver.get("http://the-internet.herokuapp.com/");
	findElement(By.linkText("Frames")).click();
	findElement(By.linkText("iFrame")).click();
	//driver.get("http://the-internet.herokuapp.com/iframe");
	//driver.findElement(By.linkText("Nested Frames")).click();
	//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	//System.out.println("Numnber of frames: " + frames.size());
	//driver.switchTo().frame(findElement(By.id("GoogleContactForm")));
	driver.switchTo().frame(findElement(By.id("mce_0_ifr")));
	driver.findElement(By.xpath("//*[@id=\'tinymce\']/p[1]")).clear();
	driver.findElement(By.xpath("//*[@id=\'tinymce\']/p[1]")).sendKeys(ex);
	
	driver.switchTo().defaultContent();
	
	//WebElement E1=driver.findElement(By.xpath("//*[@id=\'tinymce\']/p[1]"));
	System.out.println(ex);
	//driver.findElement(By.id("mce_0"));
	//driver.findElement(By.id("mce_0")).clear();
	//driver.findElement(By.xpath("//*[@id='tinymce']/p")).sendKeys("we did");
	//WebElement e1=driver.findElement(By.xpath("//*[@id='content']/div/div/div[1]/div[2]"));
	
	//System.out.println(e1.getText());
	
	
	//*[@id="tinymce"]/p[1]
	
	//driver.switchTo().frame("frame-top");
	
	//driver.switchTo().frame("frame-middle");
	
	//System.out.println(driver.find)
//	driver.findElement(By.id("iFrame")).click();
//	driver.switchTo().frame("globalSqa");
//	findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/div[1]/a[1]/span")).click();
//	driver.switchTo().defaultContent();
//	driver.findElement(By.id("Open New Window")).click();
	
	//wrapper
	//driver.switchTo().frame(findElement(By.id("wrapper")));
	//https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame
	//driver.switchTo().frame("Google_ContactForm1234");
//	driver.switchTo().frame("Google_ContactForm1234");
//	findElement(By.name("firstname")).sendKeys("Selenium");
//	findElement(By.name("lastname")).sendKeys("Sudhakar");
//	findElement(By.name("subject1")).sendKeys("Selenium Sudhakar");
//	
//	
//	driver.switchTo().defaultContent();
//	
//	driver.switchTo().frame("Amazon_ContactForm");
//	findElement(By.name("firstname")).sendKeys("Sunita");
//	findElement(By.name("lastname")).sendKeys("TCS");
//	findElement(By.name("subject")).sendKeys("Sunita TCS");
//
//	
//	driver.switchTo().defaultContent();
//	
//	
//	driver.switchTo().frame("Google_ContactForm");
//	findElement(By.name("firstname")).clear();
//	findElement(By.name("firstname")).sendKeys("Dharmaja");
//	
//	findElement(By.name("lastname")).clear();
//	findElement(By.name("lastname")).sendKeys("Selenium Trainer");
//	
//	findElement(By.name("subject1")).clear();
//	findElement(By.name("subject1")).sendKeys("Dharamja - Selenium Trainer");
//	
//	//driver.quit();
	
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
