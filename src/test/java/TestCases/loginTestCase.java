package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LogInPageObject;
import Resources.BaseClass;

public class loginTestCase extends BaseClass{
	
	
	@Test
	public void method1() throws IOException {
		
		browserIntialization();
		
		driver.get("https://login.salesforce.com/?locale=in");         // this driver have scope
		
		// to access the method from another class create object of that class where the method is present
		
		LogInPageObject LPO = new LogInPageObject(driver);
		
		LPO.enterUserName().sendKeys("rahul");
		LPO.enterPassword().sendKeys("test123");
		LPO.clickOnLogin().click();
		LPO.clickOnTryForFree().click();	
}
}