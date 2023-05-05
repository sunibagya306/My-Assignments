package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteTheIncident extends BaseClass{
	@Test

	public void runDeleteTheIncident(){ 
		
		
		
		Shadow shadow =new Shadow(driver);
		shadow.setImplicitWait(30);
	
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("incidents");
		
		//Shadow shadow2 =new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[@class='item-icon']").click();
        shadow.setImplicitWait(5);
        
        WebElement frame=shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.setImplicitWait(30);
		

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0010024");
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		
		
		
		
		
	}

}
