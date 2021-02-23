package Jan1st2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_javaexecutor {
	WebDriver driver;
	
	
	
	
  @Test
  public void Login() throws Exception {
	  
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
       driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	

		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
	  WebElement Username=findElement(By.id("txtUsername"));
	  WebElement Password=findElement(By.id("txtPassword"));
	  WebElement Loginbutton=findElement(By.id("btnLogin"));
	  
	  JavascriptExecutor js= (JavascriptExecutor )driver;
	  js.executeScript("arguments[0].setAttribute('value','Admin')",Username);
	  js.executeScript("arguments[0].setAttribute('value','admin123')",Password);
	  js.executeScript("arguments[0].click();",Loginbutton);
	  
	  WebElement admin1 =findElement(By.id("menu_admin_viewAdminModule")); 
      js.executeScript("arguments[0].click();", admin1);
      
     
	  
	 
/*    JavascriptExecutor js1= (JavascriptExecutor )driver;
*/	  WebElement qual =findElement(By.id("menu_admin_Qualifications")); 
      js.executeScript("arguments[0].click();", qual);
      
      //JavascriptExecutor js2= (JavascriptExecutor )driver;
      WebElement skills =findElement(By.id("menu_admin_viewSkills")); 
      js.executeScript("arguments[0].click();", skills);
      
      
      WebElement Add =findElement(By.id("btnAdd")); 
	  js.executeScript("arguments[0].click();",Add);
	  
	findElement(By.id("skill_name")).sendKeys("Kasi");
	//findElement(By.name("txtUsername")).sendKeys("Admin");

	//*[@id="skill_name"]   skill_name
  /*    WebElement Name =driver	.findElement(By.id("skill_name")); 
	  js.executeScript("arguments[0].setAttribute('value','kasi')",Name);	*/
	 // js.executeScript("arguments[0].setAttribute('value','Admin')", Name);
	  
	  Thread.sleep(3000);
	  WebElement  Save =findElement(By.id("btnSave")); 
	  js.executeScript("arguments[0].click();",Save);
      
      
      
      
      
      
	  
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
  


/*private WebElement findElement(By id) {
	// TODO Auto-generated method stub
	return null;
}*/
}
