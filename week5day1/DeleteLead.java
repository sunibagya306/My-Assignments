package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {
    @Test
	public void runDeleteLead() throws InterruptedException {
    	
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.id("ext-gen262")).sendKeys("1");
	
		driver.findElement(By.id("ext-gen266")).sendKeys("91");
		
		driver.findElement(By.id("ext-gen270")).sendKeys("2567897");
	
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		
		driver.findElement(By.id("ext-gen246")).sendKeys("13380");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//driver.findElement(By.linkText("13380")).click();
		
		//driver.findElement(By.linkText("Delete")).click();
		
		//driver.findElement(By.linkText("Find Leads")).click();
		
		//driver.findElement(By.id("ext-gen246")).sendKeys("13380");
		
		//driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//div[text()='No records to display']"));
		
	
		
		
}
}
