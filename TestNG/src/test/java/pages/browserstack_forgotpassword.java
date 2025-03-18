package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class browserstack_forgotpassword {
WebDriver driver;


@FindBy (className ="heading")
WebElement text_heading;

@FindBy (xpath= "//input[@id='user_email_login']")
WebElement txt_email;

@FindBy(xpath= "//input[@id='reset_submit']")
WebElement btn_reset;

public browserstack_forgotpassword (WebDriver driver){
	this.driver= driver;
		PageFactory.initElements(driver, this); 
}
public void verifypageheading() {
	String text = text_heading.getText();
	assertEquals("Forgot your password?",text);
}
public void enteremail() {
	if (txt_email.isDisplayed()) {
		txt_email.clear();
		txt_email.sendKeys("raziyasulthana.mba@gmail.com");
			}else {
				System.out.println("email text box is not displayed");
			}
}
public void resetbutton() {
		if(btn_reset.isDisplayed()) {
			btn_reset.click();
		}else {
			System.out.println("reset button not displayed");
		}
	}
}


