package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
    @Test
	public void runEditLead() throws InterruptedException  {
		
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
		

		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("TestLeaf");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("smallSubmit")).click();
		String Title=driver.getTitle();
		System.out.println(Title);

		


	}

}
