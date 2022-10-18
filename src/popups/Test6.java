package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("moistorizers");
		//driver.findElement(By.xpath("//button[@class='css-xhf9jm']")).click();
		
		WebElement search=driver.findElement(By.name("search-suggestions-nykaa"));
		search.sendKeys("moistorizer");
		search.sendKeys(Keys.ENTER);
		
		

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Estee')]")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		//driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Yes']")).click();


	}

}
