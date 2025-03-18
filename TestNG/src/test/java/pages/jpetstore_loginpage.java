package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class jpetstore_loginpage {
	WebDriver driver;

	@FindBy(xpath="//p[text()='Please enter your username and password.']")
	WebElement txt_pageheader;
	@FindBy(xpath="//input[@name='username']")
	WebElement txtbox_username;
	@FindBy(xpath="//input[@name='password']")
	WebElement txtbox_passwd;
	@FindBy(xpath="//input[@name='signon']")
	WebElement btn_login;
	@FindBy(xpath="//div[@id='WelcomeContent']")
	WebElement txt_verifylogin;
	
	//after login
	
	@FindBy(xpath="//img[@src='../images/sm_fish.gif']")
	WebElement lnk_fish;
	
	@FindBy(xpath="//h2[text()='Fish']")
	WebElement verify_fishpage;
	
	@FindBy(xpath="//a[text()='Return to Main Menu']")
	WebElement lnk_returnmenu;
	
	@FindBy(xpath="//img[@src='../images/sm_dogs.gif']")
	WebElement lnk_dog;
	
	@FindBy(xpath="//h2[text()='Dogs']")
	WebElement verify_dogpage;
	
	@FindBy(xpath="//a[text()='K9-BD-01']")
	WebElement lnk_product;
	
	@FindBy(xpath="//h2[text()='Bulldog']")
	WebElement verify_productpage;
	
	@FindBy(xpath="//a[text()='EST-6']")
	WebElement lnk_itemid;
	
	@FindBy(xpath="//td[text()='Friendly dog from England']")
	WebElement verify_itempage;
	
	@FindBy(xpath="//td[text()='$18.50']")
	WebElement verify_dogprice;
	
	@FindBy(xpath="//a[text()='Add to Cart']")
	WebElement lnk_addtocart;
	
	@FindBy(xpath="//h2[text()='Shopping Cart']")
	WebElement verify_cartpage;
	
	@FindBy(xpath="//input[@value='1']")
	WebElement verify_quantity;
	
	@FindBy(xpath="//input[@value='Update Cart']")
	WebElement btn_updatecart;
	
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	WebElement lnk_proceedtocheck;
	
	@FindBy(xpath="//th[text()='Payment Details']")
	WebElement verify_paymentpage;
	
	@FindBy(xpath="//select[@name='order.cardType']")  //MasterCard
	WebElement drpdw_cardtype;
	
	@FindBy(xpath="//input[@name='order.creditCard']")
	WebElement txtbox_cardnumber;
	
	@FindBy(xpath="//input[@name='order.expiryDate']")
	WebElement txtbox_expirydate;
	
	@FindBy(xpath="//input[@value='raziya']")
	WebElement verify_name;
	
	@FindBy(xpath="//input[@name='shippingAddressRequired']")
	WebElement chk_shipaddress;
	
	@FindBy(xpath="//input[@name='newOrder']")
	WebElement btn_continue;
	
	@FindBy(xpath="//th[text()='Shipping Address']")
	WebElement verify_shippingaddresspage;
	
@FindBy(xpath="//b[text()='Order']")
WebElement verify_orderconfirmationpage;

@FindBy(xpath="//a[text()='Confirm']")
WebElement lnk_confirm;

@FindBy(xpath="//li[text()='Thank you, your order has been submitted.']")
WebElement verify_thankyoupage;
	
	public jpetstore_loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Verify_pageheader() {
		txt_pageheader.getText();
		if(txt_pageheader.isDisplayed()) {
			System.out.println(txt_pageheader.getText());
		}else {
			System.out.println("Page header is not displayed");
		}
	}
	public void enter_username() {
		txtbox_username.clear();
		txtbox_username.sendKeys("raziya sulthana");
	}
	public void enter_password() {
		txtbox_passwd.clear();
		txtbox_passwd.sendKeys("raziyamd786");
	}
	public void click_login() {
		if(btn_login.isDisplayed()) {
		btn_login.click();
		}else {
			System.out.println("Login button is not displayed");
		}
	}
	public void Verify_loginsccess() {
		txt_verifylogin.getText();
		if(txt_verifylogin.isDisplayed()) {
			System.out.println(txt_verifylogin.getText());
		}else {
			System.out.println("Login unsuccessful");
		}
}
	public void lnk_fish() {
		if (lnk_fish.isDisplayed()) {
			System.out.println("fish link is displayed");
				lnk_fish.click();
		}else{
			System.out.println("fish link is not  displayed");}
		}
	public void verify_fishpage() {
		verify_fishpage.getText();
				System.out.println(verify_fishpage.getText());
	}
	public void lnk_returnmenu() {
		lnk_returnmenu.click();
	}
	public void lnk_dog() {
		lnk_dog.click();
	}
	public void verify_dogpage() {
		verify_dogpage.getText();
		System.out.println(verify_dogpage.getText());
	}
	public void lnk_product() {
		lnk_product.click();
	}
	public void verify_productpage() {
		verify_productpage.getText();
		System.out.println(verify_productpage.getText());
	}
	public void lnk_itemid() {
		lnk_itemid.click();
	}
	public void verify_itempage() {
		String item=verify_itempage.getText();
		if(item.equals("Friendly dog from England")) {
			System.out.println("itempage displayed successfully");
			System.out.println(verify_itempage.getText());
		}else {
			System.out.println("itempage not displayed");
		}
	}
	public void verify_dogprice() {
		verify_dogprice.getText();
		System.out.println(verify_dogprice.getText());
	}
	public void lnk_addtocart() {
		if(lnk_addtocart.isDisplayed()) {
			System.out.println("yes addtocart button dispalyed");
		lnk_addtocart.click();
	}else {
		System.out.println("no, addtocart button not dispalyed");
	}
}
	public void verify_cartpage() {
		verify_cartpage.getText();
		System.out.println(verify_cartpage.getText());
	}
	public void verify_quantity() {
				if (verify_quantity.isDisplayed()) {
			System.out.println("quantity page displaced successfully");
		}else {
			System.out.println("quantity page not  displaced successfully");
		}
	}
	public void btn_updatecart() {
		btn_updatecart.click();
	}
	public void lnk_proceedtocheck() {
		lnk_proceedtocheck.click();
	}
	public void verify_paymentpage() {
		verify_paymentpage.getText();
		System.out.println(verify_paymentpage.getText());
	}
	public void drpdw_cardtype() {
		Select obj=new Select(drpdw_cardtype);
		obj.selectByValue("MasterCard");
	}
	public void txtbox_cardnumber() {
		txtbox_cardnumber.clear();
		txtbox_cardnumber.sendKeys("111 1111 1111 1111");
	}
	public void txtbox_expirydate() {
		txtbox_expirydate.clear();
		txtbox_expirydate.sendKeys("12/25");
	}
	public void verify_name() {
		verify_name.getText();
		System.out.println(verify_name.getText());
	}
	public void chk_shipaddress() {
		chk_shipaddress.click();
	}
	public void btn_continue() {
		btn_continue.click();
	}
	public void verify_shippingaddresspage() {
		verify_shippingaddresspage.getText();
		System.out.println(verify_shippingaddresspage.getText());
			}
	public void verify_orderconfirmationpage() {
		verify_orderconfirmationpage.getText();
		System.out.println(verify_orderconfirmationpage.getText());
	}
	public void lnk_confirm() {
		lnk_confirm.click();
	}
	public void verify_thankyoupage() {
		verify_thankyoupage.getText();
		System.out.println(verify_thankyoupage.getText());
			}
}
