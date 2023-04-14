package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[14]")).click();
		
		String title1=driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]")).getText();
		System.out.println("select radio button is " +title1);
		
		String title2=driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible'])[24]")).getText();
		System.out.println("Select the age group " +title2);
		
		driver.close();
		
	}

}
