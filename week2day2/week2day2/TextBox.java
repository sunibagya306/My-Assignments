package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Suneetha");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("Vizag");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		
		WebElement value1=driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		value1.clear();
		String box=value1.getAttribute("value");
		if(box.isEmpty()){
			System.out.println("Test box is empty");
			
		}
		else {
			System.out.println("Test box is not empty");
		}
		WebElement value2 =driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		
		System.out.println(value2.getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("suni.bhagya306@gmail.com");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Learning Selenium");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Test Editor");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		WebElement value4=driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
		System.out.println(value4.getText());
		
		//span[@class='ui-message-error-detail']
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[3]")).sendKeys("suneetha");
		
		WebElement value5=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		value5.sendKeys("Bagya");
		
		//driver.findElement(By.xpath("(//li[contains(@class,'list-item')][3]")).click();
		
		
		
		
		
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
		
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']")).click();

		
		boolean displayed=driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).isDisplayed();
		System.out.println("keyboard displayed is " +displayed);
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("content information");
		
		
		 driver.close();
		
	    
		
		
	
	
	
	
	
	
	
	
	}
	
	

}
