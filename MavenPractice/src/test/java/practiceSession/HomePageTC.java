package practiceSession;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageTC extends BaseClassTest {
	@Test
	public void TC_02() throws IOException{
		driver.get(WorkingOnPropertyFileRead.getreadMethod("URL"));
		
		WelcomePage wP=new WelcomePage(driver);
		wP.LoginLink();
		
		LoginPage log=new LoginPage(driver);
		log.emailInput("shivarajnagaroor@gmail.com");
		log.passwordInput("shivu@1234");
		log.clickLoginButton();
		
		HomePage hP=new HomePage(driver);
		if(hP.getLogoutLink().isDisplayed()){
			
			Reporter.log("PASS: User is sucessfuly logedin", true);
		hP.MyAcc_Click();
		hP.ClickOnLogutLink();
	}
}
}