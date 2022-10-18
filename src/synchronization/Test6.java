package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb=driver.findElement(By.name("q"));
		if(searchtb.isDisplayed())
		{
			System.out.println("Pass : Element is displayed");
			searchtb.sendKeys("selenium");
		}
		else
		{
			System.out.println("Fail : Element is not Displayed");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
