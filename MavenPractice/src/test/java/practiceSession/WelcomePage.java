package practiceSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="ico-register")
	private WebElement registerLink;
	public void RegisterLink(){
		registerLink.click();
	}
	
	@FindBy(className="ico-login")
	private WebElement loginLink;
	public void LoginLink(){
		loginLink.click();
	}
	
	@FindBy(xpath="//div[@class='header']/div[1]/a/img")
	private WebElement HomeBackButton;
	public void HomeBack_Button(){
		HomeBackButton.click();
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	private WebElement ShoppingCartLink;
	public void ShoppingCart_Link(){
		ShoppingCartLink.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Wishlist')]")
	private WebElement WishlistLink;
	public void Wishlist_Link(){
		WishlistLink.click();
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getHomeBackButton() {
		return HomeBackButton;
	}
	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}
	public WebElement getWishlistLink() {
		return WishlistLink;
	}
	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}
	public void setHomeBackButton(WebElement homeBackButton) {
		HomeBackButton = homeBackButton;
	}
	public void setShoppingCartLink(WebElement shoppingCartLink) {
		ShoppingCartLink = shoppingCartLink;
	}
	public void setWishlistLink(WebElement wishlistLink) {
		WishlistLink = wishlistLink;
	}
	
}
