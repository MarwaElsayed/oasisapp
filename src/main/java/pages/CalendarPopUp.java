package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;

public class CalendarPopUp extends BasePage {

	public CalendarPopUp(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[@id='pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13']")
	public WebElement CalendarSpan ;
	
	@FindBy(name = "pt1:contrRg:0:CntRgn:2:pt1:pt_or1:pt_oc2:pt_or7:pt_oc11:oc22:or11:oc16:oc1:or7:oc68:ff13:fi25:id13")
	public WebElement CalendarInput ;
  
	@FindBy(xpath = "//body[1]/form[1]/span[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[2]/span[4]/a[1]/span[1]/span[1]/span[3]/table[1]/tbody[1]/tr[1]/td[1]/span[1]")
	public WebElement PostedValue ;
	
	public void ClickOnCalendarSpan() {
		clicklink(CalendarSpan);
	}
	
	public void SetDateValue(String value) {
		setTextElementText(CalendarInput, value);
	}

}
