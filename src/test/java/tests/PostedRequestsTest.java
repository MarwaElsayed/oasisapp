package tests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ManageApprovalsPage;
import pages.CalendarPopUp;

public class PostedRequestsTest extends TestBase {
	
	LoginTest loginTestObj;
	HomePage homePageObj;
	ManageApprovalsPage manageObj;
	CalendarPopUp calendarObj;
	
	@Test
	public void PostedRequestedDisplayedAsExpected () throws InterruptedException {
		loginTestObj = new LoginTest();
		loginTestObj.UserLoginSuccessfully();
		homePageObj = new HomePage(driver);
		homePageObj.ClickOnMenu();
		homePageObj.ClickOnManageApprovalsLink();
		calendarObj = new CalendarPopUp(driver);
		calendarObj.ClickOnCalendarSpan();
		calendarObj.SetDateValue("01-01/2022");
		calendarObj.CalendarInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String postedValue= calendarObj.PostedValue.getText();
		System.out.println(postedValue);
		Assert.assertEquals(postedValue, "92");		
	}

}
