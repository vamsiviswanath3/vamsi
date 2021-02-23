/*Dec_prac1*/
/*NewTest_Dec29*/

package Dec_prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;



public class NewTest_Dec29 {
	
	
	WebDriver driver;
	
	@DataProvider(name = "TC01_Add_Nationality")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Skills141.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
 

	@Test(dataProvider="TC01_Add_Nationality")
	public void Login_Test(String Browser,String TestURL,String UserName,String Password,String SkillName,String SkillDesc) throws Exception
	{
		
		NewTest_Dec29 T1= new NewTest_Dec29();

					if(Browser.equalsIgnoreCase("Chrome"))
					{
						 T1.OpenChromeBrowser(TestURL);
						 
					 	
				    }

					if(Browser.equalsIgnoreCase("FireFox"))
					{
						 T1.OpenFireFoxBrowser(TestURL);
							Thread.sleep(10000);
					}
					
					
				/*	if(Browser.equalsIgnoreCase("RemoteWebDriver1"))
					{
							driver = TestBrowser.RemoteWebDriver();
							Thread.sleep(10000);
					}*/
					
					
					
					
					
					
/*					T1..OpenOrangeHRM(TestURL);
*/			
					T1.Login(UserName,Password);
					T1.addSkills(SkillName,SkillDesc);
					T1.CloseBrowser();
				//	TN.AddNationalities(Nationality);
					driver.quit();
	}
	
	public  void OpenChromeBrowser(String TestURL1) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(TestURL1);
		  driver.manage().window().maximize();

	}
	
	public  void OpenFireFoxBrowser(String TestURL1) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\FireFoxDriver\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  Thread.sleep(6000);
		 
		  driver.manage().window().maximize();
		  driver.get(TestURL1);
		  driver.manage().window().maximize();


	}
	
	public  void Login(String UserName1,String Password1) throws Exception
	{
		findElement(By.id("txtUsername")).sendKeys(UserName1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();

	}
	
	 public void addSkills(String SkillName1,String SkillDesc1)throws Exception
	 {
		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  findElement(By.id("menu_admin_Qualifications")).click();

		  findElement(By.id("menu_admin_viewSkills")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.name("skill[name]")).sendKeys(SkillName1);
		  findElement(By.name("skill[description]")).sendKeys(SkillDesc1);
          findElement(By.id("btnSave")).click();
	 }
	public void CloseBrowser()throws Exception
	{
		driver.quit();
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
 
	
	
	
	
	
	
	
	
	
	
/*	public    void AddNationalities(String Nationality) throws Exception
	{
		
	
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Admin")).click();
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;		
		 WebElement button =findElement(By.linkText("Admin"));	
	      js.executeScript("arguments[0].click();", button);
		
			Thread.sleep(5000);
	
		findElement(By.linkText("Nationalities")).click();
		Thread.sleep(7000);
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		findElement(By.id("btnSave")).click();
		
	}
*/	
	
	
	
	
	

}

