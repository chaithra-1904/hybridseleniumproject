package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement button=driver.findElement(By.id("twotabsearchtextbox"));
		
		Point loc = button.getLocation();
		int x=loc.getX();
		System.out.println(x +"x co-ordinators");
		
		int y=loc.getY();
		System.out.println(y +"y co-ordinators");
		
		driver.close();

	}

}
