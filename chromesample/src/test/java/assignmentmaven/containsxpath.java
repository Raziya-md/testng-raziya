package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/practice-project";
		driver.get(Url);
		System.out.println(Url);
		WebElement signin = driver.findElement(By.xpath("//input[contains(@id,'name')]"));
		signin.sendKeys("raziya");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		login.sendKeys("raziyasulthana.mba@gmail.com");
		WebElement chkbox = driver.findElement(By.xpath("//input[contains(@id,'agreeTerms')]"));
		chkbox.click();
		WebElement submit = driver.findElement(By.id("form-submit"));
		submit.click();

	}

}
