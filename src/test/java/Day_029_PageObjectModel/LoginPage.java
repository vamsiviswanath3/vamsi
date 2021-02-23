package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage
{
	
	WebDriver driver;
	//String Usrname="Admin";
	//	String Pass="admin123";
	
	 public void LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	
	public void Login(String Usrname,String Pass) throws Exception {
		
		findElement(By.name("txtUsername")).sendKeys(Usrname);
		findElement(By.name("txtPassword")).sendKeys(Pass);
		findElement(By.id("btnLogin")).click();
	}
	
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	
	
	
	
}















