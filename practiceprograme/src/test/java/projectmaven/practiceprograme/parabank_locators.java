package projectmaven.practiceprograme;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parabank_locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://parabank.parasoft.com/parabank/index.htm";
		driver.get(URL);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
//locators
				
		/* WebElement login=driver.findElement(By.linkText("Register"));
		login.click();
		WebElement firstname=driver.findElement(By.id("customer.firstName"));
		firstname.sendKeys("Raziya");
		WebElement lastname=driver.findElement(By.id("customer.lastName"));
		lastname.sendKeys("sulthana");
		WebElement address=driver.findElement(By.id("customer.address.street"));
		address.sendKeys("3-87,kuntloor");
		WebElement city=driver.findElement(By.id("customer.address.city"));
		city.sendKeys("Hyderabad");
		WebElement state=driver.findElement(By.id("customer.address.state"));
		state.sendKeys("Hyderabad");
		WebElement zipcode=driver.findElement(By.id("customer.address.zipCode"));
		zipcode.sendKeys("501505");
		WebElement phone=driver.findElement(By.id("customer.phoneNumber"));
		phone.sendKeys("6305064313");
		WebElement ssn=driver.findElement(By.id("customer.ssn"));
		ssn.sendKeys("+91");
		WebElement username=driver.findElement(By.id("customer.username"));
		username.sendKeys("Raziya");
		WebElement password=driver.findElement(By.id("customer.password"));
		password.sendKeys("Raziya0786");
		WebElement confirmpassword=driver.findElement(By.id("repeatedPassword"));
		confirmpassword.sendKeys("Raziya0786");
		WebElement register=driver.findElement(By.xpath("//input[@value='Register']"));
		register.click();
		
		WebElement username1 =driver.findElement(By.xpath("//input[@name='username']"));
		username1.sendKeys("Raziya");
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("Raziya0786");
		WebElement login1=driver.findElement(By.xpath("//input[@type='submit']"));
		login1.click();*/
		
		//parent to child xpath 
		/*WebElement solutions =driver.findElement(By.xpath("//ul[@class='leftmenu']//li[@class='Solutions']"));
		if (solutions.isDisplayed()) {
			System.out.println("solutions is displayed successfully");
		}else {
			System.out.println("solutions is not displayed successfully");
		}*/
		
		//child to parent only to display
		WebElement solutions =driver.findElement(By.xpath("//li[@class='Solutions']//parent::ul"));
		if (solutions.isDisplayed()) {
			System.out.println("solutions is displayed successfully");
		}else {
			System.out.println("solutions is not displayed successfully");
		}
		WebElement aboutus =driver.findElement(By.linkText("About Us"));
				if (aboutus.isDisplayed()) {
					aboutus.click();
			System.out.println("aboutus is clicked successfully");
		}else {
			System.out.println("aboutus is not clicked successfully");
		}
				
				WebElement link =driver.findElement(By.linkText("www.parasoft.com"));
				if (link.isDisplayed()) {
					link.click();
			System.out.println("linked is clicked successfully");
		}else {
			System.out.println("linked is not clicked successfully");
		}
				//parent to child xpath
				WebElement contactus =driver.findElement(By.xpath("//li[@class='nav-contact-us']//a[@class='b-button alt-outline']"));
				if (contactus.isDisplayed()) {
					contactus.click();
			System.out.println("contact linked is clicked successfully");
		}else {
			System.out.println("contact linked is not clicked successfully");
		}
				Thread.sleep(2000);
				
				WebElement email =driver.findElement(By.id("email-7e18a454-1995-49f5-a907-ddc7be450646"));	
				email.sendKeys("raziyasulthana.mba@gmail.com");
				WebElement firstname =driver.findElement(By.id("firstname-7e18a454-1995-49f5-a907-ddc7be450646"));	
				firstname.sendKeys("Raziya");
				WebElement lastname =driver.findElement(By.id("lastname-7e18a454-1995-49f5-a907-ddc7be450646"));	
				lastname.sendKeys("sulthana");
				WebElement company =driver.findElement(By.id("company-7e18a454-1995-49f5-a907-ddc7be450646"));	
				company.sendKeys("OMC");
				WebElement jobtitle=driver.findElement(By.id("jobtitle-7e18a454-1995-49f5-a907-ddc7be450646"));	
				jobtitle.sendKeys("Manager");
				WebElement phone=driver.findElement(By.id("phone-7e18a454-1995-49f5-a907-ddc7be450646"));	
				phone.sendKeys("6305064313");
				//Select dropdown =new Select(driver.findElement(By.xpath("//select[@id='country-7e18a454-1995-49f5-a907-ddc7be450646']//option[@value='Iceland']//following-sibling ::option[@value='India']")));
				//dropdown.selectByValue("India");
				Select dropdown =new Select(driver.findElement(By.id("country-7e18a454-1995-49f5-a907-ddc7be450646")));	
				dropdown.selectByValue("India");
				Thread.sleep(2000);
				WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));	
				submit.click();
			
				driver.findElement(By.id("q-messenger-frame"));
		         //Switch to the frame
		         driver.switchTo().frame(2)	;
		         
				/*WebElement alert = driver.findElement(By.id(""));
				if (alert.isDisplayed()) {
					alert.click();
					System.out.println("alert button is clicked successfully");
				}else {
					System.out.println("alert button is not clicked successfully");
				}*/
				Thread.sleep(3000);
				//handling the alert popup window using alert class
				Alert popup =driver.switchTo().alert();
				//popup.accept();   //it will click on default button in the alert
				//popup.dismiss();    //it will close the popup window  */
			
	}

}
