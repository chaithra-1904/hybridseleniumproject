package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("qwertyuio");
		driver.findElement(By.name("password")).sendKeys("qwertyui");
		driver.findElement(By.xpath("//div[contains(@class,'             qF0y9          ')] [4]")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Instagram"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//driver.close();

	}

}
