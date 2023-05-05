package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class FillMandatoryFields extends BaseClass {
	@Test

	public void runFillMandatoryFields()throws InterruptedException { 
		
		
		Shadow shadow =new Shadow(driver);
		shadow.setImplicitWait(10);
		
		
		shadow.findElementByXPath("//div[text()='All']").click();
		
		//Shadow shadow1 =new Shadow(driver);
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge");
		
		//Shadow shadow2 =new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
        shadow.setImplicitWait(5);
        
        WebElement frame=shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.setImplicitWait(5);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		WebElement knowledge = driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']"));
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
		
		Set<String> wh=driver.getWindowHandles();
        List<String> whs=new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td/a[text()='IT']")).click();
        
        driver.switchTo().window(whs.get(0));
        Thread.sleep(3000);
        
        WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
        
		Thread.sleep(3000);
       driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
       Thread.sleep(3000);
		//shadow.findElementByXPath("//input[@id='sys_display.kb_knowledge.kb_category']").sendKeys("Java");
       driver.findElement(By.xpath("(//div[@class='list-item arrow'])[4]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='list-item'])[6]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@class='btn btn-primary category-ok-btn']")).click();
       
        driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("New Knowledge");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
        
   
        
        
		
		
	
        }


}
