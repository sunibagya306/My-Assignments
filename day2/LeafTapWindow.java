package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapWindow {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	    
        driver.findElement(By.xpath("//button[@id='j_idt88:new']")).click();
        
        Set<String> wh=driver.getWindowHandles();
        List<String> whs=new ArrayList<String>(wh);
        driver.switchTo().window(whs.get(1));
        
        System.out.println("Window opens : " + driver.getTitle());
        driver.close();
        
		driver.switchTo().window(whs.get(0));
		

		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
        
        Set<String> wh1=driver.getWindowHandles();
        List<String> whs1=new ArrayList<String>(wh1);
        driver.switchTo().window(whs1.get(1));
        
        System.out.println("Number of open tabs : " + driver.getTitle());
        driver.close();
		
		driver.switchTo().window(whs1.get(0));
		

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        
        Set<String> wh2=driver.getWindowHandles();
        List<String> whs2=new ArrayList<String>(wh2);
        driver.switchTo().window(whs2.get(1));
        
        System.out.println("Windows except primary : " + driver.getTitle());
        driver.close();
        
		driver.switchTo().window(whs2.get(0));
		

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        
        Set<String> wh3=driver.getWindowHandles();
        List<String> whs3=new ArrayList<String>(wh3);
        driver.switchTo().window(whs3.get(1));
        
        System.out.println("Tabs tp open: " + driver.getTitle());
        driver.close();
        
		driver.switchTo().window(whs3.get(0));
		
        
		
	}	

	}
