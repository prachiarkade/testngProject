package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void selectDropdown(WebElement dropdown, int index) {
		
		Select s = new Select(dropdown);
		s.selectByIndex(index);
	}
	
	
	public static void selectDropdown(WebElement dropdown, String visibletext) {
		
		Select s2 = new Select(dropdown);
		s2.selectByVisibleText(visibletext);
		
		}

	
	public static void handleAssertion(String actualString, String ExpectedString) {
		
		 SoftAssert assertion = new SoftAssert();
			
         String actual = actualString;
         String Expected = ExpectedString;
         
         assertion.assertEquals(actual,Expected);
         
         assertion.assertAll();
		
	}
}
