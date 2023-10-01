package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductListPage;

public class ProductListTests extends BaseTest{
	
	WebDriver driver;
	LoginPage login;
	ProductListPage product;
	
	@BeforeMethod
	public void setup() {
		driver = initialization();
	}
	
	@Test
	public void verifyIfProductPriceDisplayed() {
		
		login = new LoginPage(driver);
		product = new ProductListPage(driver);
		
		login.enterUserName("validUsername");
		login.enterPassword("validPassword");
		login.clickLogin();
		
		boolean productPriceDisplayed = product.isProductPriceDisplayed();
		
		Assert.assertTrue(productPriceDisplayed, "Product price is not displayed on Product listing page!");
	}
	
	@AfterMethod
	public void closeDown() {
		tearDown();
	}
}
