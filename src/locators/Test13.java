package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("chaithratn2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Chaithra2@");
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("LinkedIn Login, Sign in | LinkedIn"))
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
