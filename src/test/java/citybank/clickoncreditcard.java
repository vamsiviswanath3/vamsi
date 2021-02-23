package citybank;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import andhraceo.search;

public class clickoncreditcard {
	static WebDriver driver;

	public void clickoncreditcardbutton(WebDriver driver)
	{
		
		clickoncreditcard.driver = driver;
	}
  
  public void applyforcreditcard() 
  {
	  driver.findElement(By.id("topMnucreditcards")).click();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	//*[@id='CreditSubMenu']/div/div[1]/div[1]/div/div[2]/div[2]/ul/li[1]/a/p
	  driver.findElement(By.xpath("//*[@id=\'CreditSubMenu\']/div/div[1]/div[1]/div/div[2]/div[2]/ul/li[1]/a/p")).click();
	  
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  
	  
  }
}
