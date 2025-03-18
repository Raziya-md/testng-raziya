package pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class browserstack_homepage {
	WebDriver driver;
	@FindBy(xpath="//h1")
	WebElement txtele_header;
	
	@FindBy(xpath="//a[@title='sign in']")
	WebElement lnk_SignIn;
	
	@FindBy(xpath="//a[text()='Get started free']")
	WebElement btn_GetStartedFree;
	
	
	
	public browserstack_homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyHeaderText() {
		String headerText = txtele_header.getText();
		if (headerText.equals("App & Browser Testing Made Easy")) {
			System.out.println("page header displayed successfully");
		}else {
			System.out.println("failed to validate homepage header");
		}
	}
	
	public void alert() {
		Alert obj= driver.switchTo().alert();
		obj.dismiss();
	}
	public void clickSignInButton() {
		if (lnk_SignIn.isDisplayed()) {
			lnk_SignIn.click();
		}
	}
	public void clickGetStartedButton() {
		if (btn_GetStartedFree.isDisplayed()) {
			btn_GetStartedFree.click();
		}
	}
	
	
}