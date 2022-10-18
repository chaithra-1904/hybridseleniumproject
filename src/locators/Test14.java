package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys("Banaglore");
		driver.findElement(By.id("dest")).sendKeys("Mangalore");
		driver.findElement(By.id("onward_cal")).sendKeys("21Sep2022");
		driver.findElement(By.xpath("(//button[@id='search_btn'])")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India"))
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
