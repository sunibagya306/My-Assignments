package servicenow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewCaller extends BaseClass {
	@Test

	public void runCreateNewCaller() throws InterruptedException {

		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);

		shadow.findElementByXPath("//div[text()='All']").click();

		// Shadow shadow1 =new Shadow(driver);
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");

		// Shadow shadow2 =new Shadow(driver);
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		shadow.setImplicitWait(5);

		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		shadow.setImplicitWait(30);

		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();

		// driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Gnanvi");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Monvi");
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys("Create New Caller");
		String name = shadow.findElementByXPath("//input[@aria-label='First name']").getAttribute("value");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("suni.bhagya@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Business phone']")).sendKeys("9123456789");
		driver.findElement(By.xpath("//input[@aria-label='Mobile phone']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[text()='Submit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(name + Keys.ENTER);
		System.out.println("First Name : " + name);

		WebElement findElement = driver.findElement(By.xpath("//table[@id='sys_user_table']//td[text()='Gnanvi']"));

		if (findElement.getText().contains("Gnanvi")) {

			System.out.println("caller created");
		} else {
			System.out.println("caller not created");
		}

	}
}
