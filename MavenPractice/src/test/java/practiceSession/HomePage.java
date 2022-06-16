package practiceSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='header-links-wrapper']/div[1]/ul/li[1]//a[@class='account']")
	private WebElement myAccoutLink;
	
	public void MyAcc_Click(){
		myAccoutLink.click();
	}
	
	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement logoutLink;
	
	public void ClickOnLogutLink(){
		logoutLink.click();
	}

	public WebElement getMyAccoutLink() {
		return myAccoutLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setMyAccoutLink(WebElement myAccoutLink) {
		this.myAccoutLink = myAccoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

}
