package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject {
	
	public WebDriver driver;         // this driver dont have scope
	
	private By username = By.xpath("//input[@id='username']");
	
	private By password = By.xpath("//input[@id='password']");
	
	private By login = By.xpath("//input[@name='Login']");
	
	//private By  tryForFree = By.xpath("//a[@id='forgot_password_link']");
	
	private By tryforfree = By.xpath("//a[@id='signup_link']");
	
	
	public LogInPageObject(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public WebElement enterUserName() {
		
		return driver.findElement(username);      //driver.findElement(By.xpath("//input[@id='username']"}
	}
	
	public WebElement enterPassword() {
		
		return driver.findElement(password);
	}
	
	public WebElement clickOnLogin() {
		
		return driver.findElement(login);
	}
	
/*	public WebElement clickOntryForFree() {
		
		return driver.findElement(tryForFree);
	}*/
	
	public WebElement clickOnTryForFree() {
		
		return driver.findElement(tryforfree);
	}
	
	
	
	
	
	
	
	
}
