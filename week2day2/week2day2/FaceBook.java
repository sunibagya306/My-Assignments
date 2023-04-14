package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Suneetha");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("bagya");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9234567810");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Kishore@07");
        
        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("2");
        driver.findElement(By.xpath("//select[@id='day']")).click();
        
        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Oct");
        driver.findElement(By.xpath("//select[@id='month']")).click();
        
        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
        driver.findElement(By.xpath("//select[@id='year']")).click();
        
        driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
        
	}

}
