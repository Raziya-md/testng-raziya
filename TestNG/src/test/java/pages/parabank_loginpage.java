package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class parabank_loginpage {
WebDriver driver;

@FindBy(xpath="//input[@name='username']")
WebElement txtbox_username;

@FindBy(xpath="//input[@name='password']")
WebElement txtbox_password;

@FindBy(xpath="//input[@type='submit']")
WebElement btn_login;

@FindBy(xpath="//p[text()=' Raziya sulthana']")
WebElement txt_verifyloginpage;

@FindBy(xpath="//a[text()='Open New Account']")
WebElement lnk_openaccount;

@FindBy(xpath="//h1[text()='Open New Account']")
WebElement txt_verifyaccountpage;

@FindBy(xpath="//select[@id='type']")   //SAVINGS
WebElement drpdwn_accounttype;

@FindBy(xpath="//select[@id='fromAccountId']")
WebElement drpdwn_accountid;

@FindBy(xpath="//input[@type='button']")
WebElement btn_opennewaccount;

@FindBy(xpath="//h1[text()='Account Opened!']")
WebElement txt_verifyaccountopened;

@FindBy(linkText="Accounts Overview")
WebElement lnk_accountsoverview;

@FindBy(xpath="(//h1[@class='title'])[1]")
WebElement txt_verifyaccoverviewpage;


public parabank_loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void txtbox_username() {
	txtbox_username.clear();
	txtbox_username.sendKeys("Raziya0786");
}
public void txtbox_password() {
	txtbox_password.clear();
	txtbox_password.sendKeys("Raziyamd0786");
}
public void btn_login() {
	btn_login.click();
}
public void txt_verifyloginpage() {
	txt_verifyloginpage.getText();
	System.out.println(txt_verifyloginpage.getText());
}
public void lnk_openaccount() {
	lnk_openaccount.click();
}
public void txt_verifyaccountpage() {
	txt_verifyaccountpage.getText();
	System.out.println(txt_verifyaccountpage.getText());
}
public void  drpdwn_accounttype(){
	Select obj=new Select(drpdwn_accounttype);
	obj.selectByVisibleText("SAVINGS");
}
public void drpdwn_accountid() {
	Select obj=new Select(drpdwn_accountid);
	obj.selectByIndex(0);
}
public void btn_opennewaccount() {
	btn_opennewaccount.click();
}
public void txt_verifyaccountopened() {
	if (txt_verifyaccountopened.isDisplayed()) {
		System.out.println("account opened successfully");
	}else {
		System.out.println("account opened not successfully");
	}
	}
public void lnk_accountsoverview() {
	lnk_accountsoverview.click();
}
public void txt_verifyaccoverviewpage() {
	txt_verifyaccoverviewpage.getText();
	System.out.println(txt_verifyaccoverviewpage.getText());
}

}
