package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;


public class HomePage extends BasePage {

	public  HomePage(WebDriver driver) {
		super (driver);
	}
	
	@FindBy(id = "pt1:OasisHedarToolBar:hamburgerBtn")
	 WebElement OpenMenu ;
	
	@FindBy(id = "search|input")
    WebElement SearchBox ;
	
	@FindBy(xpath = "//span[contains(text(),'Manage Approvals')]")
	 WebElement ManageApprovalsLink ;
	
	public void ClickOnMenu() {
		clicklink(OpenMenu);
	}
	
	public void ClickOnManageApprovalsLink() {
		clicklink(ManageApprovalsLink);
	}
	
}
