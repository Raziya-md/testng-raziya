package sprint_releases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.dmart_signin;

public class sprint_dmart {
WebDriver driver;

@BeforeMethod
public void Launch_url() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
}
@Test
public void dmart_signinpage() {
	dmart_signin obj = new dmart_signin(driver);
	obj.verify_signinpage();
}
}
