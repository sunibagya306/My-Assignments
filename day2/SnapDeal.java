package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	  
		Actions action=new Actions(driver);
		
		WebElement element =driver.findElement(By.xpath("//span[contains(text(),'Fashion')][1]"));
	    action.moveToElement(element).perform();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        WebElement count =driver.findElement(By.xpath("//span[@class='category-name category-count']"));
        System.out.println("Count of sports shoe : " + count.getText());
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a/div[text()='Training Shoes']")).click();
        driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
        driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("900");
        driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(@class,'arrow btn btn')]")).click();
        
        WebElement navy = driver.findElement(By.xpath("//span[@class='filter-color-tile Navy ']"));
        driver.executeScript("arguments[0].click();", navy);
        WebElement image = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
        action.moveToElement(image).perform();
        WebElement quickview = driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']"));
        driver.executeScript("arguments[0].click();", quickview);
        
        WebElement price = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
        WebElement discount = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
        System.out.println("Shoe price with discount : " + price.getText() + "," + discount.getText());
      
        
        File object =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(object, new File("C:\\Users\\Bagya Suneetha\\Documents\\TESTLEAF\\Automation testing\\screenshort\\snapdeal.jpg"));
       
        driver.quit();
	}
}
	
