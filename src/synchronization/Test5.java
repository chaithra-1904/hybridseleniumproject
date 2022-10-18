package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement button=driver.findElement(By.xpath("//label[text()='Female']"));
		
		if(button.isEnabled())
		{
			System.out.println("Pass : Button is enabled");
			button.click();
		}
		else
		{
			System.out.println("Fail : Button is disabled");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
