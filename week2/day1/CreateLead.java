package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args)throws InterruptedException { 
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		
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
		
		String Title=driver.getTitle();
		System.out.println(Title);
		

	}

}
	