package code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//*[@id='branding']//a[@id='welcome']")
	private WebElement welcomelink;
	
	@FindBy(xpath="//*[@id='welcome-menu']//ul//li//a[text()='Logout']")
	private WebElement logoutlink;
	
	public Homepage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public WebElement getwelcomelink() {
		return welcomelink;
	}
	
	public WebElement getlogoutlink() {
		return logoutlink;
	}
}
