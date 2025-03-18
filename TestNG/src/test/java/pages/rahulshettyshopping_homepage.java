package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class rahulshettyshopping_homepage {
WebDriver driver;

@FindBy(xpath="//h3[text()='We Make Your Shopping Simple']")
WebElement txt_verifyhomepage;

@FindBy(xpath="//a[text()='Register']")
WebElement lnk_register;

@FindBy(xpath="//h1[text()='Register']")
WebElement txt_verifyregisterpage;

@FindBy(xpath="//input[@id='firstName']")
WebElement txt_firstname;

@FindBy(xpath="//input[@id='lastName']")
WebElement txt_lastname;

@FindBy(xpath="//input[@id='userEmail']")
WebElement txt_emailid;

@FindBy(xpath="//input[@id='userMobile']")
WebElement txt_mobileno;

@FindBy(xpath="//select[@formcontrolname='occupation']")
WebElement drpdwn_occupation;

@FindBy(xpath="//input[@value='Female']")
WebElement radio_gender;

@FindBy(xpath="//input[@id='userPassword']")
WebElement txt_password;

@FindBy(xpath="//input[@id='confirmPassword']")
WebElement txt_confirmpassword;

@FindBy(xpath="//input[@type='checkbox']")
WebElement chk_confirmage;

@FindBy(xpath="//input[@id='login']")
WebElement btn_register;

@FindBy(xpath="//h1[text()='Account Created Successfully']")
WebElement txt_registersuccessfull;


public rahulshettyshopping_homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
public void txt_verifyhomepage() {
	txt_verifyhomepage.getText();
	System.out.println(txt_verifyhomepage.getText());
	}
public void lnk_register() {
	lnk_register.click();
}
public void txt_verifyregisterpage() {
	if (txt_verifyregisterpage.isDisplayed()) {
		txt_verifyregisterpage.getText();
		System.out.println(txt_verifyregisterpage.getText());
	}else {
		System.out.println("register page not displayed");
	}
}
public void txt_firstname() {
	txt_firstname.clear();
	txt_firstname.sendKeys("Raziya");
}
public void txt_lastname() {
	txt_lastname.click();
	txt_lastname.sendKeys("Sulthana");
}
public void txt_emailid() {
	txt_emailid.clear();
	txt_emailid.sendKeys("raziyasulthana.mba@gmail.com");
}
public void txt_mobileno() {
	txt_mobileno.clear();
	txt_mobileno.sendKeys("6305064313");
}
public void drpdwn_occupation() {
	Select obj=new Select(drpdwn_occupation);
	obj.selectByValue("1: Doctor");
			}
public void radio_gender() {
	radio_gender.click();
}
public void txt_password() {
	txt_password.clear();
	txt_password.sendKeys("Raziyamd@0786");			
}
public void txt_confirmpassword() {
	txt_confirmpassword.click();
	txt_confirmpassword.sendKeys("Raziyamd@0786");
}
public void chk_confirmage() {
	chk_confirmage.click();
}
public void btn_register() {
	btn_register.click();
}
public void txt_registersuccessfull() {
	if (txt_registersuccessfull.isDisplayed()) {
		txt_registersuccessfull.getText();
		System.out.println(txt_registersuccessfull.getText());
	}else {
		System.out.println("register page not displayed");
	}
}
}
