package practiceSession;

import org.testng.annotations.Test;

public class LoginTC extends BaseClassTest{
	@Test
	public void TC_01() throws InterruptedException{
		driver.get("http://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.LoginLink();

		LoginPage log=new LoginPage(driver);
		log.emailInput("shivarajnagaroor@gmail.com");
		log.passwordInput("shivu@1234");
		log.clickLoginButton();
	}
}
