package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coffeecart_homepage {
WebDriver driver;

@FindBy(xpath="//a[text()='menu']")
WebElement txt_header;

@FindBy(xpath="//div[@data-cy='Espresso']")
WebElement txt_item1;

@FindBy(xpath="//div[@data-cy='Americano']")
WebElement txt_item6;

@FindBy(xpath="//div[@data-cy='Cafe-Breve']")
WebElement txt_item9;

@FindBy(xpath="//div[@class='promo']")
WebElement txt_promo;

@FindBy(xpath="//button[text()='Yes, of course!']")
WebElement btn_offer;

public coffeecart_homepage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}
public void txt_header() {
	txt_header.getText();
	System.out.println(txt_header.getText());
}
public void txt_item1() {
	txt_item1.click();
}
public void txt_item6() {
	txt_item6.click();
}
public void txt_item9() {
	txt_item9.click();
}
public void txt_promo() {
	if (txt_promo.isDisplayed()) {
		System.out.println("promo box displaced");
	}else {
		System.out.println("promo box not displaced");
	}
}
public void btn_offer() {
	btn_offer.click();
}

}
