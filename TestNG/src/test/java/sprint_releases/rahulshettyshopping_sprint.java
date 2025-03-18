package sprint_releases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.rahulshettyshopping_homepage;
import pages.rahulshettyshopping_loginpage;

public class rahulshettyshopping_sprint {
	WebDriver driver;

	@BeforeMethod
	public void Launch_URL() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		// driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}

	@Test(enabled = false)
	public void verify_homepage() {
		rahulshettyshopping_homepage obj = new rahulshettyshopping_homepage(driver);
		obj.txt_verifyhomepage();
		obj.lnk_register();
		obj.txt_verifyregisterpage();
		obj.txt_firstname();
		obj.txt_lastname();
		obj.txt_emailid();
		obj.txt_mobileno();
		obj.drpdwn_occupation();
		obj.radio_gender();
		obj.txt_password();
		obj.txt_confirmpassword();
		obj.chk_confirmage();
		obj.btn_register();
		obj.txt_registersuccessfull();
	}

	@Test
	public void verify_loginpage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		rahulshettyshopping_loginpage obj1 = new rahulshettyshopping_loginpage(driver);
		obj1.verify_loginpage();
		obj1.txt_email();
		obj1.txt_passw();
		obj1.btn_login();
		obj1.txt_pageheading();
		obj1.btn_View();
		obj1.txt_productpageheader();
		obj1.txt_productprice();
		obj1.btn_Addtocart();
		obj1.btn_continueshopping();
		obj1.btn_Cart();
		obj1.txt_cartpageheader();
		obj1.txt_verifyproductpresent();
		obj1.btn_deletefromcart();
		obj1.btn_continueshoppingformcart();
		obj1.searchbox();
		obj1.search_product();
		obj1.btn_view();
		obj1.txt_verifythepage();
		obj1.btn_addtocart();
		obj1.lnk_continue();
		obj1.txtbox_minprice();
		obj1.txtbox_maxprice();
		obj1.verify_result();
		obj1.btn_addcart();
		obj1.btn_Cart();
		obj1.txt_cartpageheader();
		obj1.txt_verifyproductpresent();
		obj1.btn_checkout();
		obj1.verify_paymentpage();
		obj1.txt_cvvcode();
		obj1.txt_nameoncard();
		obj1.txt_coupon();
		obj1.btn_applycoupon();
		obj1.txt_country();
		obj1.lnk_placeorder();
		obj1.verify_thankupage();
		obj1.btn_dwncsv();
		obj1.btn_exceldwn();
	}
}
