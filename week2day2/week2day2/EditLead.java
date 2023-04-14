package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		
		driver.findElement(By.id("ext-gen248")).sendKeys("Suneetha");
		
		
	
		
		
		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.linkText("11716")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		
		 driver.findElement(By.className("smallSubmit")).click();
		
		
		
		driver.close();
		
		
}

}

