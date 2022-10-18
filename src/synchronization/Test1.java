package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		System.out.println(ele.getText());
		
		driver.close();

	}

}
