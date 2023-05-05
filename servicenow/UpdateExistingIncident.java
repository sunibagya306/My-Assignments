package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncident extends BaseClass {
	@Parameters({"updateIncidentNumber"})
	@Test


public void runUpdateExistingIncident(String number)throws InterruptedException { 
		
		
		Shadow shadow =new Shadow(driver);
		shadow.setImplicitWait(30);
	
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("incidents");
		
		//Shadow shadow2 =new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//mark[text()='Incidents']").click();
        shadow.setImplicitWait(5);
        
        WebElement frame=shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.setImplicitWait(30);
		
		driver.findElement(By.xpath("//div[@class='input-group']/input[@placeholder='Search']")).sendKeys(number,Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).clear();
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Updating Incident");
		
		WebElement urgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select dropdown = new Select(urgency);
		dropdown.selectByValue("2");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select dropdown1 = new Select(state);
		dropdown1.selectByValue("2");
		
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
		//driver.findElement(By.xpath("(//span[@class='sn-widget-list-table-cell'])[2]"));
		//driver.findElement(By.xpath("(//span[@class='sn-widget-list-table-cell'])[4]"));
		
		//System.out.println("Incidend updated");
		
	
		
		
     }

}
