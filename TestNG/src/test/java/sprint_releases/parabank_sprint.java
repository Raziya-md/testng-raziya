package sprint_releases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.parabank_homepage;
import pages.parabank_loginpage;

public class parabank_sprint {
	WebDriver driver;

	@Parameters({ "URL" })
	@BeforeMethod
	public void Launch_URL() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void TC01_Verifyhomepage() {
		parabank_homepage obj = new parabank_homepage(driver);
		obj.verify_pagetitle();
		obj.lnk_register();
		obj.verify_registerpage();
		obj.txtbox_firstname();
		obj.txtbox_lastname();
		obj.txtbox_address();
		obj.txtbox_city();
		obj.txtbox_state();
		obj.txtbox_zipcode();
		obj.txtbox_phoneno();
		obj.txtbox_ssn();
		obj.txtbox_username();
		obj.txtbox_password();
		obj.txtbox_repeatpasd();
		obj.btn_register();
		// obj.Verify_accountcreatedpage();
	}

	@Test
	public void login() throws InterruptedException {
		parabank_homepage obj = new parabank_homepage(driver);
		parabank_loginpage obj1 = new parabank_loginpage(driver);
		obj.verify_pagetitle();
		// Thread.sleep(1000);
		obj1.txtbox_username();
		obj1.txtbox_password();
		obj1.btn_login();
		obj1.txt_verifyloginpage();
		obj1.lnk_openaccount();
		obj1.txt_verifyaccountpage();
		obj1.drpdwn_accounttype();
		obj1.drpdwn_accountid();
		obj1.btn_opennewaccount();
		obj1.txt_verifyaccountopened();
		obj1.lnk_accountsoverview();
		obj1.txt_verifyaccoverviewpage();
	}
	/*
	 * @AfterMethod public void close_browser() { driver.close(); }
	 */
}