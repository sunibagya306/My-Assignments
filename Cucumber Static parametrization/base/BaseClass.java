package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static RemoteWebDriver driver;
	public Actions at;
	public String ownerValue;
	public String createdValue;
	public String modifyValue;
	
	@BeforeMethod
	public void preCondition() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("-disable-notifications");
		driver=new ChromeDriver(option);
		at =new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	
			
			driver.get("https://login.salesforce.com");
		
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
