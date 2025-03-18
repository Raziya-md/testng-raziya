package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dmart_signin {
WebDriver driver;
JavascriptExecutor js= (JavascriptExecutor)driver;
Actions act =new Actions(driver);
Alert alertpopup = driver.switchTo().alert();


@FindBy(xpath="//span[text()='Raziya Sulthana']")
WebElement verify_signinpage;

@FindBy(xpath="//i[@class='dmart-icon-cart header_cartIcon__zG3Zs']")
WebElement cart_icon;

@FindBy(xpath="//p[text()='No items in your cart']")
WebElement verify_cartpage;

@FindBy (xpath="//button[text()='START SHOPPING']")
WebElement btn_startshopping;

@FindBy(xpath="//p[text()='Popular Categories']")
WebElement verify_shoppage;

@FindBy(xpath="//p[text()='New in Gardening']")
WebElement scroll_gardening;

@FindBy(xpath="(//img[@alt='save-for-later-icon'])[1]")
WebElement btn_savelater;

@FindBy(xpath="//p[text()='Clearance Carnival']")
WebElement scroll_clearance;

@FindBy(xpath="//div[text()='Plum Onion & Bhringraj Hair Growth Oil : 100 ml']")
WebElement click_hairoil;

@FindBy(xpath="//div[@style='cursor: crosshair; width: auto; height: auto; font-size: 0px; position: relative; user-select: none;']")
WebElement mousehover_item;

@FindBy(xpath="//label[text()='ADD TO CART']")
WebElement btn_addtocart;

@FindBy(xpath="(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorPrimary mui-style-7boj6v'])[2]")
WebElement btn_increase;

//need to call cart_icon

@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeLarge MuiButton-outlinedSizeLarge MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeLarge MuiButton-outlinedSizeLarge MuiButton-colorPrimary mini-cart_btn_primary__2jiDO mui-style-fgdbxm']")
WebElement btn_viewfullcart;

@FindBy(xpath="//span[text()='My Saved List']")
WebElement click_savedlist;   //verify and click

@FindBy(xpath="//label[text()='Move To Cart']")
WebElement btn_movetocart;

@FindBy(xpath="//button[text()='CONFIRM']")
WebElement btn_confirm;

@FindBy(xpath="//button[text()='Proceed to checkout']")
WebElement btn_proceedtocheckout;

@FindBy(xpath="//p[text()='Select a delivery mode']")
WebElement verify_checkoutpage;

@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium mui-style-1yxmbwk']")
WebElement close_popup;

@FindBy(xpath="//input[@value='hd']")
WebElement radio_homedelivery;

@FindBy (xpath="//button[text()='Add New Address']")
WebElement btn_address;

@FindBy (xpath="//div[text()='Add Address']")
WebElement verify_addresspage;

@FindBy(xpath="//input[@name='pincode']")
WebElement txtbox_pincode;

@FindBy(xpath="//div[@id='areaDropdown']")
WebElement txtbox_area;

@FindBy(xpath="//textarea[@id='areaDropdown']")
WebElement txtbox_locality;

@FindBy(xpath="//textarea[@name='apartmentDetails']")
WebElement txtbox_houseno;

@FindBy(xpath="//input[@name='landmark']")
WebElement txtbox_landmark;

@FindBy(xpath="//input[@name='city']")
WebElement txtbox_city;

@FindBy(xpath="//input[@name='state']")
WebElement txtbox_state;

@FindBy(xpath="//button[text()='Add Address']")
WebElement btn_addaddress;

public  dmart_signin (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void verify_signinpage() {
	try {
		verify_signinpage.getText();
		System.out.println(verify_signinpage.getText());
	}catch(ElementNotInteractableException ex) {
		System.out.println(ex);
	}catch(TimeoutException ex) {
		System.out.println(ex);
	}catch(NoSuchElementException ex) {
		System.out.println(ex);
	}
		}
	public void cart_icon() {
		try {
			cart_icon.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
	}
	public void verify_cartpage() {
		try {
		if(verify_cartpage.isDisplayed()) {
			System.out.println("cartpage displayed successfully");
		}else {
			System.out.println("cartpage not displayed successfully");
		}
	}catch(ElementNotInteractableException ex) {
		System.out.println(ex);
	}catch(TimeoutException ex) {
		System.out.println(ex);
	}catch(NoSuchElementException ex) {
		System.out.println(ex);
	}
	}
	public void btn_startshopping() {
		try {
			btn_startshopping.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
	}
}
	public void verify_shoppage() {
		try {
			verify_shoppage.getText();
			System.out.println(verify_shoppage.getText());
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
	
	}
}
	public void scroll_gardening() {
		try {
			js.executeScript("arguments[0].scrollIntoview(true);",scroll_gardening);
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
	}
	public void btn_savelater() {
		try {
			btn_savelater.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
	}
	public void scroll_clearance() {
		try {
			js.executeScript("arguments[0].scrollIntoview(true);",scroll_clearance);
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
		}
	public void click_hairoil() {
		try {
			click_hairoil.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
	}
	public void mousehover_item() {
		try {
			act.moveToElement(mousehover_item).release().build().perform();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}
	}
	public void btn_addtocart() {
		try {
			btn_addtocart.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
	}
	}
	public void btn_increase() {
		try {
			btn_increase.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
	}
	}
	public void btn_viewfullcart() {
		try {
			btn_viewfullcart.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
	}
	}
	public void click_savedlist() {
		try {
			if(click_savedlist.isDisplayed()) {
				click_savedlist.click();
				System.out.println("savelist displayed successfully");
				}else {
				System.out.println("savelist not displayed successfully");
			}
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}	
		}
	public void btn_movetocart() {
		try {
			btn_movetocart.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}	
	}
	public void btn_confirm() {
		try {
			alertpopup.getText();
			System.out.println(alertpopup.getText());
			btn_confirm.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}	
	}
	public void btn_proceedtocheckout() {
		try {
			btn_proceedtocheckout.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}	
	}
	public void verify_checkoutpage() {
		try {
			String text=verify_checkoutpage.getText();
			if (text.equals("Select a delivery mode")) {
				System.out.println("Select a delivery mode");
			}else {
				System.out.println("Select a delivery mode text not found");
			}
		}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void close_popup() {
		try {
			close_popup.click();
		}catch(ElementNotInteractableException ex) {
			System.out.println(ex);
		}catch(TimeoutException ex) {
			System.out.println(ex);
		}catch(NoSuchElementException ex) {
			System.out.println(ex);
		}	
	}
		public void radio_homedelivery() {
			try {
				radio_homedelivery.click();
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void btn_address() {
			try {
				btn_address.click();
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void verify_addresspage() {
			try {
				if(verify_addresspage.isDisplayed()) {
					System.out.println("verify_addresspage displayed successfully");
					}else {
					System.out.println("verify_addresspage not displayed successfully");
				}
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_pincode() {
			try {
				txtbox_pincode.clear();
				txtbox_pincode.sendKeys("501505");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_area() {
			try {
				txtbox_area.clear();
				txtbox_area.sendKeys("kuntloor");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_locality() {
			try {
				txtbox_locality.clear();
				txtbox_locality.sendKeys("near edamma temple");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_houseno() {
			try {
				txtbox_houseno.clear();
				txtbox_houseno.sendKeys("3-87");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_landmark() {
			try {
				txtbox_landmark.clear();
				txtbox_landmark.sendKeys("shivalayam road");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_city() {
			try {
				txtbox_city.clear();
				txtbox_city.sendKeys("Hyderabad");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}	
		}
		public void txtbox_state() {
			try {
				txtbox_state.clear();
				txtbox_state.sendKeys("telangana");
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}
		}
		public void btn_addaddress() {
			try {
				btn_addaddress.click();
			}catch(ElementNotInteractableException ex) {
				System.out.println(ex);
			}catch(TimeoutException ex) {
				System.out.println(ex);
			}catch(NoSuchElementException ex) {
				System.out.println(ex);
			}
		}
	}
