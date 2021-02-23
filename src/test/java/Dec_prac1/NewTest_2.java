package Dec_prac1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTest_2 {
	 WebDriver driver;
  @Test
  public void Qualifi() throws Exception {
	  NewTest_2 s = new NewTest_2();
	  s.openChrome();
	  s.openUrl();
	  s.Login();
	  s.qualifications();
	  s.addSkills();
	 // s.quit();
	 

  }
  public void openChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  public void openUrl() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }
		
	 
  
  public void Login() throws Exception
  {
	  findElement(By.id("txtUsername")).sendKeys("Admin");
	  findElement(By.id("txtPassword")).sendKeys("admin123");
	  findElement(By.id("btnLogin")).click();
  }
	 public void qualifications()throws Exception {
		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  findElement(By.id("menu_admin_Qualifications")).click();
		  
	 }
	 public void addSkills()throws Exception
	 {
		  findElement(By.id("menu_admin_viewSkills")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.name("skill[name]")).sendKeys("practise3");
		  findElement(By.name("skill[description]")).sendKeys("i am done");
          findElement(By.id("btnSave")).click();
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
	public void quit()
	{
		driver.quit();
	}
	  
  
}
