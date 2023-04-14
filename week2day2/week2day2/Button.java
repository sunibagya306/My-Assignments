package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		driver.navigate().back();
		
		boolean enabled=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled();
		
		if(enabled){
			System.out.println("button is enabled");
			
		}
		else {
			System.out.println("button is disabled");
		}
		
		WebElement location=driver.findElement(By.xpath("//span[text()='Submit']"));
		System.out.println(location.getLocation());
		
		driver.close();
		
	}
		
}
