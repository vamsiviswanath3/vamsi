package Dec_prac1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTestStaticEx {
	
	
	static  WebDriver driver;
	 static String Url="https://opensource-demo.orangehrmlive.com/";
	 String UserName="Admin",Password="admin123";
		String SkillsTxt= "Java12343";
		String SkillsDesc= "Learning Java";
	 
  @Test
  public void Qualifi() throws Exception {
	 
	  NewTestStaticEx.openChrome();
	  NewTestStaticEx.openUrl(Url);
	  NewTestStaticEx.Login(UserName,Password);
	  NewTestStaticEx.qualifications();
	  NewTestStaticEx.addSkills(SkillsTxt,SkillsDesc);
	 // NewTestStaticEx.quit();
	 

  }
  public static  void openChrome() {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  public static  void openUrl(String Url1) {
	  driver.get(Url1);
  }
		
	 
  
  public static void Login(String UserName1,String Password1)
  {
	  driver.findElement(By.id("txtUsername")).sendKeys(UserName1);
	  driver.findElement(By.id("txtPassword")).sendKeys(Password1);
	  driver.findElement(By.id("btnLogin")).click();
  }
	 public static void qualifications() {
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		  driver.findElement(By.id("menu_admin_Qualifications")).click();
		  
	 }
	 public static  void addSkills(String SkillsTxt1,String SkillsDesc1)
	 {
		  driver.findElement(By.id("menu_admin_viewSkills")).click();
		  driver.findElement(By.id("btnAdd")).click();
		  driver.findElement(By.name("skill[name]")).sendKeys(SkillsTxt1);
		  driver.findElement(By.name("skill[description]")).sendKeys(SkillsDesc1);
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
