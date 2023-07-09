package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	public  WebDriver driver;
	private static WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		
	  		wait = new WebDriverWait(driver, Duration.ofSeconds(70));
			PageFactory.initElements(driver, this);
	}
			
	protected static void clicklink(WebElement link) {
		wait.until(ExpectedConditions.visibilityOf(link));
		link.click();
		try {
		    Thread.sleep(2500);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
	}
	
	protected static void setTextElementText(WebElement textElement, String value) {
		textElement.sendKeys(value);
	}

}

