package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.id("ext-gen282")).sendKeys("suni.bhagya306@gmail.com");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.id("ext-gen246")).sendKeys("11716");
		
		driver.findElement(By.id("ext-gen248")).sendKeys("Suneetha");
		
		
		
		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.linkText("11716")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Duplicate Lead");
		
		 driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.id("viewLead_generalProfTitle_sp"));
		
		driver.close();
		
		
}

}
