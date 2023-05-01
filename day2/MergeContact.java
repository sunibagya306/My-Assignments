package week4.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

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
        
      
		
		driver.findElement(By.xpath("//li/a[text()='Merge Contacts']")).click();
        
        driver.findElement(By.xpath("(//a//img)[4]")).click();
        
        Set<String> wh=driver.getWindowHandles();
        List<String> whs=new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        
        driver.findElement(By.xpath("//input[@id='ext-gen27']")).sendKeys("suneetha");
        
        
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        
		
		driver.findElement(By.xpath("//div/a[text()='12426']")).click();
		
		
		driver.switchTo().window(whs.get(0));
		
        driver.findElement(By.xpath("(//a/img)[5]")).click();
        
        Set<String> wh1=driver.getWindowHandles();
        List<String> whs1=new ArrayList<String>(wh1);
        driver.switchTo().window(whs1.get(1));
        
        driver.findElement(By.xpath("//input[@id='ext-gen27']")).sendKeys("suneetha");
        
        driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
        
		
		driver.findElement(By.xpath("//div/a[text()='12427']")).click();
		
		driver.switchTo().window(whs1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
		
		
		//driver.close();
		

	}

}
