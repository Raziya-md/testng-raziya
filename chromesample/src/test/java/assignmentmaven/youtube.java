package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.youtube.com/";
		driver.get(Url);
		System.out.println(Url);
		WebElement signin = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
		signin.click();
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("raziyasulthana.mba@gmail.com");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		WebElement login = driver.findElement(By.id("recoveryIdentifierId"));
		login.sendKeys("raziyamd0786");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("raziya");
	}

}
