package citybank;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;


public class tco1_applycreditcard 
{
	WebDriver driver;
  @Test
  
  public void Main() throws Exception
  {
	    driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://www.online.citibank.co.in/";
		driver.get(TestURL);
		Reporter.log("Pass- open Citybank online");
		
		clickoncreditcard clickoncredit= new clickoncreditcard();
		clickoncredit.clickoncreditcardbutton(driver);
		clickoncredit.applyforcreditcard();
		Reporter.log("Pass- Sucessfully click on creditcard button");
		
		clickonshoppingcard clickonshopping = new clickonshoppingcard();
		clickonshopping.clickonshoppingcard(driver);
		clickonshopping.clickonshoppingcardlink();
		
		
		
	  
  }
  
  
}
