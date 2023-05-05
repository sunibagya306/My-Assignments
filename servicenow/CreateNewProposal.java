package servicenow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewProposal extends BaseClass {

        @Test
	   
		public void runCreateNewProposal() { 
			
			
			
			
			Shadow shadow = new Shadow(driver);
			shadow.setImplicitWait(30);
			shadow.findElementByXPath("//div[text()='All']").click();
			
			//Shadow shadow1 =new Shadow(driver);
			shadow.setImplicitWait(5);
			shadow.findElementByXPath("//input[@id='filter']").sendKeys("My proposals");
			//shadow.findElementByXPath("//span[text()='Incidents']").click();
			//Shadow shadow2 =new Shadow(driver);
			shadow.setImplicitWait(5);
			shadow.findElementByXPath("//mark[text()='My Proposals']").click();
			shadow.setImplicitWait(5);
			
			
			
			WebElement frame=shadow.findElementByXPath("//iframe[@id='gsft_main']");
			driver.switchTo().frame(frame);
			shadow.setImplicitWait(30);
			
			driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
			
			
			
			String number =driver.findElement(By.xpath("//input[@id='std_change_proposal.number']")).getAttribute("value");
			System.out.println("Proposal Number : " + number);
			
			driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Create proposal");
			
			driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
			
		     List<WebElement> list= shadow.findElementsByXPath("//a[@class='linked formlink']");
			
			boolean boolean1=false;
			for(WebElement result : list) {
				if(result.getText().contains(number)){
					boolean1=true;
					break;
				}
			}
			if(boolean1) {
				System.out.println("Proposal created");
			}else {
				System.out.println("Proposal not created");
			}

	}

}
