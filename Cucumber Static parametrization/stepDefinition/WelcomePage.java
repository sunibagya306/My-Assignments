package stepDefinition;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	
	@When("Click on the togglemenu")
	public void clickOnTheToggleMenu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
	}
	@And("Click on the viewall button")
	public void clickOnTheViewAllButton() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
	}

}
