package ABC_Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver ;
	String Url="https://opensource-demo.orangehrmlive.com/";
	
	@Test
	public void Login_Test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get(Url);
		
		driver.quit();
		
	}
	
	

}
