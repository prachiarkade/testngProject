package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public void browserIntialization() throws IOException {
		
		//To read the file
		
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\ProjectMaven\\src\\main\\java\\Resources\\data.properties");
	// To access the properties file
	// create object of Properties	
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
	String browserName = prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
	
	 driver = new ChromeDriver();
	
	} 
	else if (browserName.equalsIgnoreCase("firefox")) {
		
		// firefox code
	}
	else {
		
		System.out.println("Please enter valis browser name");
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
