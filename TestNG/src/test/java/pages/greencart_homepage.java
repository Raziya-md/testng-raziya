package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class greencart_homepage {
WebDriver driver;
//WebDriverWait wait =new WebDriverWait(driver,100);

@FindBy (xpath="//div[@class='brand greenLogo']")
WebElement txt_logo;

@FindBy (xpath="//input[@class='search-keyword']")
WebElement txt_serchbox;

@FindBy (xpath="//h4[@class='product-name']")  //   (//h4[@class='product-name'])(//h4[text()='Cauliflower - 1 Kg'])
WebElement txt_productname;

@FindBy (xpath="//a[@class='increment']")
WebElement increment_product;

@FindBy(xpath="//input[@value='4']")
WebElement verify_incrementvalue;

@FindBy (xpath="//a[@class='decrement']")
WebElement decrement_product;

@FindBy(xpath="//input[@class='quantity']")
WebElement verify_decrementvalue;

@FindBy (xpath="//button[text()='ADD TO CART']")
WebElement btn_Addtocart;

@FindBy (xpath="//img[@alt='Cart']")
WebElement lnk_addedtocart;

@FindBy(xpath="(//ul[@class='cart-items'])[1]")
WebElement txt_productadded;

@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
WebElement btn_proceed;

public greencart_homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void txt_logo() {
	String txt=txt_logo.getText();
	if(txt.equals("GREENKART")) {
		System.out.println("logo displaced successfully");
	}else {
		System.out.println("logo not displaced successfully");
	}
	}
public void txt_serchbox() {
	txt_serchbox.clear();
	txt_serchbox.sendKeys("cauliflower");
}
public void txt_productname() {
	if(txt_productname.isDisplayed()) {
		System.out.println("product name displaced successfully");
	}else {
		System.out.println("product name not displaced successfully");
	}
}

public void increment_product() {
	WebDriverWait wait =new WebDriverWait(driver,2500);
			if(increment_product.isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='increment']")));
	        increment_product.click();
	System.out.println("product increment done");
			}else {
				System.out.println("product increment not done");
			}
	
}
public void verify_incrementvalue() {
	if(verify_incrementvalue.isDisplayed()) {
		System.out.println("verify that increment has done");
	}else {
			System.out.println("verify that increment not done");
		}
}
public void decrement_product() {
	if (decrement_product.isDisplayed()) {
	decrement_product.click();
	System.out.println("product decrement done");
	}else {
		System.out.println("product decrement not done");
	}
}
public void verify_decrementvalue() {
	if(verify_decrementvalue.isDisplayed()) {
	System.out.println("verify that decrement has done");
		}else {
			System.out.println("verify that decrement not done");
		}
}
public void btn_Addtocart() {
	btn_Addtocart.click();
}
public void lnk_addedtocart() {
	lnk_addedtocart.click();
}
public void txt_productadded() {
	if(txt_productadded.isDisplayed()) {
		System.out.println("Added product should display");
	}else {
		System.out.println("Added product not displayed");
	}
}

public void btn_proceed() {
	btn_proceed.click();
}
}
