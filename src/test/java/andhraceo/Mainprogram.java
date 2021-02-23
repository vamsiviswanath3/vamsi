package andhraceo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import CommonUtil.*;

import CommonUtil.TestBrowser;

public class Mainprogram {
	 WebDriver driver; 
  @Test
  public void openurl() throws Exception
  {
	  
			
			driver = TestBrowser.OpenChromeBrowser();
			String TestURL = "https://ceoandhra.nic.in/";
			driver.get(TestURL);
	

	search searchbynames= new search();
	searchbynames.search(driver);
	searchbynames.serachbynames();
	
	
	Searchbyname district= new Searchbyname();
	district.searchbyname(driver);
	district.searchbyname1();
	
	
	
  }
  
  
}
