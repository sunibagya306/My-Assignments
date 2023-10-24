package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AppLauncherWindow extends BaseClass{
	@When("Click on the AppLauncher {string}")
	public void ClickFromAppLauncher(String allApps) {
		WebElement element = driver.findElement(By.xpath("//p[text()='"+allApps+"']"));
		driver.executeScript("arguments[0].click();",element);
	}
	
	

}
