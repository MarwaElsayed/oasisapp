package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;

public class ManageApprovalsPage extends BasePage{

	public ManageApprovalsPage(WebDriver driver) {
		super(driver);
	}
	
		
	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13::glyph")
	 WebElement DatePickerBtn ;	
	
	public void ClickOnDatePicker() {
		clicklink(DatePickerBtn);
	}
}

