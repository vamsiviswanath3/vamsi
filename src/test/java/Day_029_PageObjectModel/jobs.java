package Day_029_PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class jobs {
	
WebDriver driver;
String Usrname="Admin";
String Pass="admin123";
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	
	}
  @Test
  public void prac() throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login(Usrname,Pass);
		
		Job j1 = new Job();
		j1.Job(driver);
		j1.Jobe();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
	  
  }
  
}
