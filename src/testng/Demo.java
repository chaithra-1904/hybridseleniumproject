package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	@DataProvider
	public Object getData() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="123456789";
		obj[0][1]="123456543";
		
		obj[1][0]="admin";
		obj[1][1]="manager";
		
		obj[2][0]="gaf123";
		obj[2][1]="frt234";
		return obj;
	}
	
	@Test(dataProvider="getData")
	public void tcl(String username, String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		Thread.sleep(8000);
		driver.close();
	}

}
