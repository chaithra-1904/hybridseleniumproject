package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("admin");
		
		WebElement ele1=driver.findElement(By.id("password"));
		ele1.sendKeys("Test@123");
		
		Thread.sleep(3000);
		ele.clear();
		
		ele1.clear();
		
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
		
	}

}
