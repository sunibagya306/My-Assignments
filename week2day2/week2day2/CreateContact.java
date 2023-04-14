package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	private static WebElement state;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		
        driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Suneetha");
		
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("K");
		
        driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Suneetha");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("K");
		
        driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Learning Selenium");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("suni.bhagya306@gmail.com");
		
		driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    
	    
		Select dd1=new Select(state);
	    dd1.selectByVisibleText("New York");
	    		
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    
	    driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
	    
	    driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Learn Selenium");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    String Title=driver.getTitle();
		System.out.println(Title);

		
	}
}
