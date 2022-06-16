package practiceSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartTCTest extends BaseClassTest {

	@Test
	public void TC() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.className("ico-login")).click();

		String FirstName="Shivaraj";
		String LastName="Nagaroor";
		String Email="kjsgfvanabkf@gmail.com"; 
		String Password="Shivaraj";
		String ConfirmPassword="Shivaraj";
		/*driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();*/

		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'listbox')]/ul[1]/li[5]/a[contains(text(),'Digital downloads')]")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']/../div[3]//input[@value='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//table[@class='cart']/tbody/tr/td//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@class='button-1 checkout-button']")).click();
		driver.findElement(By.className("button-1 new-address-next-step-button")).click();
		driver.findElement(By.xpath("//input[@class='button-1 cart-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
	}
}
