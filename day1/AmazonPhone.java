package week4.day1;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhone {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        //serach for the phones
        List<WebElement> phonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        
        //forloop with size of list
        for(int i=0;i<phonePrice.size();i++) {
        	System.out.println(phonePrice.get(i).getText());
        }
        //ele.get(i).getText()
        //print

	}

}
