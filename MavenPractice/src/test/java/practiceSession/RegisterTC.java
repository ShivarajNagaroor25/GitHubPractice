package practiceSession;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class RegisterTC extends BaseClassTest {
	@Test
	public void TC_2(){
		driver.get("http://demowebshop.tricentis.com/");
		WelcomePage W_page=new WelcomePage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		W_page.LoginLink();
		
		RegisterPage rP=new RegisterPage(driver);
		rP.FirstNameTF("sdfsfdv");
		rP.LastNameTF("adfc");
		rP.EmailTextField("dsjdha@gmail.com");
		rP.PasswordTextField("jbsdfsdf");
		rP.ConformPassword_TF("jbsdfsdf");
		rP.getRegisterButton();
		rP.getContinueButton();
		/*rP.FN_TextField.sendKeys("sfgsdf");
		rP.LN_TextField.sendKeys("afds");
		rP.Email_TextField.sendKeys("asdsdfsd@gmail.com");
		rP.Password_TF.sendKeys("zxcvbnm");
		rP.CP_TextField.sendKeys("zxcvbnm");
		rP.RegisterButton.click();
		rP.ContinueButton.click();*/
	}
}
