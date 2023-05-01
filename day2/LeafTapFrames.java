package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapFrames {
	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();
			
		    driver.switchTo().frame(0);
	        driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
	        WebElement element1=driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']"));
	        System.out.println(element1.getText());
	        driver.switchTo().defaultContent();
	        
	        List<WebElement> frames =driver.findElements(By.tagName("iframe"));
	        System.out.println("Total frames : " + frames.size());
	        
	        WebElement outerFrame = driver.findElement(By.xpath("(//iframe)[3]"));
	        driver.switchTo().frame(outerFrame);
	        driver.switchTo().frame("frame2");
	        
	        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	        WebElement element2=driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']"));
	        System.out.println(element2.getText());
	        driver.switchTo().defaultContent();
	        
	        
	        
		}
}
