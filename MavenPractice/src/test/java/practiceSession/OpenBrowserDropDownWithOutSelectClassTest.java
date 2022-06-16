package practiceSession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenBrowserDropDownWithOutSelectClassTest {
@Test
public void TC() throws InterruptedException, AWTException{
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//div[contains(@class,'listbox')]/ul[1]/li[5]/a[contains(text(),'Digital downloads')]")).click();
			
	/*driver.findElement(By.className("ico-register")).click();
	
	String FirstName="Shivaraj";
	String LastName="Nagaroor";
	String Email="kjabkf@gmail.com"; 
	String Password="Shivaraj";
	String ConfirmPassword="Shivaraj";
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(FirstName);
	driver.findElement(By.id("LastName")).sendKeys(LastName);
	driver.findElement(By.id("Email")).sendKeys(Email);
	driver.findElement(By.id("Password")).sendKeys(Password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
	driver.findElement(By.id("register-button")).click();
	driver.findElement(By.xpath("//div[contains(@class,'listbox')]/ul[1]/li[5]/a[contains(text(),'Digital downloads')]")).click();
	*/
	/*Actions act=new Actions(driver);
	for(int i=0;i<=5;i++){
	driver.findElement(By.xpath("//select[@id='products-orderby']")).click();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).build().perform();
	
	}*/
	for(int i=0;i<=5;i++){
		driver.findElement(By.xpath("//select[@id='products-orderby']")).click();
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_ENTER);
	}
	driver.close();
}
}
