package practiceSession;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class workingOnExtentsReports {
	static WebDriver driver;
public static void main(String[] args) {
	LocalDateTime sysDate=LocalDateTime.now();
	String reportName=sysDate.toString().replace(":", "-");
	
	ExtentReports report=new ExtentReports("./Reports/" +reportName+" ExtentReports.html", true);
	ExtentTest test=report.startTest("ExtentDemo");
	
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	test.log(LogStatus.INFO, "Browser is launched");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/");
	test.log(LogStatus.INFO, "Page is Loaded");
	
	test.log(LogStatus.INFO, test.addScreenCapture(screenCapture()));
	
	report.endTest(test);
	report.flush();
}
	
	public static String screenCapture(){
		LocalDateTime sysDate=LocalDateTime.now();
		String screenShotName=sysDate.toString().replaceAll(":", "-");
		String imgPath="./screenShots/"+screenShotName+".png";
		TakesScreenshot tS=(TakesScreenshot)driver;
		File fs=tS.getScreenshotAs(OutputType.FILE);
		File dest=new File(imgPath);
		try{
		FileHandler.copy(fs, dest);
		}
		catch(IOException e){
			System.out.println("Exception Handled");
		}
		return "."+imgPath;
	}
}
