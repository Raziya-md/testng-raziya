package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("username")).sendKeys("raziyasulthana.mba@gmail.com");
		driver.findElement(By.name("password")).sendKeys("raziyamd0786");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(3000);
		// WebElement profile_icon =
		// driver.findElement(By.xpath("(//span[@class='x1lliihq x193iq5w x6ikm8r
		// x10wlt62 xlyipyv xuxw1ft'])[1]"));
		// Actions actions = new Actions(driver);
		// actions.moveToElement(profile_icon).perform();
		// profile_icon.click();
		Thread.sleep(3000);
		WebElement more = driver.findElement(By.xpath(
				"//div[@class='x1o5hw5a xaeubzz x1yvgwvq x13fuv20 x178xt8z x9f619 x78zum5 x1q0g3np xaw8158 x1n2onr6 xh8yej3']"));
		Select logout = new Select(more);
		logout.selectByVisibleText("Log out");
		Thread.sleep(2000);
		WebElement logoutButton = driver
				.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']"));
		logoutButton.click();

	}
}
