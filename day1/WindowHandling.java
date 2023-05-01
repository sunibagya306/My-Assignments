package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("//i[@class='fa fa-align-justify']")).click();
        driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
        System.out.println(driver.getTitle());
        Set<String> windowHs = driver.getWindowHandles();
        List<String> whs=new ArrayList<String>(windowHs);
        
            driver.switchTo().window(whs.get(1));
            System.out.println(driver.getTitle());
			driver.switchTo().window(whs.get(0));
			driver.close();
			
			
			
			


      
	}

}
