package Jan1st2021;

import CommonUtil.*;
import ExcelUtil.ExcelApiTest4;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;


import org.openqa.selenium.interactions.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class NewTest_Photoupload {
	
	 WebDriver driver;
		
		@DataProvider (name = "TC01_Add_Employee_Data")
	    public static  Object[][] Authentication1() throws Exception{
			
			ExcelApiTest4 eat= new ExcelApiTest4();
	        Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC02_Photo.xlsx","Sheet1");
	         System.out.println(testObjArray.length);
	          return (testObjArray); 
		}
	
	
		@Test(dataProvider="TC01_Add_Employee_Data")
  
  
  public void Job(String UserName,String Password,String JobTitle ,String PhotoPath) throws Exception {
	  
			driver=TestBrowser.OpenChromeBrowser();
	     	driver.get("https://opensource-demo.orangehrmlive.com/");
	 
			OrangeHRMlogin(UserName,Password);
			addJob(JobTitle );
			PhotoUpload(PhotoPath);
			

			driver.quit();
  }
  
		 public   void OrangeHRMlogin(String UserName,String Password)throws Exception
		 {
			 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
			 findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
			 findElement(By.xpath(OR.login_click)).click();
				
		 }
		 
		 public   void addJob(String JobTitle  )throws Exception
			{  
			  findElement(By.id("menu_admin_viewAdminModule")).click();

			  findElement(By.id("menu_admin_Job")).click();
			  findElement(By.id("menu_admin_viewJobTitleList")).click();
			  findElement(By.id("btnAdd")).click();
			  findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle);
			/*  findElement(By.id("jobTitle_jobTitle")).sendKeys(JobTitle);
			  findElement(By.id("jobTitle_jobDescription")).sendKeys(Descr);
			  findElement(By.id("jobTitle_note")).sendKeys(Note);*/
			 /* findElement(By.linkText(Empid)).click();
				 findElement(By.id("empPic")).click();*/
			  
			  WebElement Choosefilebutton=findElement(By.id("jobTitle_jobSpec"));
				
				Actions actions= new Actions(driver);
				

				actions.moveToElement(Choosefilebutton).click().build().perform();
				 
				//builder.click().build().perform();
				 
					//*[@id="photofile"]
				 //  findElement(By.xpath("//*[@id='photofile']")).click();
				   Thread.sleep(1000);
			//	   findElement(By.id("btnSave")).click();
				   
			//	   PhotoUpload()
					
			}


		public   void PhotoUpload(String PhotoPath)throws Exception
			{
				// Specify the file location with extension
				// StringSelection sel = new StringSelection("C:\\Users\\Sudhakar\\Desktop\\download1.jpg");
				 
				 StringSelection sel = new StringSelection(PhotoPath);
				 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
				
				 
				 // Create object of Robot class
				 Robot robot = new Robot();
				 //Thread.sleep(2000);
				 
				  // Press CTRL+V
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_V);
				 
				// Release CTRL+V
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyRelease(KeyEvent.VK_V);
				 Thread.sleep(2000);
				        
				       //  Press Enter 
				 robot.keyPress(KeyEvent.VK_ENTER);
				 robot.keyRelease(KeyEvent.VK_ENTER);
				 
				 
				 
				 Thread.sleep(8000);
			
				findElement(By.id("btnSave")).click();
				
				
				Thread.sleep(10000);
				 

				 
				
				
			}
			
  
		
		public  WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		}
}
