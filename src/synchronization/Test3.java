package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("email"));
		Dimension s=ele.getSize();
		int h=s.getHeight();
		
		System.out.println(h +"Height of the element");
		
		int w1=s.getWidth();
		System.out.println(w1 +"Width of the element");
		
		driver.close();
		
		

	}

}
