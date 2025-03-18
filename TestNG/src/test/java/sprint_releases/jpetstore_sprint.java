package sprint_releases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.jpetstore_homepage;
import pages.jpetstore_loginpage;

public class jpetstore_sprint {
	WebDriver driver;

	@Parameters({ "APPURL" })
	@BeforeMethod
	public void Launch_url(String APPURL) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(APPURL);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}

	@Test()
	public void verify_homepage() throws InterruptedException {
		jpetstore_homepage obj = new jpetstore_homepage(driver);
		obj.verify_pagetitle();
		obj.click_signin();
		obj.verify_signinpage();
		obj.lnk_register();
		obj.verify_registerpage();
		Thread.sleep(1000);
		obj.txt_userid();
		obj.txt_paswd();
		obj.txt_rptpaswd();
		obj.txt_fstname();
		obj.txt_lastname();
		obj.txt_email();
		obj.txt_phone();
		obj.txt_add1();
		obj.txt_add2();
		obj.txt_city();
		obj.txt_state();
		obj.txt_zipcode();
		obj.txt_country();
		obj.drpdwn_category();
		obj.chk_list();
		obj.chk_banner();
		obj.btn_saveaccount();
	}

	@Test
	public void verify_loginpage() throws InterruptedException {
		jpetstore_homepage obj = new jpetstore_homepage(driver);
		jpetstore_loginpage obj1 = new jpetstore_loginpage(driver);
		obj.verify_pagetitle();
		obj.click_signin();
		obj1.Verify_pageheader();
		obj1.enter_username();
		obj1.enter_password();
		obj1.click_login();
		obj1.Verify_loginsccess();
		obj1.lnk_fish();
		obj1.verify_fishpage();
		obj1.lnk_returnmenu();
		obj1.lnk_dog();
		obj1.verify_dogpage();
		obj1.lnk_product();
		obj1.verify_productpage();
		obj1.lnk_itemid();
		obj1.verify_itempage();
		obj1.verify_dogprice();
		obj1.lnk_addtocart();
		obj1.verify_cartpage();
		obj1.verify_quantity();
		obj1.btn_updatecart();
		obj1.lnk_proceedtocheck();
		obj1.verify_paymentpage();
		obj1.drpdw_cardtype();
		obj1.txtbox_cardnumber();
		obj1.txtbox_expirydate();
		obj1.verify_name();
		obj1.chk_shipaddress();
		obj1.btn_continue();
		obj1.verify_shippingaddresspage();
		obj1.btn_continue();
		obj1.verify_orderconfirmationpage();
		obj1.lnk_confirm();
		obj1.verify_thankyoupage();

	}

	@AfterMethod
	public void close_url() {
		driver.close();

	}
}