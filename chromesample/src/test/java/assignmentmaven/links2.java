package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(Url);
		System.out.println(driver.getCurrentUrl());
		// WebElement linktext=driver.findElement(By.linkText("Discount Coupons"));
		// linktext.click();
		WebElement Partiallinktext = driver.findElement(By.partialLinkText("Coupons"));
		Partiallinktext.click();

	}

}
