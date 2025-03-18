package projectmaven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frames_explicits {
	WebDriver driver;
@BeforeMethod
public void Launch_URL() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://ui.vision/demo/webtest/frames/");
	System.out.println(driver.getCurrentUrl());
}
@Test
public void frame_1() {
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_1.html']")));
	WebElement textbox=driver.findElement(By.xpath("//input[@name='mytext1']"));
	textbox.sendKeys("Hello");
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_2.html']")));
	WebElement textbox2=driver.findElement(By.xpath("//input[@name='mytext2']"));
	textbox2.sendKeys("Raziya sulthana");
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_3.html']")));
	WebElement textbox3=driver.findElement(By.xpath("//input[@name='mytext3']"));
	textbox3.sendKeys("Demo_page");
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']")));
	WebElement radio1=driver.findElement(By.xpath("//span[text()='I am a human']"));
	radio1.click();
	WebElement txt_clear=driver.findElement(By.xpath("//span[text()='Clear selection']"));
	txt_clear.click();
	WebElement radio2=driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']"));
	radio2.click();
	WebElement chk1=driver.findElement(By.xpath("//span[text()='Web Testing']"));
	chk1.click();
	WebElement chk2=driver.findElement(By.xpath("//span[text()='Form Autofilling']"));
	chk2.click();
	WebElement chk3=driver.findElement(By.xpath("//span[text()='General Web Automation']"));
	chk3.click();
	WebElement btn_next =driver.findElement(By.xpath("//span[text()='Next']"));
	btn_next.click();
	WebElement txt_1 =driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
	txt_1.sendKeys("India is my country");
	WebElement txt_2 =driver.findElement(By.xpath("//textarea[@class='KHxj8b tL9Q4c']"));
	txt_2.sendKeys("Hyderabad is my native");
	WebElement btn_submit =driver.findElement(By.xpath("//span[text()='Submit']"));
	btn_submit.click();
	WebElement Thankyou_page =driver.findElement(By.xpath("//div[contains(text(),'Thank you for testing the UI.')]"));
	Thankyou_page.getText();
	System.out.println(Thankyou_page.getText());
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_4.html']")));
	WebElement txt_3=driver.findElement(By.xpath("//input[@name='mytext4']"));
	txt_3.sendKeys("Hello India");
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_5.html']")));
	WebElement txt_4=driver.findElement(By.xpath("//input[@name='mytext5']"));
	txt_4.sendKeys("Automation testing");
	WebElement lnk_txt=driver.findElement(By.xpath("//a[text()='https://a9t9.com']"));
	lnk_txt.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
	//WebElement verify_linkpage =driver.findElement(By.xpath("//em[text()='150,000+ users']"));
	//verify_linkpage.getText();
	//System.out.println(verify_linkpage.getText());
}
}
