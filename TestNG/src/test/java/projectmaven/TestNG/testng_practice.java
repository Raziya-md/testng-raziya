package projectmaven.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

import pages.coffeecart_cartpage;
import pages.coffeecart_homepage;
import pages.jpetstore_homepage;
import pages.jpetstore_loginpage;
import pages.shopping_Homepage;

public class testng_practice {
	WebDriver driver;
	
@Parameters({"URL"})
@Test(groups= {"sanity"})
public void coffee_cart(String URL) {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
driver = new ChromeDriver();
driver.get(URL);
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
	coffeecart_homepage obj = new coffeecart_homepage(driver);
	coffeecart_cartpage obj1 = new coffeecart_cartpage(driver);
	obj.txt_header();
	obj.txt_item1();
	obj.txt_item6();
	obj.txt_item9();
	obj.txt_promo();
	obj.btn_offer();
	obj1.lnk_cart();
	obj1.txt_verifycartpage();
	obj1.txt_verifyproduct();
	obj1.btn_increment();
	obj1.btn_increment();
	obj1.btn_decrement();
	obj1.txt_Totalamount();
	obj1.txt_verifypaymentdetails();
	obj1.txtbox_name();
	obj1.txtbox_email();
	obj1.chkbox_agree();
	obj1.btn_submit();
	driver.close();
}

	@Parameters({"APPURL"})
	@Test //(dependsOnMethods="coffee_cart",groups={"smoke"})
	public void jpetstore(String APPURL) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\MUBINA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get(APPURL);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
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
		driver.close();

	}
	@Parameters({"shopping_URL"})
@Test(groups= {"regression"})
	public void shoppingcart(String shopping_URL) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(shopping_URL);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		shopping_Homepage obj = new shopping_Homepage(driver);
		obj.verify_homepage();
		obj.btn_size();
		obj.btn_Addtocart1();
		obj.link_closecart();
		obj.btn_Addtocart5();
		obj.link_closecart();
		obj.btn_Addtocart8();
		obj.link_closecart();
		obj.btn_cart();
		obj.txt_verifyproduct();
		obj.btn_increment();
		obj.btn_increment();
		obj.btn_decrement();
		obj.verify_subtotal();
		obj.btn_checkout();
		driver.close();
	}
	
}


