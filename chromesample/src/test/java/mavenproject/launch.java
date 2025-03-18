package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		// System.setProperty("webdriver.edge.driver","C:\\Users\\MUBINA\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		// WebDriver driver= new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // it will open the url in browser
		// driver.get("https://www.youtube.com/");
		driver.getCurrentUrl(); // this method will return the URL value */
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize(); // this will maximize the opened browser to full screen
		driver.getTitle(); // it will return the page title/page name
		System.out.println(driver.getTitle());
		// it will fetch the URL
		String pageURL = driver.getCurrentUrl(); // right process to follow
		String pageTitle = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		if (pageURL.equals("www.facebook.com")) {
			System.out.println("yes this is opening facebook page");
		} else {
			System.out.println("no this is not able to open facebook page");
		}
		if (pageTitle.equals("facebook-login or sign up page")) {
			System.out.println("yes this will open login page");
		} else {
			System.out.println("no this will not open signin page");
		}
		// identifying the object/element using id and enter the data in text box
		driver.findElement(By.id("email")).sendKeys("raziyasulthana.mba@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("raziyamd786");
		driver.findElement(By.name("login")).click();
	}
}
