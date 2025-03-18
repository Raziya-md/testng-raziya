package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rahulshettyshopping_loginpage {
WebDriver driver;

@FindBy(xpath="//label[text()='Register to sign in with your personal account']")
WebElement verify_loginpage;

@FindBy(xpath="//input[@id='userEmail']")
WebElement txt_email;

@FindBy(xpath="//input[@id='userPassword']")
WebElement txt_passw;

@FindBy(xpath="//input[@id='login']")
WebElement btn_login;

//after login 

@FindBy(xpath="//h3[text()='Automation']")   
WebElement txt_pageheading;

@FindBy(xpath="(//button[@class='btn w-40 rounded'])[2]")
WebElement btn_View;

@FindBy(xpath="//h2[text()='qwerty']")
WebElement txt_productpageheader;

@FindBy(xpath="//h3[text()='$ 11500']")
WebElement txt_productprice;

@FindBy(xpath="//button[text()='Add to Cart']")
WebElement btn_Addtocart;

@FindBy(xpath="//a[text()='Continue Shopping']")
WebElement btn_continueshopping;

@FindBy(xpath="(//button[@class='btn btn-custom'])[3]")
WebElement btn_Cart;

@FindBy(xpath="//h1[text()='My Cart']")
WebElement txt_cartpageheader;

@FindBy(xpath="//h3[text()='qwerty']")
WebElement txt_verifyproductpresent;

@FindBy(xpath="//button[@class='btn btn-danger']")
WebElement btn_deletefromcart;

@FindBy(xpath="//button[@type='button']")
WebElement btn_continueshoppingformcart;

@FindBy(xpath="(//input[@placeholder='search'])[2]")
WebElement searchbox;

@FindBy(xpath="//div[text()='Showing 2 results   | ']")
WebElement search_product;

@FindBy (xpath="(//button[text()=' View'])[1]")
WebElement btn_view;

@FindBy(xpath="//h2[text()='LG Refrigerator']")
WebElement txt_verifythepage;

@FindBy(xpath="//button[text()='Add to Cart']")
WebElement btn_addtocart;

@FindBy(xpath="//a[@class='continue']")
WebElement lnk_continue;

@FindBy(xpath="(//input[@name='minPrice'])[2]")
WebElement txtbox_minprice;

@FindBy(xpath="(//input[@name='maxPrice'])[2]")
WebElement txtbox_maxprice;

@FindBy(xpath="//div[@id='res']")
WebElement verify_result;

@FindBy(xpath="(//button[text()=' Add To Cart'])[1]")
WebElement btn_addcart;

@FindBy(xpath="(//button[@type='button'])[2]")
WebElement btn_checkout;

@FindBy(xpath="//div[text()=' Payment Method ']")
WebElement verify_paymentpage;

@FindBy(xpath="(//input[@class='input txt'])[1]")
WebElement txt_cvvcode;

@FindBy(xpath="(//input[@class='input txt'])[2]")
WebElement txt_nameoncard;

@FindBy(xpath="//input[@name='coupon']")
WebElement txt_coupon;

@FindBy(xpath="//button[text()='Apply Coupon']")
WebElement btn_applycoupon;

@FindBy (xpath="//input[@placeholder='Select Country']")
WebElement txt_country;

@FindBy(xpath="//a[text()='Place Order ']")
WebElement lnk_placeorder;

@FindBy(xpath="//h1[text()=' Thankyou for the order. ']")
WebElement verify_thankupage;

@FindBy(xpath="//button[text()='Click To Download Order Details in CSV']")
WebElement btn_dwncsv;

@FindBy (xpath="//button[text()='Click To Download Order Details in Excel']")
WebElement btn_exceldwn;

public rahulshettyshopping_loginpage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
public void verify_loginpage() {
	if(verify_loginpage.isDisplayed()) {
	verify_loginpage.getText();
	System.out.println(verify_loginpage.getText());
}else {
	System.out.println("login page not displaced");
}
}
	public void txt_email() {
		txt_email.clear();
		txt_email.sendKeys("raziyasulthana.mba@gmail.com");
			}
	public void txt_passw() {
		txt_passw.clear();
		txt_passw.sendKeys("Raziyamd@0786");
	}
	public void btn_login() {
		btn_login.click();
	}
	public void txt_pageheading() {
		txt_pageheading.getText();
		System.out.println(txt_pageheading.getText());
	}
	public void btn_View() {
		btn_View.click();
	}
	public void txt_productpageheader() {
		txt_productpageheader.getText();
		System.out.println(txt_productpageheader.getText());
	}
	public void txt_productprice() {
		txt_productprice.getText();
		System.out.println(txt_productprice.getText());
	}
	public void btn_Addtocart() {
		btn_Addtocart.click();
	}
	public void btn_continueshopping() {
		btn_continueshopping.click();
	}
	public void btn_Cart() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",btn_Cart);
		js.executeScript("window.scrollBy,(0,document.body.scrollHeight)");
	//btn_Cart.click();
	}
	public void txt_cartpageheader() {
		txt_cartpageheader.getText();
		System.out.println(txt_cartpageheader.getText());
	}
	public void txt_verifyproductpresent() {
		txt_verifyproductpresent.getText();
		System.out.println(txt_verifyproductpresent.getText());
	}
	public void btn_deletefromcart() {
		btn_deletefromcart.click();
	}
	public void btn_continueshoppingformcart() {
		btn_continueshoppingformcart.click();
	}
	public void searchbox() {
		searchbox.clear();
		searchbox.sendKeys("LG Refrigerator");
		searchbox.sendKeys(Keys.TAB);
	}
	public void search_product() {
		search_product.getText();
		System.out.println(search_product.getText());
	}
	public void btn_view() {
		btn_view.click();
	}
	public void txt_verifythepage() {
		txt_verifythepage.getText();
		System.out.println(txt_verifythepage.getText());
	}
	public void btn_addtocart() {
		btn_addtocart.click();	
	}
	public void lnk_continue() {
		lnk_continue.click();
	}
