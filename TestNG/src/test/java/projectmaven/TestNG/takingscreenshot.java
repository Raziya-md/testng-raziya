package projectmaven.TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.coffeecart_homepage;
import utilities.common_methods;

public class takingscreenshot {
	public class Taking_Screenshot {
		WebDriver driver;

		@Test
		public void TC_01_coffeecart() throws IOException {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://coffee-cart.app/");
			driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
			coffeecart_homepage obj_home = new coffeecart_homepage(driver);
			obj_home.txt_header();
			obj_home.txt_item1();

			TakesScreenshot SS = ((TakesScreenshot) driver);
			File srcFile = SS.getScreenshotAs(OutputType.FILE);
			File Destination = new File("D:\\eclipse-workspace\\TestNG\\reports\\shot.png");
			FileUtils.copyFile(srcFile, Destination);

		}
		@Test
		public void TC_02_TakingScreenshot() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://coffee-cart.app/");
			driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
			coffeecart_homepage obj_home = new coffeecart_homepage(driver);
			obj_home.txt_header();
			obj_home.txt_item1();
			obj_home.txt_item6();
			obj_home.txt_item9();
			obj_home.txt_promo();
			//Thread.sleep(1000);
			
			common_methods obj = new common_methods();
			obj.captureimage(driver);
		}
}
}