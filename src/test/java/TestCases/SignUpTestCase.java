package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LogInPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constant;

public class SignUpTestCase extends BaseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {
		
		
		
		LogInPageObject LPO = new LogInPageObject(driver);
		
		LPO.clickOnTryForFree().click();
		
		SignUpPageObject SPO = new SignUpPageObject(driver);
		
		Thread.sleep(1500);
		SPO.enterFirstName().sendKeys(constant.firstname);
		SPO.enterLastName().sendKeys(constant.lastname);
		SPO.enterWorkEmail().sendKeys(constant.email);
		SPO.enterCompanyName().sendKeys(constant.companyname);
		SPO.enterPhoneNumber().sendKeys(constant.phonenumber);
		
		Thread.sleep(1500);
		
		commonMethods.selectDropdown(SPO.SelectJobTitle(), 6);
		
		commonMethods.selectDropdown(SPO.SelectEmployees(),2);
		
		commonMethods.selectDropdown(SPO.SelectCountry(), "United States");
		
		
		
		
		
	}
}
