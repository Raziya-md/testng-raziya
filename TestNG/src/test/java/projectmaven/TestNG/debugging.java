package projectmaven.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.coffeecart_cartpage;
import pages.coffeecart_homepage;

public class debugging {
	WebDriver driver;
	
	@Parameters({"URL"})
	@Test
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

}
