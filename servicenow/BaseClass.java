package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class BaseClass {
	public ChromeDriver driver;
	public static String number;
	@Parameters({"url","username","password"})

	@BeforeMethod
	public void preCondition(String url,String un,String pwd) throws InterruptedException{
		

    driver = new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();

	driver.findElement(By.id("user_name")).sendKeys(un);

	driver.findElement(By.id("user_password")).sendKeys(pwd);

	driver.findElement(By.id("sysverb_login")).click();

	Thread.sleep(3000);

	
	
	}
	@AfterMethod	
	public void postCondition() {
			driver.close();


		}

}
