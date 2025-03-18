package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class jpetstore_homepage {
WebDriver driver;

@FindBy(xpath="//img[@src='../images/logo-topbar.svg']")
WebElement verify_pagetitle;

@FindBy(xpath="//a[text()='Sign In']")
WebElement click_signin;

@FindBy(xpath="//div[@id='CTA']")
WebElement verify_signinpage;

@FindBy(xpath="//a[text()='Register Now!']")
WebElement lnk_register;

@FindBy(xpath="//h3[text()='User Information']")
WebElement verify_registerpage;

@FindBy(xpath="//input[@name='username']")
WebElement txt_userid;

@FindBy(xpath="//input[@name='password']")
WebElement txt_paswd;

@FindBy(xpath="//input[@name='repeatedPassword']")
WebElement txt_rptpaswd;

@FindBy(xpath="//input[@name='account.firstName']")
WebElement txt_fstname;

@FindBy(xpath="//input[@name='account.lastName']")
WebElement txt_lastname;

@FindBy(xpath="//input[@name='account.email']")
WebElement txt_email;

@FindBy(xpath="//input[@name='account.phone']")
WebElement txt_phone;

@FindBy(xpath="//input[@name='account.address1']")
WebElement txt_add1;

@FindBy(xpath="//input[@name='account.address2']")
WebElement txt_add2;

@FindBy(xpath="//input[@name='account.city']")
WebElement txt_city;

@FindBy(xpath="//input[@name='account.state']")
WebElement txt_state;

@FindBy(xpath="//input[@name='account.zip']")
WebElement txt_zipcode;

@FindBy(xpath="//input[@name='account.country']")
WebElement txt_country;

@FindBy(xpath="//select[@name='account.favouriteCategoryId']")
WebElement drpdwn_category;

@FindBy(xpath="//input[@name='account.listOption']")
WebElement chk_list;

@FindBy(xpath="//input[@name='account.bannerOption']")
WebElement chk_banner;

@FindBy(xpath="//input[@name='newAccount']")
WebElement btn_saveaccount;

public jpetstore_homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void verify_pagetitle() {
	//String title=verify_pagetitle.getText();
	verify_pagetitle.getText();
	if (verify_pagetitle.isDisplayed()) {
		System.out.println("pagetitle displayed");
	}else {
		System.out.println("pagetitle not displayed");
	}
	}
public void click_signin() {
	click_signin.click();
}
public void verify_signinpage() {
	verify_signinpage.getText();
	if (verify_signinpage.isDisplayed()) {
		System.out.println("signin page displayed successfully");
	}else {
		System.out.println("signin page not displayed successfully");
	}
}
public void lnk_register() {
	lnk_register.click();
}
public void verify_registerpage() {
	verify_registerpage.getText();
	if (verify_registerpage.isDisplayed()) {
		System.out.println("register page displayed successfully");
	}else {
		System.out.println("register page not displayed successfully");
	}
}
public void txt_userid() {
	txt_userid.clear();
	txt_userid.sendKeys("raziya sulthana");
}
public void txt_paswd() {
	txt_paswd.clear();
	txt_paswd.sendKeys("raziyamd786");
}
public void txt_rptpaswd() {
	txt_rptpaswd.clear();
	txt_rptpaswd.sendKeys("raziyamd786");
}
public void txt_fstname() {
	txt_fstname.clear();
	txt_fstname.sendKeys("raziya");
}
public void txt_lastname() {
	txt_lastname.clear();
	txt_lastname.sendKeys("sulthana");
}
public void txt_email() {
	txt_email.clear();
	txt_email.sendKeys("raziyasulthana.mba@gmail.com");
}
public void txt_phone() {
	txt_phone.clear();
	txt_phone.sendKeys("6305064313");
}
public void txt_add1() {
	txt_add1.clear();
	txt_add1.sendKeys("kuntloor");
}
public void txt_add2() {
	txt_add2.clear();
	txt_add2.sendKeys("near edamma temple");
}
public void txt_city() {
	txt_city.clear();
	txt_city.sendKeys("Hyderabad");
}
public void txt_state() {
	txt_state.clear();
	txt_state.sendKeys("Telangana");
}
public void txt_zipcode() {
	txt_zipcode.clear();
	txt_zipcode.sendKeys("501505");
}
public void txt_country() {
	txt_country.clear();
	txt_country.sendKeys("India");
}
public void drpdwn_category() {
		Select obj=new Select(drpdwn_category);
	obj.selectByIndex(4);
	}
public void chk_list() {
	chk_list.click();
}
public void chk_banner() {
	chk_banner.click();
}
public void btn_saveaccount() {
	btn_saveaccount.click();
}
}
