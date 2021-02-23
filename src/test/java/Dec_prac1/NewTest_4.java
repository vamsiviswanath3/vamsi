package Dec_prac1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTest_4 {
	
	
	static  WebDriver driver;
	static String Url="https://opensource-demo.orangehrmlive.com/";
	 
  @Test
  public void Qualifi() throws Exception {
	 
	  NewTest_4.openChrome();
	  NewTest_4.openUrl(Url);
	  NewTest_4.Login();
	  NewTest_4.qualifications();
	  NewTest_4.addSkills();
	  NewTest_4.quit();
	 

  }
  public static  void openChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  public static  void openUrl(String Url1) {
	  driver.get(Url1);
  }
		
	 
  
  public static void Login()
  {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
	 public static void qualifications() {
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		  driver.findElement(By.id("menu_admin_Qualifications")).click();
		  
	 }
	 public static  void addSkills()
	 {
		  driver.findElement(By.id("menu_admin_viewSkills")).click();
		  driver.findElement(By.id("btnAdd")).click();
		  driver.findElement(By.name("skill[name]")).sendKeys("practise3");
		  driver.findElement(By.name("skill[description]")).sendKeys("i am done");
          driver.findElement(By.id("btnSave")).click();
	 }
	public static void quit()
	{
		driver.quit();
	}
	  
	

	 public  static WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", elem);
		 
			}
			return elem;
		}


  
}
