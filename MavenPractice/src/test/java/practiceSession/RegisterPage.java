package practiceSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement MaleRadioButton;
	public void clickMaleRadioButton(){
		MaleRadioButton.click();
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement FN_TextField;
	public void FirstNameTF(String FirstName ){
		FN_TextField.sendKeys(FirstName);
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement LN_TextField;
	public void LastNameTF(String LastName){
		LN_TextField.sendKeys(LastName);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email_TextField;
	public void EmailTextField(String Email){
		Email_TextField.sendKeys(Email);
	}
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement Password_TF;
	public void PasswordTextField(String Password){
		Password_TF.sendKeys(Password);
	}
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement CP_TextField;
	public void ConformPassword_TF(String ConfirmPassword){
		CP_TextField.sendKeys(ConfirmPassword);
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement RegisterButton;
	public void Click_RB(){
		RegisterButton.click();
	}
	
	@FindBy(xpath="//input[@class='button-1 register-continue-button']")
	private WebElement ContinueButton;
	public void ClickOn_CB(){
		ContinueButton.click();
	}
	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}
	public WebElement getFN_TextField() {
		return FN_TextField;
	}
	public WebElement getLN_TextField() {
		return LN_TextField;
	}
	public WebElement getEmail_TextField() {
		return Email_TextField;
	}
	public WebElement getPassword_TF() {
		return Password_TF;
	}
	public WebElement getCP_TextField() {
		return CP_TextField;
	}
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	public WebElement getContinueButton() {
		return ContinueButton;
	}
	public void setMaleRadioButton(WebElement maleRadioButton) {
		MaleRadioButton = maleRadioButton;
	}
	public void setFN_TextField(WebElement fN_TextField) {
		FN_TextField = fN_TextField;
	}
	public void setLN_TextField(WebElement lN_TextField) {
		LN_TextField = lN_TextField;
	}
	public void setEmail_TextField(WebElement email_TextField) {
		Email_TextField = email_TextField;
	}
	public void setPassword_TF(WebElement password_TF) {
		Password_TF = password_TF;
	}
	public void setCP_TextField(WebElement cP_TextField) {
		CP_TextField = cP_TextField;
	}
	public void setRegisterButton(WebElement registerButton) {
		RegisterButton = registerButton;
	}
	public void setContinueButton(WebElement continueButton) {
		ContinueButton = continueButton;
	}
	
}
