package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	  
		Actions action=new Actions(driver);
		
		WebElement element =driver.findElement(By.xpath("//li/a[text()='brands']"));
	    action.moveToElement(element).perform();
	    
        
        driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
        driver.findElement(By.linkText("L'Oreal Paris")).click();
        System.out.println(driver.getTitle());
        
        driver.findElement(By.xpath("//span[@class='sort-name']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div/span[text()='customer top rated']")).click();
        driver.findElement(By.xpath("//div/span[text()='Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/span[text()='Hair']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li/div/span[text()='Hair Care']")).click();
        driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div/span[text()='Concern']")).click();
        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
        
        WebElement shampoo = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]"));
        WebElement colourpro = driver.findElement(By.xpath("(//span[@class='filter-value'])[2]"));
        System.out.println("applied filters " + shampoo.getText() + " , " +colourpro.getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Paris Colour')]")).click();
        
        Set<String> wh=driver.getWindowHandles();
        List<String> whs=new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        
        WebElement element1 = driver.findElement(By.xpath("//select[@title='SIZE']"));
        Select select =new Select(element1);
        select.selectByIndex(2);
        Thread.sleep(3000);
        WebElement mrp=driver.findElement(By.xpath("(//span[@class='css-u05rr'])[1]"));
        System.out.println("MRP : " + mrp.getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button/span[text()='Add to Bag']")).click();
        
        driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
        driver.switchTo().frame(0);
        
        WebElement total =driver.findElement(By.xpath("//div/span[@class='css-1um1mkq e171rb9k3']"));
        System.out.println("Grand total : " + total.getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        driver.switchTo().window(whs.get(1));
        
        
        
        
        
        
		//driver.close();
	}

}
