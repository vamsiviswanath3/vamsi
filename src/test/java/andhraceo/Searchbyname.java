package andhraceo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Searchbyname {
	static WebDriver driver;

	public void searchbyname(WebDriver driver) throws Exception
	{
		Searchbyname.driver = driver;
	}
  public void searchbyname1() throws Exception
  {
	  Select districtname = new Select(driver.findElement(By.id("ddldistlist")));
	 /* List<WebElement>options=districtname.getOptions();
	  WebElement option = null;
	for(WebElement WebElementoption : options)
		  //System.out.println(option.getText());*/
	  //districtname.selectByVisibleText("7-Guntur");
	  districtname.selectByVisibleText("5-West Godavari");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  Select Acname = new Select(driver.findElement(By.id("ddlaclist")));
	  Acname.selectByVisibleText("65-Eluru");
	  
	  driver.findElement(By.id("txtHNo")).sendKeys("2-27-2/a");
	  driver.findElement(By.id("txtFname")).sendKeys("nagaram");
	  
	  String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		//Type the entered captcha to the text box
      driver.findElement(By.id("txtCaptcha")).sendKeys(captchaVal);
      driver.findElement(By.id("btn_Search")).click();

	  
  }
}
