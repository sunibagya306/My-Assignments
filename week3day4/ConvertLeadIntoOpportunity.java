package week3day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConvertLeadIntoOpportunity {
	
	public static void main(String[] args)throws InterruptedException, IOException { 
		//Launch the browser
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		//load the url
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//to maximize the web page
		driver.manage().window().maximize();
		
		//Locate the username element and enter the username
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username.sendKeys("suni.bhagya306@gmail.com");
		
		 //Locate the password element and enter the password
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.sendKeys("Kishore@51");
		
		//Click on login button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Login"))).click();
		
		//Click on toggle menu
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']"))).click();
		
		//Click on View all
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']"))).click();
		
		//Click on Marketing
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span/p[text()='Marketing']"))).click();
		
		//Click on Leads
		WebElement leads = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leads']")));
		//leads.click();
		driver.executeScript("arguments[0].click();",leads);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='New']")));
		
		//Click on New
		WebElement newLead= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='New']")));
		newLead.click();
		//driver.executeScript("arguments[0].click();",newLead);
		
		
		//Click on salutation
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@aria-label,'Salutation')]"))).click();
		
		//Select Mrs
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Mrs.']"))).click();
		
		//Enter a name for the First name field
		WebElement first = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
		first.sendKeys("Suneetha");
		
		//Enter a name for the Last name field
		WebElement last = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
		last.sendKeys("Kata");
		
		//Enter a name for the Company field
		WebElement company = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Company']")));
		company.sendKeys("TestLeaf");
		
		//Click on save
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
		
		//Click on Leads
		WebElement leads1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leads']")));
		driver.executeScript("arguments[0].click();",leads1);
		
		//Search for the specific name
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")));
		search.sendKeys("Suneetha Kata");
		search.sendKeys(Keys.ENTER);
		//driver.executeScript("arguments[0].click();",search);
		
		//Select the specific name
		WebElement name =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@class,'slds-truncate')])[1]")));
	    //name.click();
	    driver.executeScript("arguments[0].click();",name);
	    
	    // not able click the dropdown that's why I use thread.sleep
	    Thread.sleep(2000);
	    // Click the dropdown
		WebElement dropDown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Show more actions'])[2]")));
		//wait.until(ExpectedConditions.stalenessOf(dropDown));
		driver.executeScript("arguments[0].click();",dropDown);
		
		// In dropdown select convert
		WebElement convert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Convert']")));
		driver.executeScript("arguments[0].click();",convert);
		
		// Click on radio button in Opportunity name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='slds-radio_faux'])[5]"))).click();
		
		
		// Clear and Enter a name for the Opportunity name field
		WebElement name2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Opportunity Name']/following::input")));
		wait.until(ExpectedConditions.elementToBeClickable(name2));
		name2.clear();
		name2.sendKeys("Kata");
		
		// Click on Convert button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_brand']"))).click();
		
		// Click on Go to Leads button.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='slds-button slds-button_brand']"))).click();
		
		//Search for the specific name(Suneetha kata)
		WebElement search1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")));
		search1.clear();
		search1.sendKeys("Suneetha Kata");
		search1.sendKeys(Keys.ENTER);
		
		//Verify the page as no items to display
		String page =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='uiScroller scroller-wrapper scroll-bidirectional native']"))).getText();
		
		  
	       if (page.contains("No items to display.")) {
	           System.out.println("items displayed");
	       } else {
	          System.out.println("Items not displayed");
	      }
		
	       
	     // Click on Opportunities  
	     WebElement opportunities = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Opportunities']")));
	     //opportunities.click(); 
	     driver.executeScript("arguments[0].click();",opportunities);
	     
	   //Search for the specific name(kata)
	     WebElement search2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")));
	     //search2.clear();
	     search2.sendKeys("Kata");
	     search2.sendKeys(Keys.ENTER);
	     
	  
	     
	     //Thread.sleep(2000);
	    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class,'slds-grid slds')])[3]"))).click();
	   // WebElement name3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'slds-grid slds')])[3]")));
		//wait.until(ExpectedConditions.stalenessOf(name3));
		//wait.until(ExpectedConditions.elementToBeClickable(name3));
		//name3.click();
		//driver.executeScript("arguments[0].click();",name3);
		
	    // Click on specific name(Kata)
		WebElement name4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Kata']")));
		driver.executeScript("arguments[0].click();",name4);
		
		
		//Get snap shot of webpage
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//slot[@name='primaryField'])[2]"))).getText();	
		
		//To take screenshot of complete web page
		File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		
		//create a folder in project
		File destination = new File("./Screenshots/snap1.jpg");
		
		//Image saved in Destination
		FileUtils.copyFile(sourceFile, destination);
		
		
		System.out.println("Screenshot save successfully");
		
		 // close the browser
		driver.close();
	}

}
