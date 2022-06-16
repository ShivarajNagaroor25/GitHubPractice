package practiceSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingOnValidationtest {
	@Test
	public  void TC() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demowebshop.tricentis.com/");

		String Title=driver.getTitle();
		if(Title.contains("Demo")){
			System.out.println("Pass: Demo web page is open");
		}

		String FirstName="Shivaraj";
		String LastName="Nagaroor";
		String Email="kjaskkhf@gmail.com"; 
		String Password="Shivaraj";
		String ConfirmPassword="Shivaraj";
		driver.findElement(By.className("ico-register")).click();

		String RegTitle=driver.getTitle();
		if(RegTitle.contains("Register")){
			System.out.println("Pass: Register page is displayed");

		}
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		driver.findElement(By.id("register-button")).click();

		if(driver.findElement(By.className("ico-logout")).isDisplayed()){
			System.out.println("Pass: User is sucessfully registered");
			driver.close();
		}
	}
}
