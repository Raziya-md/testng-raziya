package assignmentmaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class walmartxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.walmart.com/";
		driver.get(Url);
		System.out.println(Url);
		Alert obj = driver.switchTo().alert();
		obj.accept();
		obj.dismiss();

//WebElement alert = driver.findElement(By.id("bMUUDjavjuJbLKn"));
//alert.click();
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath("//div[contains(@style,'height')]"));
		account.click();
		WebElement signin = driver.findElement(By.xpath("//[contains(@data-testid,'sign-in')]"));
		signin.click();

	}

}
