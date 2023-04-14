package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		WebElement select=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dd=new Select(select);
		dd.selectByVisibleText("Selenium");
	    
	    driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
	    driver.findElement(By.xpath("//li[text()='India']")).click();
	    
		Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//label[text()='Select City']")).click();
	    driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
	   
	    
	    driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
	    driver.findElement(By.xpath("//li[text()='AWS']")).click();
	    
	    driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	    driver.findElement(By.xpath("//li[text()='English']")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	    driver.findElement(By.xpath("//li[@data-label='Three']")).click();
	    driver.findElement(By.xpath("//li[@data-label='Two']")).click(); 
	    
	    
	    driver.close();
	 
	    
	    
	    
	
		
	}

}
