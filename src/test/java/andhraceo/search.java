package andhraceo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.itextpdf.text.pdf.hyphenation.TernaryTree.Iterator;

public class search {
 static WebDriver driver;

public void search(WebDriver driver)
{
	search.driver = driver;
}
  public void serachbynames() throws Exception
  {	  
	  this.driver= driver;
	  //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//*[@id="bs-example-navbar-collapse-1"]/ul/li[4]/a
	 // /html/body/div[2]/div/div/div[2]/nav/div/div[2]/ul/li[4]/a
	 // driver.findElement(By.xpath(" /html/body/div[2]/div/div/div[2]/nav/div/div[2]/ul/li[4]/a")).click();
	 WebElement Searchbynames= driver.findElement(By.xpath("//*[@id=\'bs-example-navbar-collapse-1\']/ul/li[4]/a"));	
	 WebElement AssemblyConi= driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[4]/ul/li[1]/a"));
	WebElement namebasedsearch= driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[4]/ul/li[1]/ul/li[2]/a"));
	 
	 Actions actions = new Actions(driver);
		
	 actions.moveToElement(Searchbynames).
	 moveToElement(AssemblyConi).
	moveToElement(namebasedsearch).click().build().perform();
	 //driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[4]/ul/li[1]/ul/li[2]/a")).click();
	 		
		//strore all the open windows in ArrayList string
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		//Switch to New tab
		driver.switchTo().window(tabs.get(1));
	
  }
}
