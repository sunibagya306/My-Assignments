package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {
	
	
	@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
		
	}
	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
	
	driver.findElement(By.id("password")).sendKeys(pwd);
	
	 }
	@When("Click on the loginbutton")
	public void loginButton() {
		driver.findElement(By.id("Login")).click();
		
		
	}
	@Then("Verify the login")
	public void verifyLogin() {
		System.out.println(driver.getTitle());
		
	}
	/*@When("Click on the togglemenu")
	public void clickOnTheToggleMenu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
	}
	@And("Click on the viewall button")
	public void clickOnTheViewAllButton() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
	}*/
	/*@Given("Enter the value in the searchbar")
	public void enterTheValueInThesearchBar() {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
	
		
	}
	@And("Click on the legalentities")
	public void clickOnTheLegalEntities() {
		driver.findElement(By.xpath("//span/p/mark[text()='Legal Entities']")).click();
		
	}*/
	@And("Click on the dropDown")
	public void clickOnTheDropDownInTheLegalEntities() {
		driver.findElement(By.xpath("(//*[name()='svg' and @data-key='chevrondown'])[14]")).click();
		
	}
	@When("Click on the createnew")
	public void clickOnTheNewInTheLegalEntitiesDropDown() {
	
	WebElement legalEntity= driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	driver.executeScript("arguments[0].click();",legalEntity);
	}
	@Given("Enter the namefield in new legalentity")
	public void enterTheNameFieldInNewLegalentity() {
		driver.findElement(By.xpath("(//div/input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Suneetha");
	}
	@When("Click on the savebutton in new legalentity")
	public void clickOnTheSaveButtonInNewLegalEntity() {
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
	}
	@Then("Verify the legal entity created")
	public void verifyTheLegalEntityCreated() {
		String name =driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		
		  
	       if (name.contains("was created")) {
	           System.out.println(" Legal Entity created");
	       } else {
	           System.out.println("Legal Entity not created");
	       }
	}
	@Given ("Enter the value in the searchbar in legalentity")
	public void enterTheValueInTheSearchbarInLegalEntity() {
	driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys("Salesforce Automation by Suneetha"+Keys.ENTER);
	}
/*	@And ("Click on the dropdown in the created entity")
	public void clickOnTheDropdownInTheCreatedEntity() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement dropDown= driver.findElement(By.xpath("//span[contains(@class,'slds-icon_container')]"));
		driver.executeScript("arguments[0].click();",dropDown);
		
	}
	@And ("Click on the edit in the dropdown")
	public void clickOnTheEditInTheDropdown() {
		WebElement edit=driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.LegalEntity.Edit']"));
		driver.executeScript("arguments[0].click();",edit);
	}*/
	@Given ("Enter the companyname in the edit legalentity")
	public void enterTheCompanyNameInEditLegalentity() {
		WebElement company= driver.findElement(By.xpath("//input[@name='CompanyName']"));
		company.clear();
		company.sendKeys("Testleaf");
	}
	@Given ("Enter the description in the edit legalentity")
	public void enterTheDescriptionInTheEditLegalEntity() {
		WebElement description =driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		description.clear();
		description.sendKeys("Salesforce");
		
	}
	@When ("Click on the status in edit legalentity")
	public void clickOnTheStatusInEditLegalEntity() {
		WebElement status= driver.findElement(By.xpath("//button[contains(@aria-label,'Status')]"));
		driver.executeScript("arguments[0].click();",status);
	}
	@Then ("Select the status as active")
	public void selectTheStatusAsActive() {
		WebElement active= driver.findElement(By.xpath("//span[text()='Active']"));
		driver.executeScript("arguments[0].click();",active);
	}
	
	
	/*@When("Click on save button")
	public void saveButton() {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", save);
	}*/
	@Given("Click on displayed legal entity")
	public void clickOnDisplayedLegalEntity() {
	 WebElement name= driver.findElement(By.xpath("//a[contains(@class,'slds-truncate outputLookup')]"));
    driver.executeScript("arguments[0].click();",name);
	}
	
	
	@Then("Verify the status as Active")
	public void VerifyStatusAsActive() {
		 String status1 =driver.findElement(By.xpath("//lightning-formatted-text[text()='Active']")).getText();
	  	   
         if (status1.equals("Active")) {
             System.out.println(" Status verified");
         } else {
             System.out.println(" Status not verified");
         }
       
	}
	@Given("Enter the value in the opportunity searchbar")
	public void enterTheValueInTheOpportunitySearchBar() {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Opportunities");
	
		
	}
	@And("Click on the Opportunity")
	public void clickOnTheOpportunity() {
		driver.findElement(By.xpath("//span/p/mark[text()='Opportunities']")).click();
		
	}
	@When("Click on the newbutton")
	public void clickOnTheNewButtonInOpportunity() {
	
	WebElement newOpp= driver.findElement(By.xpath("//div[text()='New']"));
	driver.executeScript("arguments[0].click();",newOpp);
	}
	@Given ("Enter the value in the opportunity namefield")
	
	public void enterTheValueInTheOpportunityNameField() {
	WebElement oppName = driver.findElement(By.xpath("//input[@name='Name']"));
	String name=("Salesforce Automation by Suneetha");
	oppName.sendKeys(name);
	oppName.getText();
   // String name= driver.findElement(By.xpath("//input[@name='Name']")).getText();
	System.out.println(name);
    
	}
	@And ("Click on the Calendar symbol in close date")
	public void clickOnTheCalendarSymbolInCloseDate() {
	 WebElement dropDown2 = driver.findElement(By.xpath("//input[@name='CloseDate']"));
	    dropDown2.click();
	}
	@Then("Select todays date in calendar")
	public void selectTodaysDateInCalendar() {
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
	}
	@And ("Click on the Stage Field")
	public void clickOnTheStageField() {
	 WebElement stage = driver.findElement(By.xpath("//button[contains(@aria-label,'Stage')]"));
	    stage.click();
	}
	@Then("Select stage field as need analysis")
	public void selectStageFieldAsNeedAnalysis() {
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}
	@When("Click on save button in the opportunity")
	public void saveButtonInTheOpportunity() {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", save);
	}
	@Then("Verify the Opportunity was created")
	public void VerifyTheOpportunityWasCreated() {
		String name =driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		
		  
	       if (name.contains("was created")) {
	           System.out.println(" Opportunity created");
	       } else {
	           System.out.println("Opportunity not created");
	       }
	}
	@Given ("Enter the value in the searchbar in Opportunity")
	public void enterTheValueInTheSearchbarInOpportunity() {
	driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys("Salesforce Automation by Suneetha"+Keys.ENTER);
	}
	/*@And ("Click on the dropdown in the created Opportunity")
	public void clickOnTheDropdownInTheOpportunity() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement dropDown= driver.findElement(By.xpath("//span[contains(@class,'slds-icon_container')]"));
		driver.executeScript("arguments[0].click();",dropDown);
		
	}
	@And ("Click on the edit in the dropdown in opportunity")
	public void clickOnTheEditInTheDropdownInOpportunity() {
		WebElement edit=driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Opportunity.Edit']"));
		driver.executeScript("arguments[0].click();",edit);
		
		}*/
	
	
	@Then("Select tomorrows date in calendar")
	public void selectTomorrowsDateInCalendar() {
		driver.findElement(By.xpath("(//td[contains(@class,'slds-is-today')]/following-sibling::td)[1]")).click();
	}

	@Then("Select stage field as perception analysis")
	public void selectStageFieldAsPerceptionAnalysis() {
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
	}
	@When ("Click on the deliver status in edit Opportunity")
	public void clickOnTheDeliverStatusInEditOpportunity() {
		WebElement status= driver.findElement(By.xpath("//button[contains(@aria-label,'Delivery/Installation Status')]"));
		driver.executeScript("arguments[0].click();",status);
	}
	@Then ("Select the deliver status as inprogress")
	public void selectTheDeliverStatusAsInprogress() {
		WebElement active= driver.findElement(By.xpath("//span[@title='In progress']"));
		driver.executeScript("arguments[0].click();",active);
	}
	@Given ("Enter the description in edit opportunity")
	public void enterTheDescriptionInEditOpportunity() throws InterruptedException {
		Thread.sleep(2000);
    //action.scrollByAmount(0, 250).perform();
		
	WebElement des = driver.findElement(By.xpath("//div/textarea[@class='slds-textarea']"));
	des.sendKeys("Salesforce");
	at.scrollToElement(des).perform();
	}
	/*//@Given("Click on displayed Opportunity")
	//public void clickOnDisplayedOpportunity() {
	// WebElement name= driver.findElement(By.xpath("//a[contains(@class,'slds-truncate outputLookup')]"));
    //driver.executeScript("arguments[0].click();",name);
	//}*/
	@And("Click on the Opportunity to verify")
	public void clickOnTheOpportunityToVerify() {
		WebElement tab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",tab);
	}
	
	
	@Then("Verify the status as perception analysis")
	public void VerifyStatusAsPerceptionAnalysis() {
		 String status1 =driver.findElement(By.xpath("//span[text()='Perception Analysis']")).getText();
	  	   
         if (status1.contains("Analysis")) {
             System.out.println(" Status verified");
         } else {
             System.out.println(" Status not verified");
         }
	}
	@And ("Click on the Delete in the dropdown in opportunity")
	public void clickOnTheDeleteInTheDropdownInOpportunity() {
		WebElement delete=driver.findElement(By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.Opportunity.Delete']"));
		driver.executeScript("arguments[0].click();",delete);
		
		}
	@And ("Click on the Delete in opportunity")
	public void clickOnTheDeleteInOpportunity() {
		WebElement delete=driver.findElement(By.xpath("//span[text()='Delete']"));
		driver.executeScript("arguments[0].click();",delete);
		
		}
	
	@Then("Verify the opportunity is deleted")
	public void VerifyOpportunityIsDeleted() {
			String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
			if (text.contains("deleted")) {
				System.out.println(" Deleted successfully");
			} else {
				System.out.println(" Not deleted ");
			}
	}
	
	@When("Click on the newbutton InServiceTerritories")
	public void clickOnTheNewButtonInServiceTerritories() {
	
	WebElement newOpp= driver.findElement(By.xpath("//div[text()='New']"));
	driver.executeScript("arguments[0].click();",newOpp);
	}
	
	@Given ("Enter the value in the Service Territories namefield")
	
	public void enterTheValueInTheServiceTerritoriesNameField() {
	WebElement stName = driver.findElement(By.xpath("//input[@name='Name']"));
	String name=("Salesforce Automation by Suneetha");
	stName.sendKeys(name);
	stName.getText();
   // String name= driver.findElement(By.xpath("//input[@name='Name']")).getText();
	System.out.println(name);
    
	}
	@And ("Click on the Operating Hours")
	public void clickOnTheOperatingHours() {
	 WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Operating Hours...']"));
	    search.click();
	}
	@Then("Select first option in operating hours")
	public void firstOptionInOperatingHours() {
		driver.findElement(By.xpath("//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']")).click();
	}
	@And("Check on the Active field")
	public void checkOnTheActiveField() {
	 WebElement stage = driver.findElement(By.xpath("//input[@name='IsActive']"));
	    stage.click();
	}
	@Given ("Enter the City in City Field")
	public void cityInCityField() {
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Singapore");
	}
	@Given ("Enter the State in State Field")
	public void stateInStateField() {
	driver.findElement(By.xpath("//input[@name='province']")).sendKeys("Pandan gardens");
	}
	@Given ("Enter the Country in Country Field")
	public void countryInCountryField() {
	driver.findElement(By.xpath("//input[@name='country']")).sendKeys("Singapore");
	}
	@Given ("Enter the PostalCode")
	public void postalCode() {
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600416");
	}
	/*@When("Click on save button in the ServiceTerritories")
	public void saveButtonInTheServiceTerritories() {
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();", save);
	}
	@Then("Verify the ServiceTerritories was created")
	public void VerifyTheServiceTerritoriesWasCreated() {
		String name =driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		
		  
	       if (name.contains("was created")) {
	           System.out.println(" ServiceTerritories created");
	       } else {
	           System.out.println("ServiceTerritories not created");
	       }
	}*/
	
	/*@And ("Click on the dropdown")
	public void clickOnTheDropdown() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement dropDown= driver.findElement(By.xpath("//span[contains(@class,'slds-icon_container')]"));
		driver.executeScript("arguments[0].click();",dropDown);
		
	}
	
	@And ("Click on the edit in dropdown")
	public void clickOnTheEditInDropdown() {
		WebElement edit=driver.findElement(By.xpath("//a[@title='Edit']"));
		driver.executeScript("arguments[0].click();",edit);
		
		}*/
	
	@Then("Verify the System Information Created By")
	public void systemInformationCreatedBy() {
		createdValue =driver.findElement(By.xpath("(//span[text()='Created By']/following::span/slot)[2]")).getText();
		String createdValue1 =driver.findElement(By.xpath("(//span[contains(@class,'test-id__field-value')])[8]")).getText();
		System.out.println("Created By :" + createdValue + createdValue1);
	
	}
	@Then("Verify the System Information LastModified By")
	public void systemInformationLastModifiedBy() {
		modifyValue =driver.findElement(By.xpath("(//div/span[text()='Last Modified By']/following::span/slot)[2]")).getText();
		String modifyValue1 =driver.findElement(By.xpath("(//span[contains(@class,'test-id__field-value')])[8]")).getText();
		System.out.println("Last Modified By :" + modifyValue + modifyValue1);
	}
	
	@Then("Verify the Owner")
	public void Owner() {
		ownerValue =driver.findElement(By.xpath("(//span[text()='Owner']/following::span/slot)[2]")).getText();
		System.out.println("Owner :" +ownerValue);
		
		
		
	}
	@Then("Verify Owner, Created By and Modified By are matches")
	//public void namesShouldMatch(String ownerValue,String createdValue,String modifyValue) {
		public void namesShouldMatch() {
	/*	createdValue =driver.findElement(By.xpath("(//span[text()='Created By']/following::span/slot)[2]")).getText();
		modifyValue =driver.findElement(By.xpath("(//div/span[text()='Last Modified By']/following::span/slot)[2]")).getText();
		ownerValue =driver.findElement(By.xpath("(//span[text()='Owner']/following::span/slot)[2]")).getText();*/

	       if (ownerValue.matches(createdValue=modifyValue)) {
	           System.out.println("All Values Are Matching");
	          
	       } else {
	           System.out.println("Not Matched");
	       }
	
	     }
	
	@Given ("Change the Country Name")
	public void changeTheCountryName() {
	WebElement countryUpdate = driver.findElement(By.xpath("//input[@name='country']"));
	countryUpdate.clear();
	countryUpdate.sendKeys("North America");
	}
	@Then("Verify Last Modified date")
	public void lastModifiedDate() {
		String modifydate =driver.findElement(By.xpath("//span[@class='slds-truncate uiOutputDateTime']")).getText();
		System.out.println("Last Modified Date: " + modifydate);
	}
	
	     
}

