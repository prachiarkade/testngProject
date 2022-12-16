package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObject;
import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constant;

public class loginTestCase extends BaseClass{
	
	
	@Test
	public void method1() throws IOException {
		
		     
		
		// to access the method from another class create object of that class where the method is present
		
		LogInPageObject LPO = new LogInPageObject(driver);
		
		LPO.enterUserName().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		LPO.clickOnLogin().click();
		LPO.clickOnTryForFree().click();	
		
		
		commonMethods.handleAssertion(LPO.ErrorMessage().getText(),constant.errormessage);
	   
}
	
	
	
	
	
	
	
	
	
	
	
	
}