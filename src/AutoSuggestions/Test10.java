package AutoSuggestions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.xpath("//img[@alt='a'][2]"));
		
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		//typecasting
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+ "," +y+")");
		
		Thread.sleep(3000);
		//ele.click();
		js.executeScript("arguments[0].click();",ele);

	}

}
