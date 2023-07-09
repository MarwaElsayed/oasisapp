package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(id = "it1::content")
	WebElement LogInUsername ;
	
	@FindBy(id = "it2::content")
	WebElement LogInPassword ;
	
	@FindBy(id = "login")
	WebElement LogInBtn ;
	
	public void UserSignIn(String username, String password) {
		setTextElementText(LogInUsername, username);
		setTextElementText(LogInPassword, password);
		clicklink(LogInBtn);
	}

}
