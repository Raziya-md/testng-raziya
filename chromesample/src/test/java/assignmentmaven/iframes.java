package assignmentmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://www.hyrtutorials.com/p/frames-practice.html";
		driver.get(Url);
		System.out.println(Url);

		/*
		 * //switch to iframe-1 driver.switchTo().frame("frm1"); // Select dropdown1
		 * =new Select (driver.findElement(By.id("selectnav1"))); //
		 * dropdown1.selectByIndex(8); Select dropdown2 =new Select
		 * (driver.findElement(By.id("course"))); dropdown2.selectByIndex(3);
		 * driver.switchTo().defaultContent(); Thread.sleep(3000); WebElement textbox=
		 * driver.findElement(By.id("name")); textbox.sendKeys("Raziya");
		 * //driver.close();
		 */

		// switch 2ndframe
		/*
		 * driver.switchTo().frame("frm2"); Select dropdown =new Select
		 * (driver.findElement(By.id("selectnav1"))); dropdown.selectByIndex(3);
		 * Thread.sleep(15000); WebElement
		 * link=driver.findElement(By.linkText("Buy me a coffee"));
		 * //driver.switchTo().alert().accept(); if (link.isDisplayed()) { link.click();
		 * System.out.println("link clicked successfully"); }else {
		 * System.out.println("link not displayed"); }
		 */

		// frame 2
		/*
		 * driver.switchTo().frame("frm2"); Select dropdown =new Select
		 * (driver.findElement(By.id("selectnav1"))); dropdown.selectByIndex(31);
		 * Thread.sleep(3000); WebElement
		 * fstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		 * fstname.sendKeys("Raziya"); WebElement
		 * lastname=driver.findElement(By.xpath("//*[contains(@id,'lastName')]"));
		 * lastname.sendKeys("sulthana"); WebElement
		 * gender=driver.findElement(By.xpath("//input[contains(@id,'femalerb')]"));
		 * gender.click(); WebElement lang
		 * =driver.findElement(By.xpath("//*[@id='englishchbx']")); lang.click();
		 * WebElement email =driver.findElement(By.xpath("//*[@id='email']"));
		 * email.sendKeys("Raziyasulthana.mba@gmail.com"); WebElement pswd
		 * =driver.findElement(By.id("password")); pswd.sendKeys("Raziya");
		 */

		// frame to withinframe/subframe

		driver.switchTo().frame("frm3");
		WebElement textbox = driver.findElement(By.id("name"));
		textbox.sendKeys("Raziya");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Select dropdown1 = new Select(driver.findElement(By.id("selectnav1")));
		dropdown1.selectByIndex(18);
		driver.switchTo().frame("frm2");
		Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
		dropdown.selectByIndex(8);
	}

}
