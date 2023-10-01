package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class LogoutPage extends BasePage{

	protected final WebDriver driver;
	
	By mainMenu = By.xpath("//button[@id='react-burger-menu-btn']");
	By logoutOption = By.xpath("//a[@id='logout_sidebar_link']");
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void logout() throws InterruptedException {
		clickElement(driver, mainMenu);
		clickElement(driver, logoutOption);
	}
}
