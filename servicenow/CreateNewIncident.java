package servicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewIncident extends BaseClass {
    @Test
	public void runCreateNewIncident() throws InterruptedException {
    	
    	Shadow shadow = new Shadow(driver);
    	shadow.setImplicitWait(30);

    	shadow.findElementByXPath("//div[text()='All']").click();
    	shadow.setImplicitWait(5);
    	shadow.findElementByXPath("//input[@id='filter']").sendKeys("incidents");
    	shadow.setImplicitWait(5);
    	shadow.findElementByXPath("//span[@class='item-icon']").click();
    	shadow.setImplicitWait(5);

    	WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
    	driver.switchTo().frame(frame);
    	shadow.setImplicitWait(5);
    	

		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();

		String number = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Incident Number : " + number);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Incident creation");

		// driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).sendKeys("system
		// administrator"+Keys.ENTER);
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String> whs = new ArrayList<String>(wh);
		driver.switchTo().window(whs.get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		driver.switchTo().window(whs.get(0));

		Thread.sleep(3000);
	
    
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		WebElement submit = shadow.findElementByXPath("//button[@id='sysverb_insert_bottom']");
		submit.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number + Keys.ENTER);
		System.out.println("Incident number : " + number);

		driver.findElement(By.xpath("//input[@class='list_header_search  form-control form-control-search']"));

	}

}
