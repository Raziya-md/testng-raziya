package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F1%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F1%2F&ifkv=AcMMx-cP8OwGFvhNfBFYkJp4BHt0wNokRm5822WWByH3Gw82oLm3k_xq2yX1-uczCVJwC9t1y6mkxQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-2062164481%3A1732954302336787&ddm=1");
		// WebElement element = driver.findElement(By.id("identifierId"));
		// element.sendKeys("raziyasulthana.mba@gmail.com");
		// element.submit();
		// element.wait();
		// driver.close();

		WebElement username = driver.findElement(By.name("login_userid"));
		username.sendKeys("salma_sulthana");
		WebElement password = driver.findElement(By.name("login_pwd"));
		password.sendKeys("Mohammad@01");
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();

		// element.findElement(By.className("KlpaXd z1asCe MZy1Rb"));
	}

}
