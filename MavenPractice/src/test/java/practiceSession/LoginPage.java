package practiceSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	public void emailInput(String email){
		emailTextField.sendKeys(email);
	}
	
	@FindBy(id="Password")
	private WebElement password_TF;
	public void passwordInput(String password){
		password_TF.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement login_button;
	public void clickLoginButton(){
		login_button.click();
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPassword_TF() {
		return password_TF;
	}
	public WebElement getLogin_button() {
		return login_button;
	}
	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}
	public void setPassword_TF(WebElement password_TF) {
		this.password_TF = password_TF;
	}
	public void setLogin_button(WebElement login_button) {
		this.login_button = login_button;
	}
}
