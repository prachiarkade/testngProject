package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	
	public WebDriver driver;
	
	private By FirstName = By.xpath("//input[@name='UserFirstName']");
	
	private By LastName = By.xpath("//input[@name ='UserLastName']");
	
	private By WorkEmail = By.xpath("//input[@name ='UserEmail']");
	
	private By Company = By.xpath("//input[@name ='CompanyName']");
	
	private By PhoneNumber = By.xpath("//input[@name ='UserPhone']");
	
	private By SelectJobTitle = By.xpath("//select[@name ='UserTitle']");
	
	private By SelectEmployees = By.xpath("//select[@name ='CompanyEmployees']");
	
	private By SelectCountry = By.xpath("//select[@name ='CompanyCountry']");
	
	
	public SignUpPageObject(WebDriver driver2) {
		 this.driver = driver2;
	}


	public WebElement enterFirstName() {
		
		return driver.findElement(FirstName);
		
		}
	
	public WebElement enterLastName() {
		
		return driver.findElement(LastName);
	}
	
	public WebElement enterWorkEmail() {
		
		return driver.findElement(WorkEmail);
	}
	
	public WebElement enterCompanyName() {
		
		return driver.findElement(Company);
		}
	
	public WebElement enterPhoneNumber() {
		
		return driver.findElement(PhoneNumber);
	}
	
	public WebElement SelectJobTitle() {
		
		return driver.findElement(SelectJobTitle);
	}
	
	public WebElement SelectEmployees() {
		
		return driver.findElement(SelectEmployees);
	}
	
	public WebElement SelectCountry() {
		
		return driver.findElement(SelectCountry);
	}
	
	
	
	
	

}
