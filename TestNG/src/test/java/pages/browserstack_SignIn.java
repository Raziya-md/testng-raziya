package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class browserstack_SignIn {
WebDriver driver;

@FindBy(xpath = "(//h1)[2]")
WebElement txtelem_header;
@FindBy(xpath = "//input[@id='user_email_login']")
WebElement txtbox_BusinessEmail;
@FindBy(xpath = "//input[@id='user_password']")
WebElement txtbox_password;
@FindBy(xpath = "//input[@id='user_submit']")
WebElement txt_submit;
@FindBy (xpath = "(//a[@class='forgot-password-link'])[2]")
WebElement lnk_forgotpaw;

public browserstack_SignIn(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void verifyPageHeader() {
	String text = txtelem_header.getText();
	assertEquals("Sign in", text);
	}
public void enterBusinessEmail() {
	if (txtbox_BusinessEmail.isDisplayed()) {
	txtbox_BusinessEmail.clear();
	txtbox_BusinessEmail.sendKeys("raziyasulthana.mba@gmail.com");
	} else {
	System.out.println("Business Email Text box is not displayed on the page");
	}
	}
	public void enterPassword() {
	if (txtbox_password.isDisplayed()) {
	txtbox_password.clear();
	txtbox_password.sendKeys("raziyamd786");
	} else {
	System.out.println("Password Text box is not displayed on the page");
	}
	}
	public void clicksubmit() {
		if (txt_submit.isDisplayed()) {
			txt_submit.click();
		
		}
}
	public void  forgotpassword (){
		if (lnk_forgotpaw.isDisplayed()) {
			lnk_forgotpaw.click();
		}else {
			System.out.println("forgot pasw link not displayed");
		}
		
}
}
