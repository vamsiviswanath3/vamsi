package citybank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clickonshoppingcard {
	WebDriver driver;

	/*public void clickonshoppingcard(WebDriver driver)
	{
		
		this.driver = driver;
	}*/
  @Test
  public void clickonshoppingcardlink()throws Exception
  {
	//*[@id='simplicity1']/a
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement shopping = driver.findElement(By.xpath("//*[text()='Fuel']"));
	  Actions actions = new Actions(driver);
		
		 actions.moveToElement(shopping).click().build().perform();
	  
	// WeblEment Shopping= driver.findElement(By.xpath("//*[@id=\'simplicity1\']/")).click();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement Beginurapplication= driver.findElement(By.xpath("//*[@id=\'tabs-wrapper\']/div[2]/div[2]/a"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView();",Beginurapplication);
	  
	  
	  
	  
	  
  }

public void clickonshoppingcard(WebDriver driver) {
	// TODO Auto-generated method stub
	this.driver = driver;
}

}
