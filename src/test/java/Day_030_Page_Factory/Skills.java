package Day_030_Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Skills {
	WebDriver driver;
  @Test
  public void Skills(WebDriver driver) {
	  
	  this.driver = driver;
		PageFactory.initElements(driver, this);
  }
  
	@FindBy(id="menu_admin_viewAdminModule")
    WebElement Admin;  
	
	@FindBy(id="menu_admin_Qualifications")
	WebElement Qualifications;
	
	@FindBy(id="menu_admin_viewSkills")
	WebElement Skills;
	
	@FindBy(id="btnAdd")
	WebElement Add;
	
	@FindBy(id="skill_name")
	WebElement Name;
	
	//btnSave
	@FindBy(id="btnSave")
	WebElement Save;
	
public void addSkills() throws Exception {
	Actions actions=new Actions(driver);
	actions.moveToElement(Admin).click().build().perform();
	//	Admin.click();
	actions.moveToElement(Qualifications).build().perform();
	//	Qualifications.click();
		Skills.click();
		Add.click();
		Name.sendKeys("vamsi viswanath");
		Save.click();
//		Skills.sendKeys("Admin");
//		Password1.sendKeys("admin123");
//		SignInButton1.click();
	}
	
	
	
	
}
