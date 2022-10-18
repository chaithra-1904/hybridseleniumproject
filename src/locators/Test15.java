package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("usernameField")).sendKeys("chaithratn2@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("19041999");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Jobs - Recruitment - Job Search -  Employment - Job Vacancies - Naukri.com"))
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
