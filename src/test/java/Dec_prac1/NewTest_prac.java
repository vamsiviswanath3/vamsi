package Dec_prac1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest_prac {
	 WebDriver driver;
  @Test
  public void prepare() throws Exception
  {
	  NewTest_prac s = new NewTest_prac();
	  s.openChrome();
	  s.openUrl();
    //  s.login();
    /*  s.qualifications();
	  s.addSkills(); */
  }
  public void openChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();  
  }
  public void openUrl() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  public void login() {
	  driver.findElement(By.id("")).sendKeys("");
  }
  
}