public void txtbox_minprice() {
	txtbox_minprice.clear();
	txtbox_minprice.sendKeys("1000");
	//txtbox_minprice.sendKeys(Keys.TAB);
	//txtbox_minprice.sendKeys(Keys.TAB);
}
public void txtbox_maxprice() {
	txtbox_maxprice.clear();
	txtbox_maxprice.sendKeys("100000");
	txtbox_maxprice.sendKeys(Keys.TAB);
	txtbox_maxprice.sendKeys(Keys.TAB);
}
public void verify_result() {
	verify_result.getText();
	System.out.println(verify_result.getText());
}
public void btn_addcart() {
		btn_addcart.click();
		
}
public void btn_checkout() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",btn_checkout);
		//btn_checkout.click();
		}
public void verify_paymentpage() {
	verify_paymentpage.getText();
	System.out.println(verify_paymentpage.getText());
}
public void txt_cvvcode() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	txt_cvvcode.clear();
	js.executeScript("arguments[0].value='1234';",txt_cvvcode);
	//txt_cvvcode.sendKeys("1234");
}
public void txt_nameoncard() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	txt_nameoncard.clear();
	js.executeScript("arguments[0].value='raziya sulthana';",txt_nameoncard);
	//txt_nameoncard.sendKeys("raziya sulthana");
}
public void txt_coupon() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	txt_coupon.clear();
	js.executeScript("arguments[0].value='123456';",txt_coupon);
	//txt_coupon.sendKeys("123456");
}
public void btn_applycoupon() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",btn_applycoupon);
	//btn_applycoupon.click();
}
public void txt_country() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	txt_country.clear();
	js.executeScript("arguments[0].value='India';",txt_country);
	//txt_country.sendKeys("India");
	txt_country.sendKeys(Keys.TAB);
	txt_country.sendKeys(Keys.TAB);
}
public void lnk_placeorder() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",lnk_placeorder);
	//lnk_placeorder.click();
}
public void verify_thankupage() {
	verify_thankupage.getText();
	System.out.println(verify_thankupage.getText());
}
public void btn_dwncsv() {
	btn_dwncsv.click();
}
public void btn_exceldwn() {
	btn_exceldwn.click();
}
}

