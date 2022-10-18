package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("manager");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//title of the application
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		//url of the application
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//verification
		if(acttitle.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
		System.out.println("Pass : home page is displayed");
		}
		else
		{
		System.out.println("Fail : home page not displayed");
		}
		
		driver.close();

	}

}
