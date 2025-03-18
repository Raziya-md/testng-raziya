package sprint_releases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.greencart_homepage;
import pages.greenkart_orderplaced;
import pages.greenkart_proceedpage;

public class greenkart_sprint {
	WebDriver driver;

	@Parameters({ "URL" })
	@BeforeMethod
	public void URL_Launch(String URL) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void TC01_Verifyhomepage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		greencart_homepage obj = new greencart_homepage(driver);
		greenkart_orderplaced obj1 = new greenkart_orderplaced(driver);
		greenkart_proceedpage obj2 = new greenkart_proceedpage(driver);
		obj.txt_logo();
		obj.txt_serchbox();
		obj.txt_productname();
		obj.increment_product();
		obj.increment_product();
		obj.increment_product();
		obj.verify_incrementvalue();
		obj.decrement_product();
		obj.verify_decrementvalue();
		obj.btn_Addtocart();
		obj.lnk_addedtocart();
		obj.txt_productadded();
		obj.btn_proceed();
		obj1.txt_pagetitle();
		obj1.txt_productname();
		obj1.txt_Totalamount();
		obj1.btn_placeorder();
		obj2.txt_proceedpage();
		obj2.drp_country();
		obj2.chk_agree();
		obj2.btn_proceed();

	}

	@Test(enabled = false)
	public void TC02_verifypagetitle() throws InterruptedException {
		greencart_homepage obj = new greencart_homepage(driver);
		obj.txt_logo();
		obj.txt_serchbox();
		obj.txt_productname();
		Thread.sleep(10000);
		obj.increment_product();
		Thread.sleep(5000);
		obj.increment_product();
		Thread.sleep(5000);
		obj.increment_product();
		Thread.sleep(5000);
		obj.verify_incrementvalue();
		obj.decrement_product();
		Thread.sleep(8000);
		obj.verify_decrementvalue();
		obj.btn_Addtocart();
		Thread.sleep(5000);
		obj.lnk_addedtocart();
		obj.txt_productadded();
		obj.btn_proceed();
		greenkart_orderplaced obj1 = new greenkart_orderplaced(driver);
		obj1.txt_pagetitle();
		Thread.sleep(5000);
		obj1.txt_productname();
		Thread.sleep(5000);
		obj1.txt_Totalamount();
		obj1.btn_placeorder();

	}

	@Test(enabled = false)
	public void TC03_proceedpage() throws InterruptedException {
		greencart_homepage obj = new greencart_homepage(driver);
		obj.txt_logo();
		obj.txt_serchbox();
		obj.txt_productname();
		Thread.sleep(8000);
		obj.increment_product();
		Thread.sleep(5000);
		obj.increment_product();
		Thread.sleep(5000);
		obj.increment_product();
		Thread.sleep(5000);
		obj.verify_incrementvalue();
		obj.decrement_product();
		Thread.sleep(8000);
		obj.verify_decrementvalue();
		obj.btn_Addtocart();
		Thread.sleep(5000);
		obj.lnk_addedtocart();
		obj.txt_productadded();
		obj.btn_proceed();
		greenkart_orderplaced obj1 = new greenkart_orderplaced(driver);
		obj1.txt_pagetitle();
		Thread.sleep(5000);
		obj1.txt_productname();
		Thread.sleep(5000);
		obj1.txt_Totalamount();
		obj1.btn_placeorder();
		greenkart_proceedpage obj2 = new greenkart_proceedpage(driver);
		obj2.txt_proceedpage();
		obj2.drp_country();
		Thread.sleep(1000);
		obj2.chk_agree();
		obj2.btn_proceed();
		Thread.sleep(1000);
		// obj2.txt_Thankyoupage();
	}
}
