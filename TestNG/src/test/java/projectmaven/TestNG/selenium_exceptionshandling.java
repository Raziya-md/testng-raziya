package projectmaven.TestNG;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selenium_exceptionshandling {
	WebDriver driver;

	@FindBy(xpath="//a[text()='cart (4)']")
	WebElement lnk_cart;

	@FindBy(xpath="//button[text()='Total: $36.00']")
	WebElement txt_verifycartpage;

	@FindBy(xpath="//div[text()='Item']")
	WebElement txt_verifyproduct;

	@FindBy(xpath="(//button[@aria-label='Add one Cafe Breve'])[2]")
	WebElement btn_increment;

	@FindBy(xpath="(//button[@aria-label='Remove one Cafe Breve'])[2]")
	WebElement btn_decrement;

	@FindBy (xpath="//button[text()='Total: $51.00']")
	WebElement txt_Totalamount;

	@FindBy(xpath="//h1[text()='Payment details']")
	WebElement txt_verifypaymentdetails;

	@FindBy(xpath="//input[@id='name']")
	WebElement txtbox_name;

	@FindBy(xpath="//input[@id='email']")
	WebElement txtbox_email;

	@FindBy(xpath="//input[@id='promotion']")
	WebElement chkbox_agree;

	@FindBy(id="submit-payment")
	WebElement btn_submit;

	public selenium_exceptionshandling(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void lnk_cart() {
		try {
		lnk_cart.click();
		}catch(Exception ex) {
			System.out.println("Exception");
		}
	}
	public void txt_verifycartpage() {
		try {
		txt_verifycartpage.getText();
		System.out.println(txt_verifycartpage.getText());
		}catch(NoSuchElementException ex) {
			System.out.println(ex );
		}catch(ElementNotInteractableException ex) {
			System.out.println("ElementNotInteractableException");
		}catch(TimeoutException ex) {
			System.out.println("TimeoutException");
		}
	}
	public void txt_verifyproduct() {
		try {
		txt_verifyproduct.getText();
		System.out.println(txt_verifyproduct.getText());
		}catch(NoSuchElementException ex) {
			System.out.println("NoSuchElementException");
		}catch(ElementNotVisibleException ex) {
			System.out.println("ElementNotVisibleException");
		}catch(TimeoutException ex) {
			System.out.println("TimeoutException");
		}finally {
			System.out.println("which execute later");
			//driver.close();
		}
	}
	public void btn_increment() {
		btn_increment.click();
	}
	public void btn_decrement() {
		btn_decrement.click();
	}
	public void txt_Totalamount() {
		txt_Totalamount.getText();
		System.out.println(txt_Totalamount.getText());
		txt_Totalamount.click();
	}
	public void txt_verifypaymentdetails() {
		txt_verifypaymentdetails.getText();
		System.out.println(txt_verifypaymentdetails.getText());
	}
	public void txtbox_name() {
		txtbox_name.clear();
		txtbox_name.sendKeys("Raziya");
	}
	public void txtbox_email() {
		txtbox_email.clear();
		txtbox_email.sendKeys("raziya@gmail.com");
	}
	public void chkbox_agree() {
		chkbox_agree.click();
	}
	public void btn_submit() {
		btn_submit.click();
	}
	}

	
