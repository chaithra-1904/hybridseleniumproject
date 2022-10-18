package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("chaithratn2@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Chaithra2@");
		driver.findElement(By.id("submit-id-submit")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Online Courses - Learn Anything, On Your Schedule | Udemy"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();

	}

}
