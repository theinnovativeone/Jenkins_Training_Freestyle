package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utils.PropertyFileReader;

public class LoginPage extends BasePage{

	protected final WebDriver driver;
	
	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");
	By errorMessage = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]");
	By product = By.xpath("//span[contains(text(),'Products')]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {
		String tempUsername = PropertyFileReader.getTestData(username);
		enterText(driver, usernameField, tempUsername);
	}
	
	public void enterPassword(String password) {
		String tempPassword = PropertyFileReader.getTestData(password);
		enterText(driver, passwordField, tempPassword);
	}
	
	public void clickLogin() {
		clickElement(driver, loginButton); 
	}
	
	public boolean isErrorMessageDispayed() {
		return isElementDisplayed(driver, errorMessage);
	}
	
	public boolean isProductsDispayed() {
		return isElementDisplayed(driver, product);
	}
	
	public boolean isLoginButtonDisplayed() {
		return isElementDisplayed(driver, loginButton);
	}
	
}
