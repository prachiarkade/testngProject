package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LogInPageObject;
import Resources.BaseClass;

public class SignUpTestCase extends BaseClass {

	@Test
	public void verifySignup() throws IOException {
		
		browserIntialization();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		LogInPageObject LPO = new LogInPageObject(driver);
		
		LPO.clickOnTryForFree().click();
		
	}
}
