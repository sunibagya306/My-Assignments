package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{
	@Test
public void runDuplicateLead() throws InterruptedException { 
		
		
		
driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suneetha");
	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suneetha");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("NonIT");
		
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
		
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suni.bhagya306@gmail.com");
	    
	   
	    driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
	    WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1 = new Select(state);
		Thread.sleep(3000);
		dd1.selectByVisibleText("New York");
		
	    
	    driver.findElement(By.className("smallSubmit")).click();
		
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTap");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bagya");
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		
		String Title2=driver.getTitle();
		System.out.println(Title2);

		
	
		
}

}
