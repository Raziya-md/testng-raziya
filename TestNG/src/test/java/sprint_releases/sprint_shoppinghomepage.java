package sprint_releases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.shopping_Homepage;

public class sprint_shoppinghomepage {
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
	public void TC01_verifyhomepage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
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
	}
}