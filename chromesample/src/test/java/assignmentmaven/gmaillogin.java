package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class gmaillogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\MUBINA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
driver.get("https://www.google.com/gmail/");
		System.out.println(driver.getCurrentUrl());
	driver.findElement(By.name("identifier")).sendKeys("raziyasulthana.mba@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("password")).sendKeys("raziyamd786");
		driver.findElement(By.name("login")).click(); 

	}

}
