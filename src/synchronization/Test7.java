package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement checkbox=driver.findElement(By.xpath("//label[text()='Female']"));
		
		if(checkbox.isSelected())
		{
			System.out.println("Pass : Element is selected");
			checkbox.click();
		}
		else
		{
			System.out.println("Fail : Element is not selected");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
