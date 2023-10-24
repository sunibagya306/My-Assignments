package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonWebElements extends BaseClass{
	@When("Click on the NewButton {string}")
	public void clickNewButton(String module) {
		WebElement newbutton = driver.findElement(By.xpath("//span[text()='"+module+"']/following::a[@title='New']"));
		driver.executeScript("arguments[0].click();",newbutton);
	}
	
	@Given("Enter the {string} as {string}")
	public void enterName(String field,String name) {
		driver.findElement(By.xpath("//label[text()='"+field+"']/following::input")).sendKeys(name);
		
	}
	
	@Given ("Enter value in the searchbar as {string}")
	public void enterValueInTheSearchbar(String name) {
	driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys(name+Keys.ENTER);
	}
	
	@And ("Click on the dropdown")
	public void clickOnTheDropdown() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement dropDown= driver.findElement(By.xpath("//span[contains(@class,'slds-icon_container')]"));
		driver.executeScript("arguments[0].click();",dropDown);
		
	}
	
	@And ("Click on the edit in dropdown")
	public void clickOnTheEditInDropdown() {
		WebElement edit=driver.findElement(By.xpath("//a[@title='Edit']"));
		driver.executeScript("arguments[0].click();",edit);
		
		}
	@When("Click on save button")
	public void saveButton() {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", save);
	}
	
	@Then("Verify the toasterMessage is {string} for {string}")
	public void verifyToasterMessage(String scenario,String module){
		
		String name =driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		
		  
	       if (name.contains("was")) {
	           System.out.println(module + " is "+ scenario + " successfully");
	       } 
	}
	

}
