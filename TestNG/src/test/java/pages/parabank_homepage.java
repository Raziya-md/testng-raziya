package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class parabank_homepage {
WebDriver driver;

@FindBy(xpath="//img[@title='ParaBank']")
WebElement verify_pagetitle;

@FindBy(linkText="Register")
WebElement lnk_register;

@FindBy(xpath="//h1[text()='Signing up is easy!']")
WebElement verify_registerpage;

@FindBy(id="customer.firstName")
WebElement txtbox_firstname;

@FindBy(id="customer.lastName")
WebElement txtbox_lastname;

@FindBy(id="customer.address.street")
WebElement txtbox_address;

@FindBy(id="customer.address.city")
WebElement txtbox_city;

@FindBy(id="customer.address.state")
WebElement txtbox_state;

@FindBy(id="customer.address.zipCode")
WebElement txtbox_zipcode;

@FindBy(id="customer.phoneNumber")
WebElement txtbox_phoneno;

@FindBy(id="customer.ssn")
WebElement txtbox_ssn;

@FindBy(id="customer.username")
WebElement txtbox_username;

@FindBy(id="customer.password")
WebElement txtbox_password;

@FindBy(id="repeatedPassword")
WebElement txtbox_repeatpasd;

@FindBy(xpath="//input[@value='Register']")
WebElement btn_register;

@FindBy(xpath="//p[text()='Your account was created successfully. You are now logged in.']")
WebElement Verify_accountcreatedpage;

public parabank_homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void verify_pagetitle() {
	if(verify_pagetitle.isDisplayed()){
	System.out.println("verify pagetitle successfully");
}else {
	System.out.println("pagetitle not displayed successfully");
}
}
public void lnk_register() {
	lnk_register.click();
}
public void verify_registerpage() {
	verify_registerpage.getText();
	System.out.println(verify_registerpage.getText());
}
public void txtbox_firstname() {
	txtbox_firstname.clear();
	txtbox_firstname.sendKeys("Raziya");
}
public void txtbox_lastname() {
	txtbox_lastname.clear();
	txtbox_lastname.sendKeys("sulthana");
	}
public void txtbox_address() {
	txtbox_address.clear();
	txtbox_address.sendKeys("3-87,kuntloor");
}
public void txtbox_city() {
	txtbox_city.clear();
	txtbox_city.sendKeys("Hyderabad");
	}
public void txtbox_state() {
	txtbox_state.clear();
	txtbox_state.sendKeys("Telangana");
	}
public void txtbox_zipcode() {
	txtbox_zipcode.clear();
	txtbox_zipcode.sendKeys("501505");
}
public void txtbox_phoneno() {
	txtbox_phoneno.clear();
	txtbox_phoneno.sendKeys("6305064313");
		}
public void txtbox_ssn() {
	txtbox_ssn.clear();
	txtbox_ssn.sendKeys("+91");
}
public void txtbox_username() {
	txtbox_username.clear();
	txtbox_username.sendKeys("Raziya0786");
}
public void txtbox_password() {
	txtbox_password.clear();
	txtbox_password.sendKeys("Raziyamd0786");
}
public void txtbox_repeatpasd() {
	txtbox_repeatpasd.clear();
	txtbox_repeatpasd.sendKeys("Raziyamd0786");
}
public void btn_register() {
	btn_register.click();
}
public void Verify_accountcreatedpage() {
	Verify_accountcreatedpage.getText();
	System.out.println(Verify_accountcreatedpage.getText());
}
}
