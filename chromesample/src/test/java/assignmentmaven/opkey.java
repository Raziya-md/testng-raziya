package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opkey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
// open url
		driver.get("https://university.opkeylms.com/index.php");
		System.out.println(driver.getCurrentUrl());
//enter username
		driver.findElement(By.name("login_userid")).sendKeys("salma_sulthana");
//enter password
		driver.findElement(By.name("login_pwd")).sendKeys("Mohammad@01");
//click loginbutton
		driver.findElement(By.name("login")).click();

		driver.close();
	}

}
