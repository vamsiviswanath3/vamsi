
package  Day_029_PageObjectModel;
import CommonUtil.*;
import ExcelUtil.ExcelApiTest3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
public class TC01_Add_Customers
{
	WebDriver driver;
//	String Usrname="Admin";
//	String Pass="admin123";
	
//	@BeforeTest 
//	public void  TestSetup()throws Exception {
//		
//		driver = TestBrowser.OpenChromeBrowser();
//		String TestURL = "https://opensource-demo.orangehrmlive.com/";
//		driver.get(TestURL);
//	}
	
	
	@DataProvider(name = "TC01_Add_Nationality")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest3 eat = new ExcelApiTest3();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC_01Nationality333.xls", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
 

	@Test(dataProvider="TC01_Add_Nationality")
	
	
	
	
	public void Book_OneWay_Flight(String Usrname,String Pass) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login(Usrname,Pass);
		
		Customers S1= new Customers();
		S1.Customers(driver);
		S1.AddCustomers();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
		
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {
		
		driver.quit();
	}
	
	
	
}












