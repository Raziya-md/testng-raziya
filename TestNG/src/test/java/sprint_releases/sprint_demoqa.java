package sprint_releases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import pages.Demoqa_practiceform;

public class sprint_demoqa {
	WebDriver driver;

	@Parameters({ "URL" })
	@BeforeMethod
	public void URL_Launch(String URL) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void TC01_verifyhomepage() {
		Demoqa_practiceform obj = new Demoqa_practiceform(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		obj.textele_header();
		obj.txt_firstName();
		obj.txt_lastname();
		obj.txt_emailid();
		obj.btn_radiogender();
		obj.txt_mobile();
		obj.txt_subject();
		obj.chkb_hobbies();
		obj.txt_address();
		// obj.drpdn_state();
		// obj.drpdn_city();
		obj.btn_submit();
		obj.txt_Thankssubmit();

	}
}
