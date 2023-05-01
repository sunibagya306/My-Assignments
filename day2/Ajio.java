package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags" +Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
	   
		List<WebElement> list =driver.findElements(By.xpath("//div[@class='brand']"));
	    List<String> brands=new ArrayList<String>();
	    for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			brands.add(text);
	    }
	    System.out.println("List of brands " + brands);
	    
	    Thread.sleep(3000);
        
	    List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> names=new ArrayList<String>();
		for (int i = 0; i <list1.size(); i++) {
			String text = list1.get(i).getText();
			names.add(text);
		}
		System.out.println("Names of bags " + names);
	}

}
