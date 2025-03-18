package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ANDORxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://rahulshettyacademy.com/practice-project";
		driver.get(Url);
		System.out.println(Url);
//WebElement signin =driver.findElement(By.xpath("//input[@id='name'and@name='name']"));
//signin.sendKeys("raziya");
		WebElement signin = driver.findElement(By.xpath("//input[@id='name'or@name='name']"));
		signin.sendKeys("raziya");
		WebElement login = driver.findElement(By.xpath("//input[@id='email'and@name='email']"));
		login.sendKeys("raziyasulthana.mba@gmail.com");
		// WebElement login
		// =driver.findElement(By.xpath("//input[@id='email'or@name='email']"));
		// login.sendKeys("raziyasulthana.mba@gmail.com");
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='agreeTerms'and@type='checkbox']"));
		chkbox.click();
		// WebElement chkbox
		// =driver.findElement(By.xpath("//input[@id='agreeTerms'or@type='checkbox']"));
		// chkbox.click();
		WebElement submit = driver.findElement(By.id("form-submit"));
		submit.click();

	}

}
