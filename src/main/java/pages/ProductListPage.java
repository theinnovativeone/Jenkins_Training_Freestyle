package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class ProductListPage extends BasePage{
	
	protected final WebDriver driver;
	
	By productPrice = By.cssSelector("div.inventory_item_price");
	By productName = By.cssSelector("div.inventory_item_name");
	
	public ProductListPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductPriceDisplayed() {
		return isElementDisplayed(driver, productPrice);
	}
	
	public boolean isProductNameDisplayed() {
		return isElementDisplayed(driver, productName);
	}
	
	
	
}
