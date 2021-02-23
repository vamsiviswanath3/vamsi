package Day_022_Action_class;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Set;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 public class Drag_and_drop_amazon_ex {

static WebDriver driver;//obj creation


@Test
public void Login_Frames() throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");
//WebElement Element = findElement(By.linkText("Accordion"));
//How to do scrolling
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,12500)");
        //js.executeScript("arguments[0].scrollIntoView();", Element);
//driver.switchTo().frame(1);
System.out.println(driver.findElements(By.tagName("iframe")).size());
//we discuss with index below line code
//driver.switchTo().frame(0);
// we discuss with WebElement below line code
driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//driver.findElement(By.id("draggable")).click();
Actions a =new Actions(driver);
WebElement source=driver.findElement(By.id("draggable"));
WebElement target=driver.findElement(By.id("droppable"));
a.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Accept")).click();


TakesScreenshot scrShot1 =((TakesScreenshot)driver);
File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(SrcFile1, new File("C:\\TC02_Login\\TC1_ScreenShot2.jpg"));
}

}