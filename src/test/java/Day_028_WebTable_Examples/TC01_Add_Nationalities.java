//import MercuryDemoTours;

package Day_028_WebTable_Examples;

import CommonUtil.*;
import ExcelUtil.ExcelApiTest3;
import ExcelUtil.ExcelApiTest4;

import org.testng.annotations.Test;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;
import java.util.concurrent.TimeUnit;

/*
1. Open Chrome browser
2. open Orange Application urL
3. login
4. Navigate to employee screen
5. Export Employees to Excel sheet
5. logout and Quit
*/
 
public class TC01_Add_Nationalities
{
	public String UserName,Password,Nationality;
	public String TestUrl;

	
	
	//public  int iRow=0;
	public  int iRow;
	WebDriver driver;

	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
		public WebElement findElement(By by)throws Exception {
		    WebElement elem = driver.findElement(by);
		 
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		    } 
		    Thread.sleep(10);
		    
		    return elem;
		}
		
		
	
	
	
	
	@Test
	public  void TC01_Nationality( )throws Exception
	{  
		

	    driver=TestBrowser.OpenChromeBrowser();
			
		
			 ExcelApiTest4 eat = new ExcelApiTest4();
			 int numberowsInputdata=eat.getRowCount("C://HTML Report//OrangeHRM6//Book12345.xlsx","Sheet1");
			// System.out.println(+numberowsInputdata);
			 System.out.println(numberowsInputdata);

				 for(int i=1;i<numberowsInputdata;i++)
				 {		 
					 TestUrl=eat.getCellData("C://HTML Report//OrangeHRM6//Book12345.xlsx","Sheet1",i,0);
					 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//Book12345.xlsx","Sheet1",i,1);
					 Password=eat.getCellData("C://HTML Report//OrangeHRM6//Book12345.xlsx","Sheet1",i,2);
					 Nationality=eat.getCellData("C://HTML Report//OrangeHRM6//Book12345.xlsx","Sheet1",i,3);
					 System.out.println(""+Nationality);
					 iRow=i;
					 //iRow=i+1;
					call_allmethods(iRow);
					//iRow=i+1;
				 }
			
				 driver.quit();
				 
	}
	
				 
				 
				 public void call_allmethods(int iRow )throws Exception
					{  
						
					 
							if(iRow==1)
							{
								 driver.get("https://opensource-demo.orangehrmlive.com/");
								 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
									

									findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
									findElement(By.xpath(OR.login_click)).click();
									//findElement(By.id("")).click();
								//	driver.quit();
//									JavascriptExecutor js = (JavascriptExecutor)driver;	
//
//									driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//									WebElement button =findElement(By.id("welcome"));
//								       js.executeScript("arguments[0].click();", button);
//
//									WebElement button1=findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a"));		
//							        
//							        
//							
//							       js.executeScript("arguments[0].click();", button);
//								
									
							
//								Login l1=new Login();
//								l1.Login(driver);
//								l1.openOrangeHRM(TestUrl);
//								l1.OrangeHRMlogin(UserName,Password);
//								l1.OrangeHRMSigninClick();
							
								Nationality N1=new Nationality();
								N1.Nationality(driver);
								N1.NationalityDetails(Nationality);
								
								iRow=iRow+1;
								
							}
							else
							{
	
//								 driver.get("https://opensource-demo.orangehrmlive.com/");
//								 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
//									
//
//									findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
//									findElement(By.xpath(OR.login_click)).click();
									
//									 driver.get("https://opensource-demo.orangehrmlive.com/");
//									 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
//										
//
//										findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
//										findElement(By.xpath(OR.login_click)).click();
								//		driver.quit();
											
								//	JavascriptExecutor js = (JavascriptExecutor)driver;	

							
								//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									//findElement(By.id("welcome")).click();
									//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								//	WebElement button =findElement(By.id("welcome"));
								   //    js.executeScript("arguments[0].click();", button);

							//		WebElement button1=findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a"));		
							        
							        
							
							  //     js.executeScript("arguments[0].click();", button);
								 //  js.executeScript("arguments[0].click();", button);
									  //Action mouseOverHome = builder.moveToElement(Login_Button).build().perform();
								//	findElement(By.linkText("Logout")).click();
								Nationality N1=new Nationality();
								N1.Nationality(driver);
								N1.NationalityDetails(Nationality);
								
								iRow=iRow+1;
							}
				
					//	System.gc();
						
						
					}
					
				 

					
					

}
				        
					
					
				
					
					
					
					
						
		





















						
						


	