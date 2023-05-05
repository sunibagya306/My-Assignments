package week5day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@Test//(dataProvider="fetchData")
	//public void runCreateLead(String CN,String FN,String LN,String phno) {
	public void runCreateLead() throws InterruptedException {	
	
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CN);
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FN);
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LN);
		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
	
		}
}
	



	
		
	}
	


