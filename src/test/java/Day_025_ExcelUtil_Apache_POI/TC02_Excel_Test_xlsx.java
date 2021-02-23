package Day_025_ExcelUtil_Apache_POI;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;

import java.io.*;
import org.apache.poi.ss.usermodel.CellType;


public  class TC02_Excel_Test_xlsx
{
		

    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    
    public FileOutputStream fout=null;
    public FileInputStream fis = null;
    
    String TestURL,UserName,Password,Nationality1;
    WebDriver driver;

    @Test
    public void hello()throws Exception
    {
    	
    	TC02_Excel_Test_xlsx eat=new TC02_Excel_Test_xlsx();
   	 ExcelApiTest4 eat1 = new ExcelApiTest4();
	 int numberowsInputdata=eat1.getRowCount("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1");
	 System.out.println(numberowsInputdata);

		 for(int i=1;i<numberowsInputdata;i++)
    	
		 {
    	 
    	 TestURL=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,0);
    	 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,1);
		 Password=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,2);
		 Nationality1=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality1.xlsx","Sheet1",i,3);
		 }
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
		 driver.get(TestURL);
				
		 findElement(By.name("txtUsername")).sendKeys(UserName);
		 findElement(By.name("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		 findElement(By.id("menu_admin_viewAdminModule")).click();
		 findElement(By.id("menu_admin_nationality")).click();
	     findElement(By.id("btnAdd")).click();
	     findElement(By.name("nationality[name]")).clear();
		 findElement(By.name("nationality[name]")).sendKeys(Nationality1);
		 
		 
		 findElement(By.name("btnSave")).click();
		 //nationality[name]
		// btnAdd
		 //menu_admin_nationality
		 
		// menu_admin_nationality
		// driver.quit();

    }
    
    public String getCellData(String xlFilePath, String sheetName,int rowNum,int column) throws Exception
    {
    	fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        cell = row.getCell(column);
       
        if(cell.getCellTypeEnum() == CellType.STRING)
        {	
        	String str6=cell.getStringCellValue();
        	workbook.close();
        	fis.close();
            return str6;
        }
        
        else if(cell.getCellTypeEnum() == CellType.NUMERIC)
        {	
        	
        	int i = (int)cell.getNumericCellValue(); 
        	String str6 = String.valueOf(i); 
        	workbook.close();
        	fis.close();
            return str6;
        }
        else 
        {
        	String str6=cell.getStringCellValue();
        	workbook.close();
        	fis.close();
            return str6;
        }
        
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

	
    
    
    
    
    
    
    
    
    
}

